package com.edusys.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class KetNoiDB {
    public static Connection getConnection() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EduSys;"
                + "user=sa;password=1234;instanceName=Admin\\SQLEXPRESS;encrypt=true;"
                + "trustServerCertificate=true";

        return DriverManager.getConnection(connectionUrl);  
    }
    
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EduSys;"
                + "user=sa;password=1234;instanceName=Admin\\SQLEXPRESS;encrypt=true;"
                + "trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM NhanVien";
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString("MaNV") + " " + rs.getString("HoTen"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}