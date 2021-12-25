// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model.CauHinhChuyenTiep;

import java.io.Serializable;

public class CauHinhChuyenTiep implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private CauHinhChuyenTiep_Com cauHinhChuyenTiepCom;
    private CauHinhChuyenTiep_TCP cauHinhChuyenTiepTCP;
    private CauHinhChuyenTiep_DuLieuKhongChuyenTiep cauHinhChuyenTiepDuLieuKhongChuyenTiep;
    
    public CauHinhChuyenTiep() {
    }
    
    public CauHinhChuyenTiep(final CauHinhChuyenTiep_Com cauHinhChuyenTiepCom, final CauHinhChuyenTiep_TCP cauHinhChuyenTiepTCP, final CauHinhChuyenTiep_DuLieuKhongChuyenTiep cauHinhChuyenTiepDuLieuKhongChuyenTiep) {
        this.cauHinhChuyenTiepCom = cauHinhChuyenTiepCom;
        this.cauHinhChuyenTiepTCP = cauHinhChuyenTiepTCP;
        this.cauHinhChuyenTiepDuLieuKhongChuyenTiep = cauHinhChuyenTiepDuLieuKhongChuyenTiep;
    }
    
    public CauHinhChuyenTiep_Com getCauHinhChuyenTiepCom() {
        return this.cauHinhChuyenTiepCom;
    }
    
    public void setCauHinhChuyenTiepCom(final CauHinhChuyenTiep_Com cauHinhChuyenTiepCom) {
        this.cauHinhChuyenTiepCom = cauHinhChuyenTiepCom;
    }
    
    public CauHinhChuyenTiep_TCP getCauHinhChuyenTiepTCP() {
        return this.cauHinhChuyenTiepTCP;
    }
    
    public void setCauHinhChuyenTiepTCP(final CauHinhChuyenTiep_TCP cauHinhChuyenTiepTCP) {
        this.cauHinhChuyenTiepTCP = cauHinhChuyenTiepTCP;
    }
    
    public CauHinhChuyenTiep_DuLieuKhongChuyenTiep getCauHinhChuyenTiepDuLieuKhongChuyenTiep() {
        return this.cauHinhChuyenTiepDuLieuKhongChuyenTiep;
    }
    
    public void setCauHinhChuyenTiepDuLieuKhongChuyenTiep(final CauHinhChuyenTiep_DuLieuKhongChuyenTiep cauHinhChuyenTiepDuLieuKhongChuyenTiep) {
        this.cauHinhChuyenTiepDuLieuKhongChuyenTiep = cauHinhChuyenTiepDuLieuKhongChuyenTiep;
    }
}
