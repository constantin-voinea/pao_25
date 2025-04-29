package controller;


import domain.Employee;
import exceptions.CustomException;
import service.EmployeeService;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService = new EmployeeService();

    public void removeEmployee(String cnp) {
        try {
            employeeService.removeEmployeeById(cnp);
            System.out.println("Removed employee with id: " + cnp);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateEmployeeDetails(Employee employee) {
        try {
            employeeService.updateDetailsForEmployee(employee);
            System.out.println("Updated employee: " + employee);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listAllEmployees() {
        System.out.println("Currently registered employees: ");
        List<Employee> employees = employeeService.getAllEmployees();
        if (employees.isEmpty()) {
            System.out.println("No employees registered yet!");
        } else {
            employees.forEach(System.out::println);
        }
    }

    public void addEmployee(Employee employee) {
        try {
            employeeService.registerNewEmployee(employee.getCnp(), employee.getFirstName(), employee.getLastName(), employee.getAge());
            System.out.println("Registered new employee: " + employee);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void findEmployeeById(String employeeId) {
        try {
            Employee employee = employeeService.getEmployeeByCnp(employeeId);
            System.out.println("Found employee: " + employee);
        } catch (CustomException customException) {
            System.out.println(customException.getMessage());
        }
    }
}
