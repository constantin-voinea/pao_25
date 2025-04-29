package view;


import controller.EmployeeController;
import domain.Employee;
import exceptions.CustomException;

import java.util.Scanner;

public class ClientApp {

    private final EmployeeController employeeController = new EmployeeController();
    private final ClientApp.UserInteraction userInteraction = new UserInteraction();

    public static void main(String[] args) {
        ClientApp clientApp = new ClientApp();
        while (true) {
            clientApp.showMenu();
            int option = clientApp.readOption();
            clientApp.execute(option);
        }
    }

    private void showMenu() {
        System.out.println("""
                ------------------------------------------------------------------------------
                Welcome to Employee Management Platform (EMP)
                What do you want to do?
                1. add employee
                2. show all employees
                3. find employee by CNP
                4. update employee details
                5. remove employee
                0. exit
                """);
    }

    private int readOption() {
        return userInteraction.readOption();
    }

    private void execute(int option) {
        switch (option) {
            case 1: {
                // add employee
                Employee employee = userInteraction.readEmployeeDetails();
                employeeController.addEmployee(employee);
                break;
            }
            case 2: {
                // list all employees
                employeeController.listAllEmployees();
                break;
            }
            case 3: {
                // find employee by cnp
                String cnp = userInteraction.inputCnp();
                employeeController.findEmployeeById(cnp);
                break;
            }
            case 4: {
                // update employee details
                Employee employee = userInteraction.readEmployeeDetails();
                employeeController.updateEmployeeDetails(employee);
                break;
            }
            case 5: {
                // remove employee
                String cnp = userInteraction.inputCnp();
                employeeController.removeEmployee(cnp);
                break;
            }
            case 0: {
                userInteraction.closeScanner();
                System.exit(0);
            }
        }
    }


    // use an inner class to handle user interaction
    private static class UserInteraction {

        private final Scanner scanner = new Scanner(System.in);

        int readOption() {
            int option = -1;
            do {
                try {
                    option = readInt();
                } catch (CustomException exception) {
                    System.out.println("Invalid option! Try again!");
                }
            } while (option < 0 || option > 5);
            return option;
        }

        Employee readEmployeeDetails() {
            System.out.print("Employee CNP: ");
            String cnp = scanner.next();
            System.out.print("Employee firstname: ");
            String firstName = scanner.next();
            System.out.print("Employee lastname: ");
            String lastName = scanner.next();
            System.out.println("Employee age: ");
            int age = readAge();
            return new Employee(cnp, firstName, lastName, age);
        }

        String inputCnp() {
            System.out.print("Employee CNP: ");
            return scanner.next();
        }

        void closeScanner() {
            scanner.close();
        }

        private int readAge() {
            int age = -1;
            do {
                try {
                    age = readInt();
                } catch (CustomException exception) {
                    System.out.println("Invalid input for employee age! Try again!");
                }
            } while (age < 0);
            return age;
        }

        private int readInt() throws CustomException {
            String line = scanner.next();
            if (line.matches("^\\d+$")) {
                return Integer.parseInt(line);
            } else {
                throw new CustomException("Invalid number");
            }
        }
    }

}
