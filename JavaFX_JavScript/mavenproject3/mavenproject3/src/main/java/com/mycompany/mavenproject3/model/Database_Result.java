// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

import java.util.List;
import java.io.Serializable;

public class Database_Result implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String sqlQuery;
    private String dinhDangKQ;
    public String orderBy;
    public String asc;
    public boolean updateKQMau;
    private String SID;
    private String timeOrder;
    private String timeResult;
    public boolean timeResultIsText;
    private String maXN;
    private String ketQuaDoc;
    private List<KetQuaNgang> ketQuaNgangs;
    public List<Database_Result_ChiTiet> results;
    
    public Database_Result() {
    }
    
    public Database_Result(final String SID, final String timeOrder, final String timeResult, final String maXN, final String ketQuaDoc) {
        this.SID = SID;
        this.timeOrder = timeOrder;
        this.timeResult = timeResult;
        this.maXN = maXN;
        this.ketQuaDoc = ketQuaDoc;
    }
    
    public Database_Result(final String SID, final String timeOrder, final String timeResult, final String maXN, final List<KetQuaNgang> ketQuaNgangs) {
        this.SID = SID;
        this.timeOrder = timeOrder;
        this.timeResult = timeResult;
        this.maXN = maXN;
        this.ketQuaNgangs = ketQuaNgangs;
    }
    
    public String getSID() {
        return this.SID;
    }
    
    public void setSID(final String SID) {
        this.SID = SID;
    }
    
    public String getTimeOrder() {
        return this.timeOrder;
    }
    
    public void setTimeOrder(final String timeOrder) {
        this.timeOrder = timeOrder;
    }
    
    public String getTimeResult() {
        return this.timeResult;
    }
    
    public void setTimeResult(final String timeResult) {
        this.timeResult = timeResult;
    }
    
    public String getMaXN() {
        return this.maXN;
    }
    
    public void setMaXN(final String maXN) {
        this.maXN = maXN;
    }
    
    public String getKetQuaDoc() {
        return this.ketQuaDoc;
    }
    
    public void setKetQuaDoc(final String ketQuaDoc) {
        this.ketQuaDoc = ketQuaDoc;
    }
    
    public List<KetQuaNgang> getKetQuaNgangs() {
        return this.ketQuaNgangs;
    }
    
    public void setKetQuaNgangs(final List<KetQuaNgang> ketQuaNgangs) {
        this.ketQuaNgangs = ketQuaNgangs;
    }
    
    public String getSqlQuery() {
        return this.sqlQuery;
    }
    
    public void setSqlQuery(final String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }
    
    public String getDinhDangKQ() {
        return this.dinhDangKQ;
    }
    
    public void setDinhDangKQ(final String dinhDangKQ) {
        this.dinhDangKQ = dinhDangKQ;
    }
    
    public String getOrderBy() {
        return this.orderBy;
    }
    
    public void setOrderBy(final String orderBy) {
        this.orderBy = orderBy;
    }
    
    public String getAsc() {
        return this.asc;
    }
    
    public void setAsc(final String asc) {
        this.asc = asc;
    }
    
    public boolean isUpdateKQMau() {
        return this.updateKQMau;
    }
    
    public void setUpdateKQMau(final boolean updateKQMau) {
        this.updateKQMau = updateKQMau;
    }
    
    public boolean isTimeResultIsText() {
        return this.timeResultIsText;
    }
    
    public void setTimeResultIsText(final boolean timeResultIsText) {
        this.timeResultIsText = timeResultIsText;
    }
    
    public List<Database_Result_ChiTiet> getResults() {
        return this.results;
    }
    
    public void setResults(final List<Database_Result_ChiTiet> results) {
        this.results = results;
    }
}
