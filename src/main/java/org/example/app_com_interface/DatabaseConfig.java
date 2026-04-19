package org.example.app_com_interface;

<<<<<<< HEAD
import

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;...

public class DatabaseConfig {
    public static Connection getConncection() throws SQLException{
        string url = "jbdc:mysql://localhost:3307/teste_jdbc";
        string user= "root";
        string password = "senac";

        return DriverManager.getConnection(url,user,password);
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/teste_jdbc";
        String user = "root";
        String password = "senac";

        return DriverManager.getConnection(url, user, password);
>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0
    }
}