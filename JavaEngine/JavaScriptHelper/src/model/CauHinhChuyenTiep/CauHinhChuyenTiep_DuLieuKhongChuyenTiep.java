// 
// Decompiled by Procyon v0.5.36
// 

package model.CauHinhChuyenTiep;

import java.io.Serializable;

public class CauHinhChuyenTiep_DuLieuKhongChuyenTiep implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String duLieuNhan;
    private int cachTinh;
    private String congThuc;
    private String chuoiNhanDang;
    
    public CauHinhChuyenTiep_DuLieuKhongChuyenTiep() {
    }
    
    public CauHinhChuyenTiep_DuLieuKhongChuyenTiep(final String duLieuNhan, final int cachTinh, final String congThuc, final String chuoiNhanDang) {
        this.duLieuNhan = duLieuNhan;
        this.cachTinh = cachTinh;
        this.congThuc = congThuc;
        this.chuoiNhanDang = chuoiNhanDang;
    }
    
    public String getDuLieuNhan() {
        return this.duLieuNhan;
    }
    
    public void setDuLieuNhan(final String duLieuNhan) {
        this.duLieuNhan = duLieuNhan;
    }
    
    public int getCachTinh() {
        return this.cachTinh;
    }
    
    public void setCachTinh(final int cachTinh) {
        this.cachTinh = cachTinh;
    }
    
    public String getCongThuc() {
        return this.congThuc;
    }
    
    public void setCongThuc(final String congThuc) {
        this.congThuc = congThuc;
    }
    
    public String getChuoiNhanDang() {
        return this.chuoiNhanDang;
    }
    
    public void setChuoiNhanDang(final String chuoiNhanDang) {
        this.chuoiNhanDang = chuoiNhanDang;
    }
}
