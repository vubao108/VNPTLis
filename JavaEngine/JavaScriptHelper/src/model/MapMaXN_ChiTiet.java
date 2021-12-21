// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.io.Serializable;

public class MapMaXN_ChiTiet implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String maXNNhan;
    private String maXNGUI;
    private String maXNDM;
    
    public String getMaXNNhan() {
        return this.maXNNhan;
    }
    
    public void setMaXNNhan(final String maXNNhan) {
        this.maXNNhan = maXNNhan;
    }
    
    public String getMaXNGUI() {
        return this.maXNGUI;
    }
    
    public void setMaXNGUI(final String maXNGUI) {
        this.maXNGUI = maXNGUI;
    }
    
    public String getMaXNDM() {
        return this.maXNDM;
    }
    
    public void setMaXNDM(final String maXNDM) {
        this.maXNDM = maXNDM;
    }
}
