package test;

import database.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        // Bước 1: tọa kết nối.
        Connection connection = JDBCUtil.getConnection();

        // Bước 2 : tao ra đối tượng statement
        try {
            Statement statement = connection.createStatement();
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
