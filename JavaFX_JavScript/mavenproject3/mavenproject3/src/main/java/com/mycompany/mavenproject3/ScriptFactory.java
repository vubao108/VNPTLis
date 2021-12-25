package com.mycompany.mavenproject3;
public class ScriptFactory
{
    public static ScriptHandler create(final String language) {
        ScriptHandler scriptHandler = null;
        if (language.toUpperCase().equals("JAVASCRIPT")) {
            scriptHandler = new JavascriptHandler();
        }
        if (scriptHandler != null) {}
        return scriptHandler;
    }
    
    public static ScriptHandler getDefault() {
        return create("javascript");
    }
}
