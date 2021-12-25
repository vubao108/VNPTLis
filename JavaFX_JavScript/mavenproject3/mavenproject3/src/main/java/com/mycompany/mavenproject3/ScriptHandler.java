package com.mycompany.mavenproject3;
import javax.script.ScriptException;

public abstract class ScriptHandler
{
    public abstract Object executeToString( String p0,  String p1,  String p2) throws ScriptException;
    
    public abstract Object executeKetqua( String p0,  String p1,  String p2,  String p3,  String p4) throws ScriptException;
}
