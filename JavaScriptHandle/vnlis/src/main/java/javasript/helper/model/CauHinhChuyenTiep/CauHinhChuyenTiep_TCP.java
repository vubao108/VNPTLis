// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model.CauHinhChuyenTiep;

import java.io.Serializable;

public class CauHinhChuyenTiep_TCP implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private String IP;
    private String Port;
    
    public CauHinhChuyenTiep_TCP() {
    }
    
    public CauHinhChuyenTiep_TCP(final String IP, final String port) {
        this.IP = IP;
        this.Port = port;
    }
    
    public String getIP() {
        return this.IP;
    }
    
    public void setIP(final String IP) {
        this.IP = IP;
    }
    
    public String getPort() {
        return this.Port;
    }
    
    public void setPort(final String port) {
        this.Port = port;
    }
}
