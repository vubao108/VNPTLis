// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;
import java.io.Serializable;

public class KetQuaMay implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private int id;
    private String stt;
    private int maDonVi;
    private int maMay;
    private String tenMay;
    private String ngayChayMau;
    private String thoiGianNhan;
    private String message;
    private Map<String, Object> ketQuas;
    
    public KetQuaMay() {
    }
    
    public KetQuaMay(final String stt, final int maDonVi, final int maMay, final String ngayChayMau, final String message, final Map<String, Object> ketQuas) {
        this.stt = stt;
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.ngayChayMau = ngayChayMau;
        this.message = message;
        this.ketQuas = ketQuas;
    }
    
    public KetQuaMay(final int id, final String stt, final int maDonVi, final int maMay, final String ngayChayMau, final String thoiGianNhan, final String message, final Map<String, Object> ketQuas) {
        this.id = id;
        this.stt = stt;
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.ngayChayMau = ngayChayMau;
        this.thoiGianNhan = thoiGianNhan;
        this.message = message;
        this.ketQuas = ketQuas;
    }
    
    public KetQuaMay(final int id, final String stt, final int maDonVi, final int maMay, final String tenMay, final String ngayChayMau, final String thoiGianNhan, final String message, final Map<String, Object> ketQuas) {
        this.id = id;
        this.stt = stt;
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.ngayChayMau = ngayChayMau;
        this.thoiGianNhan = thoiGianNhan;
        this.message = message;
        this.ketQuas = ketQuas;
    }
    
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
    
    public int getMaMay() {
        return this.maMay;
    }
    
    public void setMaMay(final int maMay) {
        this.maMay = maMay;
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
    
    public String toStringKetQua() {
        return "";
        // return this.ketQuas.entrySet().stream().map(m -> m.getKey() + ":" + m.getValue()).collect((Collector<? super Object, ?, String>)Collectors.joining(", "));
    }
}
