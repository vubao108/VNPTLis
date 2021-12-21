// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.util.List;
import java.io.Serializable;

public class CauHinhDuLieuHL7 implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private List<CauHinhDuLieuHL7_ChiTiet> cauHinhDuLieuHL7_chiTiets;
    
    public List<CauHinhDuLieuHL7_ChiTiet> getCauHinhDuLieuHL7_chiTiets() {
        return this.cauHinhDuLieuHL7_chiTiets;
    }
    
    public void setCauHinhDuLieuHL7_chiTiets(final List<CauHinhDuLieuHL7_ChiTiet> cauHinhDuLieuHL7_chiTiets) {
        this.cauHinhDuLieuHL7_chiTiets = cauHinhDuLieuHL7_chiTiets;
    }
}
