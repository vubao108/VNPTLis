// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model;

import java.io.Serializable;

public class CauHinhDuLieuHL7_ChiTiet implements Serializable, Cloneable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String sttDong;
    private String dinhDangGui;
    private String noiDung;
    
    public CauHinhDuLieuHL7_ChiTiet() {
    }
    
    public CauHinhDuLieuHL7_ChiTiet(final String sttDong, final String dinhDangGui, final String noiDung) {
        this.sttDong = sttDong;
        this.dinhDangGui = dinhDangGui;
        this.noiDung = noiDung;
    }
    
    public static long getSerialVersionUID() {
        return 8502724919537004595L;
    }
    
    public String getSttDong() {
        return this.sttDong;
    }
    
    public void setSttDong(final String sttDong) {
        this.sttDong = sttDong;
    }
    
    public String getDinhDangGui() {
        return this.dinhDangGui;
    }
    
    public void setDinhDangGui(final String dinhDangGui) {
        this.dinhDangGui = dinhDangGui;
    }
    
    public String getNoiDung() {
        return this.noiDung;
    }
    
    public void setNoiDung(final String noiDung) {
        this.noiDung = noiDung;
    }
}
