// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.util.List;
import java.io.Serializable;

public class Excel implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String kiTuPhanCachCacBenhNhan;
    private String kiTuPhanCachCacDongKQ;
    private String congThucThayTheKQ;
    private boolean tinhKQTuDong;
    private List<Excel_KetQua> excel_ketQuas;
    
    public String getKiTuPhanCachCacBenhNhan() {
        return this.kiTuPhanCachCacBenhNhan;
    }
    
    public void setKiTuPhanCachCacBenhNhan(final String kiTuPhanCachCacBenhNhan) {
        this.kiTuPhanCachCacBenhNhan = kiTuPhanCachCacBenhNhan;
    }
    
    public String getKiTuPhanCachCacDongKQ() {
        return this.kiTuPhanCachCacDongKQ;
    }
    
    public void setKiTuPhanCachCacDongKQ(final String kiTuPhanCachCacDongKQ) {
        this.kiTuPhanCachCacDongKQ = kiTuPhanCachCacDongKQ;
    }
    
    public String getCongThucThayTheKQ() {
        return this.congThucThayTheKQ;
    }
    
    public void setCongThucThayTheKQ(final String congThucThayTheKQ) {
        this.congThucThayTheKQ = congThucThayTheKQ;
    }
    
    public boolean isTinhKQTuDong() {
        return this.tinhKQTuDong;
    }
    
    public void setTinhKQTuDong(final boolean tinhKQTuDong) {
        this.tinhKQTuDong = tinhKQTuDong;
    }
    
    public List<Excel_KetQua> getExcel_ketQuas() {
        return this.excel_ketQuas;
    }
    
    public void setExcel_ketQuas(final List<Excel_KetQua> excel_ketQuas) {
        this.excel_ketQuas = excel_ketQuas;
    }
}
