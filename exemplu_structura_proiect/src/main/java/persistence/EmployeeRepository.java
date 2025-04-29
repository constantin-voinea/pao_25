package persistence;


import domain.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static persistence.util.DatabaseConnectionUtil.getDatabaseConnection;

/**
 * @author cvoinea
 * <p>
 * Repositories define an elegant method for storing, updating, and extracting the data stored from JAVA applications.
 * Usually they have a 1-to-1 relation with the entities. Any entity that should be persisted should have a repository
 */
public class EmployeeRepository implements GenericRepository<Employee> {

    private final Map<String, Employee> storage = new HashMap<>();

    private static final String INSERT_EMPLOYEE_SQL = "insert into employee(cnp, firstname, lastname, age) values (?, ?, ?, ?)";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set firstname=? , lastname=? , age=? where cnp=?";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where cnp=?";
    private static final String FIND_EMPLOYEES_BY_CNP_SQL = "select cnp, firstname, lastname, age from employee where cnp=?";
    private static final String FIND_ALL_EMPLOYEES_SQL = "select * from employee";
    private final Connection connection;

    private static volatile EmployeeRepository instance;


    private EmployeeRepository() {
        this.connection = getDatabaseConnection();
    }

    public static EmployeeRepository getInstance() {
        if (instance == null) {
            synchronized (EmployeeRepository.class) {
                if (instance == null) {
                    instance = new EmployeeRepository();
                }
            }
        }
        return instance;
    }

    @Override
    public Employee save(Employee entity) {
        try (PreparedStatement prepareStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            prepareStatement.setString(1, entity.getCnp());
            prepareStatement.setString(2, entity.getFirstName());
            prepareStatement.setString(3, entity.getLastName());
            prepareStatement.setInt(4, entity.getAge());
            prepareStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        storage.put(entity.getCnp(), entity);
        return entity;
    }

    @Override
    public List<Employee> findAll() {
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_EMPLOYEES_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            extractResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Employee> findById(String id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_EMPLOYEES_BY_CNP_SQL)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            extractResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(storage.get(id));
    }

    private void extractResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String cnp = resultSet.getString("cnp");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            int age = resultSet.getInt("age");
            Employee employee = new Employee(cnp, firstName, lastName, age);
            storage.put(cnp, employee);
        }
    }

    @Override
    public void update(Employee entity) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, entity.getFirstName());
            preparedStatement.setString(2, entity.getLastName());
            preparedStatement.setInt(3, entity.getAge());
            preparedStatement.setString(4, entity.getCnp());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        storage.put(entity.getCnp(), entity);
    }

    @Override
    public void delete(Employee entity) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, entity.getCnp());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        storage.remove(entity.getCnp());
    }
}
