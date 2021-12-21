// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.io.Serializable;

public class Excel_KetQua implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private int stt;
    private String ketQuaDong;
    private String loaiKetQua;
    private String cachND;
    private String nhanDang;
    private String cachTinh;
    private String congThuc;
    private String thayTheKQ;
    private String ketQua;
    
    public Excel_KetQua() {
    }
    
    public Excel_KetQua(final int stt, final String ketQuaDong, final String loaiKetQua, final String cachND, final String nhanDang, final String cachTinh, final String congThuc, final String thayTheKQ, final String ketQua) {
        this.stt = stt;
        this.ketQuaDong = ketQuaDong;
        this.loaiKetQua = loaiKetQua;
        this.cachND = cachND;
        this.nhanDang = nhanDang;
        this.cachTinh = cachTinh;
        this.congThuc = congThuc;
        this.thayTheKQ = thayTheKQ;
        this.ketQua = ketQua;
    }
    
    public int getStt() {
        return this.stt;
    }
    
    public void setStt(final int stt) {
        this.stt = stt;
    }
    
    public String getKetQuaDong() {
        return this.ketQuaDong;
    }
    
    public void setKetQuaDong(final String ketQuaDong) {
        this.ketQuaDong = ketQuaDong;
    }
    
    public String getLoaiKetQua() {
        return this.loaiKetQua;
    }
    
    public void setLoaiKetQua(final String loaiKetQua) {
        this.loaiKetQua = loaiKetQua;
    }
    
    public String getCachND() {
        return this.cachND;
    }
    
    public void setCachND(final String cachND) {
        this.cachND = cachND;
    }
    
    public String getNhanDang() {
        return this.nhanDang;
    }
    
    public void setNhanDang(final String nhanDang) {
        this.nhanDang = nhanDang;
    }
    
    public String getCachTinh() {
        return this.cachTinh;
    }
    
    public void setCachTinh(final String cachTinh) {
        this.cachTinh = cachTinh;
    }
    
    public String getCongThuc() {
        return this.congThuc;
    }
    
    public void setCongThuc(final String congThuc) {
        this.congThuc = congThuc;
    }
    
    public String getThayTheKQ() {
        return this.thayTheKQ;
    }
    
    public void setThayTheKQ(final String thayTheKQ) {
        this.thayTheKQ = thayTheKQ;
    }
    
    public String getKetQua() {
        return this.ketQua;
    }
    
    public void setKetQua(final String ketQua) {
        this.ketQua = ketQua;
    }
}
