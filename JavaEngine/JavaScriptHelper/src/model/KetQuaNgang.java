// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.io.Serializable;

public class KetQuaNgang implements Serializable
{
    private String maXN;
    private String ketQua;
    
    public KetQuaNgang() {
    }
    
    public KetQuaNgang(final String maXN, final String ketQua) {
        this.maXN = maXN;
        this.ketQua = ketQua;
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
