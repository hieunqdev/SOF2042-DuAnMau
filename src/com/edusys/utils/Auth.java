/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Auth {
    public boolean login(String tenDangNhap, String matKhau) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV = ? AND MatKhau = ?";

        try (Connection con = KetNoiDB.getConnection(); 
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, tenDangNhap);  
            ps.setString(2, matKhau);  
            ResultSet rs = ps.executeQuery();
            boolean result = rs.next();
            
            // Lưu Mã nhân viên và Vai trò người đăng nhập
            if (result) {
                GlobalState.MaNV = rs.getString("MaNV");
                GlobalState.VaiTro = rs.getBoolean("VaiTro");
            }
            
            return result;
        } catch (SQLException e) {
            return false;
        }
    } 
}
