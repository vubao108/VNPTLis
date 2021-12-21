// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model;

public class UserInfo
{
    private String username;
    private String password;
    private Boolean rememberMe;
    
    public UserInfo() {
    }
    
    public UserInfo(final String username, final String password, final Boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public Boolean getRememberMe() {
        return this.rememberMe;
    }
    
    public void setRememberMe(final Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
