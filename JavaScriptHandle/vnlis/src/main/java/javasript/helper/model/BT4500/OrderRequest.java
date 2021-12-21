// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model.BT4500;

import java.util.List;

public class OrderRequest
{
    private int maDonVi;
    private int maMay;
    private boolean ordered;
    private String stt;
    private List<OrderMaXN_ChiTiet> maXNs;
    
    public OrderRequest() {
    }
    
    public OrderRequest(final int maDonVi, final int maMay, final boolean ordered, final String stt, final List<OrderMaXN_ChiTiet> maXNs) {
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.ordered = ordered;
        this.stt = stt;
        this.maXNs = maXNs;
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
    
    public boolean isOrdered() {
        return this.ordered;
    }
    
    public void setOrdered(final boolean ordered) {
        this.ordered = ordered;
    }
    
    public String getStt() {
        return this.stt;
    }
    
    public void setStt(final String stt) {
        this.stt = stt;
    }
    
    public List<OrderMaXN_ChiTiet> getMaXNs() {
        return this.maXNs;
    }
    
    public void setMaXNs(final List<OrderMaXN_ChiTiet> maXNs) {
        this.maXNs = maXNs;
    }
}
