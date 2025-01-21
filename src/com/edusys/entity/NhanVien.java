/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String MaNV;
    String MatKhau;
    String HoTen;
    boolean VaiTro;

    public NhanVien() {
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
    
    
    
}
