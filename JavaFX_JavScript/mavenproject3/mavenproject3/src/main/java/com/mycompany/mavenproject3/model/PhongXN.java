package com.mycompany.mavenproject3.model;

public class PhongXN
{
    private String maPhongBan;
    private int maPhongBenh;
    private String tenPhong;
    private String maPhongBenhChuoi;
    
    public PhongXN() {
    }
    
    public PhongXN(final String maPhongBan, final int maPhongBenh, final String tenPhong, final String maPhongBenhChuoi) {
        this.maPhongBan = maPhongBan;
        this.maPhongBenh = maPhongBenh;
        this.tenPhong = tenPhong;
        this.maPhongBenhChuoi = maPhongBenhChuoi;
    }
    
    public String getMaPhongBan() {
        return this.maPhongBan;
    }
    
    public void setMaPhongBan(final String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }
    
    public int getMaPhongBenh() {
        return this.maPhongBenh;
    }
    
    public void setMaPhongBenh(final int maPhongBenh) {
        this.maPhongBenh = maPhongBenh;
    }
    
    public String getTenPhong() {
        return this.tenPhong;
    }
    
    public void setTenPhong(final String tenPhong) {
        this.tenPhong = tenPhong;
    }
    
    public String getMaPhongBenhChuoi() {
        return this.maPhongBenhChuoi;
    }
    
    public void setMaPhongBenhChuoi(final String maPhongBenhChuoi) {
        this.maPhongBenhChuoi = maPhongBenhChuoi;
    }
}
