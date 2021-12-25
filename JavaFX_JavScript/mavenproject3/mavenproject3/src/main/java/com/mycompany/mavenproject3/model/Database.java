// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

import java.io.Serializable;

public class Database implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private int connectType;
    private String accPath;
    private String userID;
    private String password;
    private String server;
    private String database;
    private String tableResult;
    private int timeToGet;
    public boolean addResult;
    public String addFormat;
    public boolean getDay;
    private Database_Result databaseResult;
    
    public int getConnectType() {
        return this.connectType;
    }
    
    public void setConnectType(final int connectType) {
        this.connectType = connectType;
    }
    
    public String getAccPath() {
        return this.accPath;
    }
    
    public void setAccPath(final String accPath) {
        this.accPath = accPath;
    }
    
    public String getUserID() {
        return this.userID;
    }
    
    public void setUserID(final String userID) {
        this.userID = userID;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String getServer() {
        return this.server;
    }
    
    public void setServer(final String server) {
        this.server = server;
    }
    
    public String getDatabase() {
        return this.database;
    }
    
    public void setDatabase(final String database) {
        this.database = database;
    }
    
    public String getTableResult() {
        return this.tableResult;
    }
    
    public void setTableResult(final String tableResult) {
        this.tableResult = tableResult;
    }
    
    public Database_Result getDatabaseResult() {
        return this.databaseResult;
    }
    
    public void setDatabaseResult(final Database_Result databaseResult) {
        this.databaseResult = databaseResult;
    }
    
    public int getTimeToGet() {
        return this.timeToGet;
    }
    
    public void setTimeToGet(final int timeToGet) {
        this.timeToGet = timeToGet;
    }
    
    public boolean isAddResult() {
        return this.addResult;
    }
    
    public void setAddResult(final boolean addResult) {
        this.addResult = addResult;
    }
    
    public String getAddFormat() {
        return this.addFormat;
    }
    
    public void setAddFormat(final String addFormat) {
        this.addFormat = addFormat;
    }
    
    public boolean isGetDay() {
        return this.getDay;
    }
    
    public void setGetDay(final boolean getDay) {
        this.getDay = getDay;
    }
}
