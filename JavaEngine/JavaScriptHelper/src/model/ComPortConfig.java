// // 
// // Decompiled by Procyon v0.5.36
// // 

// package model;

// public class ComPortConfig
// {
//     private String portName;
//     private int baudRate;
//     private int databits;
//     private int stopBits;
//     private int parity;
//     private boolean RTS;
//     private boolean DTR;
    
//     public ComPortConfig() {
//         this.baudRate = 9600;
//         this.databits = 8;
//         this.stopBits = 1;
//         this.parity = 0;
//         this.RTS = true;
//         this.DTR = true;
//     }
    
//     public String getPortName() {
//         return this.portName;
//     }
    
//     public int getBaudRate() {
//         return this.baudRate;
//     }
    
//     public int getDatabits() {
//         return this.databits;
//     }
    
//     public int getStopBits() {
//         return this.stopBits;
//     }
    
//     public int getParity() {
//         return this.parity;
//     }
    
//     public boolean isRTS() {
//         return this.RTS;
//     }
    
//     public boolean isDTR() {
//         return this.DTR;
//     }
    
//     public void setPortName(final String portName) {
//         this.portName = portName;
//     }
    
//     public void setBaudRate(final int baudRate) {
//         this.baudRate = baudRate;
//     }
    
//     public void setDatabits(final int databits) {
//         this.databits = databits;
//     }
    
//     public void setStopBits(final int stopBits) {
//         this.stopBits = stopBits;
//     }
    
//     public void setParity(final int parity) {
//         this.parity = parity;
//     }
    
//     public void setRTS(final boolean RTS) {
//         this.RTS = RTS;
//     }
    
//     public void setDTR(final boolean DTR) {
//         this.DTR = DTR;
//     }
    
//     @Override
//     public boolean equals(final Object o) {
//         if (o == this) {
//             return true;
//         }
//         if (!(o instanceof ComPortConfig)) {
//             return false;
//         }
//         final ComPortConfig other = (ComPortConfig)o;
//         if (!other.canEqual(this)) {
//             return false;
//         }
//         final Object this$portName = this.getPortName();
//         final Object other$portName = other.getPortName();
//         if (this$portName == null) {
//             if (other$portName == null) {
//                 return this.getBaudRate() == other.getBaudRate() && this.getDatabits() == other.getDatabits() && this.getStopBits() == other.getStopBits() && this.getParity() == other.getParity() && this.isRTS() == other.isRTS() && this.isDTR() == other.isDTR();
//             }
//         }
//         else if (this$portName.equals(other$portName)) {
//             return this.getBaudRate() == other.getBaudRate() && this.getDatabits() == other.getDatabits() && this.getStopBits() == other.getStopBits() && this.getParity() == other.getParity() && this.isRTS() == other.isRTS() && this.isDTR() == other.isDTR();
//         }
//         return false;
//     }
    
//     protected boolean canEqual(final Object other) {
//         return other instanceof ComPortConfig;
//     }
    
//     @Override
//     public int hashCode() {
//         final int PRIME = 59;
//         int result = 1;
//         final Object $portName = this.getPortName();
//         result = result * 59 + (($portName == null) ? 43 : $portName.hashCode());
//         result = result * 59 + this.getBaudRate();
//         result = result * 59 + this.getDatabits();
//         result = result * 59 + this.getStopBits();
//         result = result * 59 + this.getParity();
//         result = result * 59 + (this.isRTS() ? 79 : 97);
//         result = result * 59 + (this.isDTR() ? 79 : 97);
//         return result;
//     }
    
//     @Override
//     public String toString() {
//         return "ComPortConfig(portName=" + this.getPortName() + ", baudRate=" + this.getBaudRate() + ", databits=" + this.getDatabits() + ", stopBits=" + this.getStopBits() + ", parity=" + this.getParity() + ", RTS=" + this.isRTS() + ", DTR=" + this.isDTR() + ")";
//     }
// }
