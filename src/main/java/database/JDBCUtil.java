package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection connection = null;

        try {
//            DriverManager.registerDriver((java.sql.Driver) new Driver());

            String url = "jdbc:mySQL://localhost:3306/QuanLySinhVien";
            String user = "root";
            String password = "hungbv_application_testing";

            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void closeConnection(Connection connection){
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
