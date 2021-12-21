// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.io.Serializable;

public class CauHinhDuLieuGui_ChiTiet implements Serializable, Cloneable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String sttDong;
    private String loai;
    private String dinhDangGui;
    private String dinhDangTestcode;
    private String KTPhanCach;
    
    public CauHinhDuLieuGui_ChiTiet() {
    }
    
    public CauHinhDuLieuGui_ChiTiet(final String sttDong, final String loai, final String dinhDangGui, final String dinhDangTestcode, final String KTPhanCach) {
        this.sttDong = sttDong;
        this.loai = loai;
        this.dinhDangGui = dinhDangGui;
        this.dinhDangTestcode = dinhDangTestcode;
        this.KTPhanCach = KTPhanCach;
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
    
    public String getLoai() {
        return this.loai;
    }
    
    public void setLoai(final String loai) {
        this.loai = loai;
    }
    
    public String getDinhDangGui() {
        return this.dinhDangGui;
    }
    
    public void setDinhDangGui(final String dinhDangGui) {
        this.dinhDangGui = dinhDangGui;
    }
    
    public String getDinhDangTestcode() {
        return this.dinhDangTestcode;
    }
    
    public void setDinhDangTestcode(final String dinhDangTestcode) {
        this.dinhDangTestcode = dinhDangTestcode;
    }
    
    public String getKTPhanCach() {
        return this.KTPhanCach;
    }
    
    public void setKTPhanCach(final String KTPhanCach) {
        this.KTPhanCach = KTPhanCach;
    }
}
