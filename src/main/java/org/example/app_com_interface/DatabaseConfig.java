package org.example.app_com_interface;

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
    }
}
