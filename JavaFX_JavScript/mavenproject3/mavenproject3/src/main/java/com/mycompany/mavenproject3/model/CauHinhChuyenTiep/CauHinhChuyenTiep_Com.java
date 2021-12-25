// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model.CauHinhChuyenTiep;

import java.io.Serializable;

public class CauHinhChuyenTiep_Com implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String portName;
    private int baudRate;
    private int dataBit;
    private int stopBit;
    private int parityName;
    
    public CauHinhChuyenTiep_Com() {
    }
    
    public CauHinhChuyenTiep_Com(final String portName, final int baudRate, final int dataBit, final int stopBit, final int parityName) {
        this.portName = portName;
        this.baudRate = baudRate;
        this.dataBit = dataBit;
        this.stopBit = stopBit;
        this.parityName = parityName;
    }
    
    public String getPortName() {
        return this.portName;
    }
    
    public void setPortName(final String portName) {
        this.portName = portName;
    }
    
    public int getBaudRate() {
        return this.baudRate;
    }
    
    public void setBaudRate(final int baudRate) {
        this.baudRate = baudRate;
    }
    
    public int getDataBit() {
        return this.dataBit;
    }
    
    public void setDataBit(final int dataBit) {
        this.dataBit = dataBit;
    }
    
    public int getStopBit() {
        return this.stopBit;
    }
    
    public void setStopBit(final int stopBit) {
        this.stopBit = stopBit;
    }
    
    public int getParityName() {
        return this.parityName;
    }
    
    public void setParityName(final int parityName) {
        this.parityName = parityName;
    }
}
