// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model.BT4500;

import java.util.List;

public class OrderBenhNhanInfo
{
    private String stt;
    private int gioiTinh;
    private String tenKhongDau;
    private List<OrderMaXN_ChiTiet> maXNs;
    
    public OrderBenhNhanInfo() {
    }
    
    public OrderBenhNhanInfo(final String stt, final int gioiTinh, final String tenKhongDau, final List<OrderMaXN_ChiTiet> maXNs) {
        this.stt = stt;
        this.gioiTinh = gioiTinh;
        this.tenKhongDau = tenKhongDau;
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
}
