// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

import java.util.List;
import java.io.Serializable;

public class MapMaXN implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private List<MapMaXN_ChiTiet> mapMaXNChiTiets;
    
    public List<MapMaXN_ChiTiet> getMapMaXNChiTiets() {
        return this.mapMaXNChiTiets;
    }
    
    public void setMapMaXNChiTiets(final List<MapMaXN_ChiTiet> mapMaXNChiTiets) {
        this.mapMaXNChiTiets = mapMaXNChiTiets;
    }
}
