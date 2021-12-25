// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

import java.util.Map;
import java.io.Serializable;

public class KetQuaMay_4210 implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private int id;
    private String stt;
    private int maDonVi;
    private String maMay4210;
    private String tenMay;
    private String ngayChayMau;
    private String thoiGianNhan;
    private String message;
    private Map<String, Object> ketQuas;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getStt() {
        return this.stt;
    }
    
    public void setStt(final String stt) {
        this.stt = stt;
    }
    
    public int getMaDonVi() {
        return this.maDonVi;
    }
    
    public void setMaDonVi(final int maDonVi) {
        this.maDonVi = maDonVi;
    }
    
    public String getTenMay() {
        return this.tenMay;
    }
    
    public void setTenMay(final String tenMay) {
        this.tenMay = tenMay;
    }
    
    public String getNgayChayMau() {
        return this.ngayChayMau;
    }
    
    public void setNgayChayMau(final String ngayChayMau) {
        this.ngayChayMau = ngayChayMau;
    }
    
    public String getThoiGianNhan() {
        return this.thoiGianNhan;
    }
    
    public void setThoiGianNhan(final String thoiGianNhan) {
        this.thoiGianNhan = thoiGianNhan;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public Map<String, Object> getKetQuas() {
        return this.ketQuas;
    }
    
    public void setKetQuas(final Map<String, Object> ketQuas) {
        this.ketQuas = ketQuas;
    }
    
    public String getMaMay4210() {
        return this.maMay4210;
    }
    
    public void setMaMay4210(final String maMay4210) {
        this.maMay4210 = maMay4210;
    }
}
