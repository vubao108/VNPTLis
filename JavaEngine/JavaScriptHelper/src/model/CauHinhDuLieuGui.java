// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.util.List;
import java.io.Serializable;

public class CauHinhDuLieuGui implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private List<CauHinhDuLieuGui_ChiTiet> cauHinhDuLieuGuiChiTiets;
    
    public List<CauHinhDuLieuGui_ChiTiet> getCauHinhDuLieuGuiChiTiets() {
        return this.cauHinhDuLieuGuiChiTiets;
    }
    
    public void setCauHinhDuLieuGuiChiTiets(final List<CauHinhDuLieuGui_ChiTiet> cauHinhDuLieuGuiChiTiets) {
        this.cauHinhDuLieuGuiChiTiets = cauHinhDuLieuGuiChiTiets;
    }
}
