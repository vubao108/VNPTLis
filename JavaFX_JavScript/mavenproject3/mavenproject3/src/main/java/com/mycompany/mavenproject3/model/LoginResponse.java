// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

public class LoginResponse
{
    String access_token;
    String token_type;
    String refresh_token;
    String expires_in;
    String scope;
    String iat;
    String jti;
    
    public String getAccess_token() {
        return this.access_token;
    }
    
    public void setAccess_token(final String access_token) {
        this.access_token = access_token;
    }
    
    public String getToken_type() {
        return this.token_type;
    }
    
    public void setToken_type(final String token_type) {
        this.token_type = token_type;
    }
    
    public String getRefresh_token() {
        return this.refresh_token;
    }
    
    public void setRefresh_token(final String refresh_token) {
        this.refresh_token = refresh_token;
    }
    
    public String getExpires_in() {
        return this.expires_in;
    }
    
    public void setExpires_in(final String expires_in) {
        this.expires_in = expires_in;
    }
    
    public String getScope() {
        return this.scope;
    }
    
    public void setScope(final String scope) {
        this.scope = scope;
    }
    
    public String getIat() {
        return this.iat;
    }
    
    public void setIat(final String iat) {
        this.iat = iat;
    }
    
    public String getJti() {
        return this.jti;
    }
    
    public void setJti(final String jti) {
        this.jti = jti;
    }
}
