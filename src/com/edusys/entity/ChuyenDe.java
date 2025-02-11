/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 *
 * @author Admin
 */
public class ChuyenDe {
    
    String MaCD;
    String TenCD;
    Double HocPhi;
    int ThoiLuong;
    String Hinh;
    String MoTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String MaCD, String TenCD, Double HocPhi, int ThoiLuong, String Hinh, String MoTa) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
    }
    
    

    public String getMaCD() {
        return MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public Double getHocPhi() {
        return HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

    public void setHocPhi(Double HocPhi) {
        this.HocPhi = HocPhi;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    
}
