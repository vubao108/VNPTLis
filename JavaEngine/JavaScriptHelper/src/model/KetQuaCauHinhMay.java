// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.util.List;
import java.io.Serializable;

public class KetQuaCauHinhMay implements Serializable
{
    private static final long serialVersionUID = 6529685098267757690L;
    private int dvtt;
    private String ngayKQ;
    private int maMay;
    private String maMay4210;
    private String sid;
    private List<KetQuaCauHinhMay_ChiTiet> ketQuaCauHinhMayChiTiets;
    private int _id;
    
    public KetQuaCauHinhMay() {
        this.dvtt = 0;
        this.ngayKQ = "";
        this.maMay = 0;
        this.maMay4210 = "";
        this._id = 0;
    }
    
    public String getSid() {
        return this.sid;
    }
    
    public void setSid(final String sid) {
        this.sid = sid;
    }
    
    public List<KetQuaCauHinhMay_ChiTiet> getKetQuaCauHinhMayChiTiets() {
        return this.ketQuaCauHinhMayChiTiets;
    }
    
    public void setKetQuaCauHinhMayChiTiets(final List<KetQuaCauHinhMay_ChiTiet> ketQuaCauHinhMayChiTiets) {
        this.ketQuaCauHinhMayChiTiets = ketQuaCauHinhMayChiTiets;
    }
    
    public int get_id() {
        return this._id;
    }
    
    public void set_id(final int _id) {
        this._id = _id;
    }
    
    public int getDvtt() {
        return this.dvtt;
    }
    
    public String getNgayKQ() {
        return this.ngayKQ;
    }
    
    public int getMaMay() {
        return this.maMay;
    }
    
    public void setDvtt(final int dvtt) {
        this.dvtt = dvtt;
    }
    
    public void setNgayKQ(final String ngayKQ) {
        this.ngayKQ = ngayKQ;
    }
    
    public void setMaMay(final int maMay) {
        this.maMay = maMay;
    }
    
    public String getMaMay4210() {
        return this.maMay4210;
    }
    
    public void setMaMay4210(final String maMay4210) {
        this.maMay4210 = maMay4210;
    }
}
