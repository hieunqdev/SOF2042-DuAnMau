/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.utils.KetNoiDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class ChuyenDeDAO {
    public int createChuyenDe(ChuyenDe chuyenDe) {
        String sql = "INSERT INTO ChuyenDe "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = KetNoiDB.getConnection();
                PreparedStatement ps = con
                        .prepareStatement(sql)){
            
            ps.setString(1, chuyenDe.getMaCD());
            ps.setString(2, chuyenDe.getTenCD());
            ps.setDouble(3, chuyenDe.getHocPhi());
            ps.setInt(4, chuyenDe.getThoiLuong());
            ps.setString(5, chuyenDe.getHinh());
            ps.setString(6, chuyenDe.getMoTa());
            
            int ketQua = ps.executeUpdate();
            return ketQua;
            
        } catch (SQLException e) {
            return 0;
        }
    } 
}
