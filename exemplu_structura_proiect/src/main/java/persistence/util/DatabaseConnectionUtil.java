package persistence.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author cvoinea
 */
public class DatabaseConnectionUtil {

    private static final String MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static volatile DatabaseConnectionUtil instance;
    private Connection connection;

    public static Connection getDatabaseConnection() {
        if (instance == null) {
            synchronized (DatabaseConnectionUtil.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionUtil();
                }
            }
        }
        return instance.connection;
    }

    private DatabaseConnectionUtil() {
        try {
            Class.forName(MYSQL_JDBC_DRIVER); // mandatory before JDBC 4.0
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Mysql driver not available: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Could not connect to database: " + e.getMessage());
        }
        System.out.println("MySql connection available");
    }
}
