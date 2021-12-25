// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model.BT4500;

import java.util.ArrayList;
import java.util.List;

public class OrderResponses_v2
{
    private int maDonVi;
    private int maMay;
    private String ordered;
    private List<OrderBenhNhanInfo_v2> orderBenhNhanInfos;
    
    public OrderResponses_v2() {
    }
    
    public OrderResponses_v2(final int maDonVi, final int maMay, final String ordered, final List<OrderBenhNhanInfo_v2> orderBenhNhanInfos) {
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.ordered = ordered;
        this.orderBenhNhanInfos = orderBenhNhanInfos;
    }
    
    public OrderResponses_v2(final int maDonVi, final int maMay, final String ordered, final OrderBenhNhanInfo_v2 orderBenhNhanInfos) {
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.ordered = ordered;
        (this.orderBenhNhanInfos = new ArrayList<OrderBenhNhanInfo_v2>()).add(orderBenhNhanInfos);
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
    
    public String getOrdered() {
        return this.ordered;
    }
    
    public void setOrdered(final String ordered) {
        this.ordered = ordered;
    }
    
    public List<OrderBenhNhanInfo_v2> getOrderBenhNhanInfos() {
        return this.orderBenhNhanInfos;
    }
    
    public void setOrderBenhNhanInfos(final List<OrderBenhNhanInfo_v2> orderBenhNhanInfos) {
        this.orderBenhNhanInfos = orderBenhNhanInfos;
    }
}
