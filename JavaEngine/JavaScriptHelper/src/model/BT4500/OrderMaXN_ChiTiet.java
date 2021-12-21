// 
// Decompiled by Procyon v0.5.36
// 

package model.BT4500;

public class OrderMaXN_ChiTiet
{
    private String maXNGui;
    private String maXNDM;
    
    public OrderMaXN_ChiTiet() {
    }
    
    public OrderMaXN_ChiTiet(final String maXNGui, final String maXNDM) {
        this.maXNGui = maXNGui;
        this.maXNDM = maXNDM;
    }
    
    public String getMaXNGui() {
        return this.maXNGui;
    }
    
    public void setMaXNGui(final String maXNGui) {
        this.maXNGui = maXNGui;
    }
    
    public String getMaXNDM() {
        return this.maXNDM;
    }
    
    public void setMaXNDM(final String maXNDM) {
        this.maXNDM = maXNDM;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
