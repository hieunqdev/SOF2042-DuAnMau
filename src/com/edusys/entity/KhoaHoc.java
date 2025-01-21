/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class KhoaHoc {
    
    int MaKH;
    String MaCD;
    double HocPhi;
    int ThoiLuong;
    Date NgayKG;
    String GhiChu;
    String MaNV;
    Date NgayTao;

    public KhoaHoc() {
    }

    public int getMaKH() {
        return MaKH;
    }

    public String getMaCD() {
        return MaCD;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public Date getNgayKG() {
        return NgayKG;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public void setNgayKG(Date NgayKG) {
        this.NgayKG = NgayKG;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }
           
}
