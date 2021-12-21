// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model;

import java.io.Serializable;

public class Database_Result_ChiTiet implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String SID;
    private String timeOrder;
    private String timeResult;
    private String maXN;
    private String ketQua;
    
    public Database_Result_ChiTiet(final String SID, final String timeOrder, final String timeResult, final String maXN, final String ketQua) {
        this.SID = SID;
        this.timeOrder = timeOrder;
        this.timeResult = timeResult;
        this.maXN = maXN;
        this.ketQua = ketQua;
    }
    
    public Database_Result_ChiTiet() {
    }
    
    public String getSID() {
        return this.SID;
    }
    
    public void setSID(final String SID) {
        this.SID = SID;
    }
    
    public String getTimeOrder() {
        return this.timeOrder;
    }
    
    public void setTimeOrder(final String timeOrder) {
        this.timeOrder = timeOrder;
    }
    
    public String getTimeResult() {
        return this.timeResult;
    }
    
    public void setTimeResult(final String timeResult) {
        this.timeResult = timeResult;
    }
    
    public String getMaXN() {
        return this.maXN;
    }
    
    public void setMaXN(final String maXN) {
        this.maXN = maXN;
    }
    
    public String getKetQua() {
        return this.ketQua;
    }
    
    public void setKetQua(final String ketQua) {
        this.ketQua = ketQua;
    }
}
