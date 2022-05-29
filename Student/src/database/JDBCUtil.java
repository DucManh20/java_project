/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;

/**
 *
 * @author Dell
 */
public class JDBCUtil {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:mySQL://localhost:3306/student";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Database Connected successfully");
        } catch (SQLException e) {
            System.out.println("Database Connection failed");
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showInfo(Connection c) {
        try {
            System.out.println(c.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
