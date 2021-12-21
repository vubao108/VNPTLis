package javasript.helper;
import javax.script.ScriptException;

public abstract class ScriptHandler
{
    public abstract Object executeToString(final String p0, final String p1, final String p2) throws ScriptException;
    
    public abstract Object executeKetqua(final String p0, final String p1, final String p2, final String p3, final String p4) throws ScriptException;
}
