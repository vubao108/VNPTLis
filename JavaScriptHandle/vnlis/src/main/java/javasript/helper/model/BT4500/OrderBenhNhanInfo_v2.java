// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model.BT4500;

import java.util.List;

public class OrderBenhNhanInfo_v2
{
    private String stt;
    private int gioiTinh;
    private String tenKhongDau;
    private String ngaySinh;
    private String maBenhNhan;
    private List<OrderMaXN_ChiTiet> maXNs;
    
    public OrderBenhNhanInfo_v2() {
    }
    
    public OrderBenhNhanInfo_v2(final String stt, final int gioiTinh, final String tenKhongDau, final String ngaySinh, final String maBenhNhan, final List<OrderMaXN_ChiTiet> maXNs) {
        this.stt = stt;
        this.gioiTinh = gioiTinh;
        this.tenKhongDau = tenKhongDau;
        this.ngaySinh = ngaySinh;
        this.maBenhNhan = maBenhNhan;
        this.maXNs = maXNs;
    }
    
    public String getStt() {
        return this.stt;
    }
    
    public void setStt(final String stt) {
        this.stt = stt;
    }
    
    public int getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(final int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getTenKhongDau() {
        return this.tenKhongDau;
    }
    
    public void setTenKhongDau(final String tenKhongDau) {
        this.tenKhongDau = tenKhongDau;
    }
    
    public List<OrderMaXN_ChiTiet> getMaXNs() {
        return this.maXNs;
    }
    
    public void setMaXNs(final List<OrderMaXN_ChiTiet> maXNs) {
        this.maXNs = maXNs;
    }
    
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(final String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String getMaBenhNhan() {
        return this.maBenhNhan;
    }
    
    public void setMaBenhNhan(final String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
}
