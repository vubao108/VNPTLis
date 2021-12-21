// 
// Decompiled by Procyon v0.5.36
// 
package javasript.helper;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javasript.helper.model.KetQuaCauHinhMay_ChiTiet;
import java.util.ArrayList;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import javasript.helper.model.KetQuaCauHinhMay;
import javasript.helper.model.CauHinhMay;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngineManager;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javasript.helper.Logs;

public class JavascriptHandler extends ScriptHandler
{
    JavascriptHandler() {
    }
    
    public static String createFormHtml5(final String input) {
        final StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<meta charset='utf-8'>\n");
        sb.append("<script>\n");
        sb.append("function onClickTest() {\n");
        sb.append(createScript(input) + "\n");
        sb.append("}\n");
        sb.append("</script>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<button onClick='onClickTest();'>Test</button>\n");
        sb.append("</body>\n");
        sb.append("</html>");
        return sb.toString();
    }
    
    public static String createScript(final String input) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(getVarData("JSHANDLER_CRLN_DATA_DECODED", input));
            sb.append(getVarData("\nJSHANDLER_CRLN_USERDATA_DECODED", null));
            sb.append("\n(function (data, userdata) {");
            sb.append("\n\t//Your script here\n");
            sb.append("})(JSHANDLER_CRLN_DATA_DECODED, JSHANDLER_CRLN_USERDATA_DECODED);");
            return sb.toString();
        }
        catch (Exception ex) {
            Logs.error.error((Object)("FrmDMMayXN createScript error: " + ex.toString()));
            System.out.println("FrmDMMayXN createScript error: " + ex.toString());
            return null;
        }
    }
    
    public static String getVarData(final String varName, final String varData) throws UnsupportedEncodingException, URISyntaxException {
        if (varData != null) {
            String s = "var " + varName + " = decodeURIComponent('";
            s += URLEncoder.encode(varData, "UTF-8").replace("+", "%20").replace("~", "%7E").replace("'", "%27").replace("!", "%21").replace("(", "%28").replace(")", "%29");
            s += "');";
            return s;
        }
        return "var " + varName + " = null;";
    }
    
    @Override
    public Object executeToString(final String data, final String userData, final String script) throws ScriptException {
        try {
            Logs.debug.error((Object)("data nh\u1eadn: " + data));
            final StringBuilder sb = new StringBuilder();
            sb.append(getVarData("JSHANDLER_CRLN_DATA_DECODED", data));
            sb.append(getVarData("JSHANDLER_CRLN_USERDATA_DECODED", userData));
            sb.append("(function (data, userdata) {");
            sb.append(script);
            sb.append("})(JSHANDLER_CRLN_DATA_DECODED, JSHANDLER_CRLN_USERDATA_DECODED);");
            final ScriptEngineManager scriptManager = new ScriptEngineManager();
            final ScriptEngine scriptEngine = scriptManager.getEngineByName("JavaScript");
            Logs.debug.error((Object)sb.toString());
            return scriptEngine.eval(sb.toString());
        }
        catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JavascriptHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        catch (URISyntaxException ex2) {
            Logger.getLogger(JavascriptHandler.class.getName()).log(Level.SEVERE, null, ex2);
            return null;
        }
    }
    
    @Override
    public Object executeKetqua(final String data, final String userData, final String script, final String nhanbiet, final String loaiKQ) throws ScriptException {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(getVarData("JSHANDLER_CRLN_DATA_DECODED", data));
            sb.append(getVarData("JSHANDLER_CRLN_USERDATA_DECODED", userData));
            sb.append(getVarData("JSHANDLER_CRLN_NHANBIET_DECODED", nhanbiet));
            sb.append(getVarData("JSHANDLER_CRLN_LOAIKQ_DECODED", loaiKQ));
            sb.append("(function (data, userdata, nhanbiet, loaiKQ) {");
            sb.append(script);
            sb.append("})(JSHANDLER_CRLN_DATA_DECODED, JSHANDLER_CRLN_USERDATA_DECODED, JSHANDLER_CRLN_NHANBIET_DECODED, JSHANDLER_CRLN_LOAIKQ_DECODED);");
            final ScriptEngineManager scriptManager = new ScriptEngineManager();
            final ScriptEngine scriptEngine = scriptManager.getEngineByName("JavaScript");
            Logs.scriptExcell2Chieu.error((Object)("t\u00ednh script file Excel " + loaiKQ + " : " + sb.toString()));
            return scriptEngine.eval(sb.toString());
        }
        catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JavascriptHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        catch (URISyntaxException ex2) {
            Logger.getLogger(JavascriptHandler.class.getName()).log(Level.SEVERE, null, ex2);
            return null;
        }
    }
    
    public static KetQuaCauHinhMay executeScript(final String dataReceive, final CauHinhMay may, final String date, final String scriptExecute) {
        Logs.debug.error((Object)"executeScript");
        String script;
        if (scriptExecute.isEmpty()) {
            script = new String(may.getScript());
        }
        else {
            script = scriptExecute;
        }
        KetQuaCauHinhMay ketQuaCauHinhMay = new KetQuaCauHinhMay();
        try {
            String textInALine = "";
            String line = "";
            if (may.getMaMay() == 17) {
                try {
                    final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\LAB\\script.properties"), "UTF8"));
                    while ((line = br.readLine()) != null) {
                        if (!line.equals("")) {
                            textInALine = textInALine + "\n" + line;
                        }
                    }
                }
                catch (IOException e) {
                    Logs.debug.error((Object)("l\u1ed7i script: " + e));
                }
            }
            Object lstOb = new Object();
            if (textInALine.length() > 0) {
                lstOb = ScriptFactory.create("JAVASCRIPT").executeToString(dataReceive, "", textInALine);
            }
            else {
                lstOb = ScriptFactory.create("JAVASCRIPT").executeToString(dataReceive, "", script.trim());
            }
            final ObjectMapper mapperObj = new ObjectMapper();
            final String jsonStr = mapperObj.writeValueAsString(lstOb);
            Logs.debug.error((Object)("KQ sau khi t\u00ednh: " + jsonStr));
            if (lstOb != null) {
                final ScriptObjectMirror scriptObjectMirror = (ScriptObjectMirror)lstOb;
                ketQuaCauHinhMay.setDvtt(may.getMaDonVi());
                ketQuaCauHinhMay.setNgayKQ(date);
                ketQuaCauHinhMay.setMaMay(may.getMaMay());
                ketQuaCauHinhMay.setMaMay4210(may.getMaMay4210());
                final List<KetQuaCauHinhMay_ChiTiet> ketQuaCauHinhMayChiTiets = new ArrayList<KetQuaCauHinhMay_ChiTiet>();
                for (int i = 0; i < scriptObjectMirror.size(); ++i) {
                    final KetQuaCauHinhMay_ChiTiet ketQuaCauHinhMayChiTiet = new KetQuaCauHinhMay_ChiTiet();
                    final Map map = (Map)scriptObjectMirror.getSlot(i);
                    if (map.get("stt") != null) {
                        ketQuaCauHinhMayChiTiet.setStt(map.get("stt").toString());
                    }
                    if (map.get("ma_xn_may") != null) {
                        ketQuaCauHinhMayChiTiet.setMaXNMay(map.get("ma_xn_may").toString());
                    }
                    if (map.get("ketqua") != null) {
                        ketQuaCauHinhMayChiTiet.setKetqua(map.get("ketqua").toString());
                    }
                    ketQuaCauHinhMayChiTiets.add(ketQuaCauHinhMayChiTiet);
                }
                ketQuaCauHinhMay.setKetQuaCauHinhMayChiTiets(ketQuaCauHinhMayChiTiets);
                final List<Map<String, String>> dsXns = new ArrayList<Map<String, String>>();
                HashMap<String, String> maXn = new HashMap<String, String>();
                for (int j = 0; j < ketQuaCauHinhMay.getKetQuaCauHinhMayChiTiets().size(); ++j) {
                    maXn = new HashMap<String, String>();
                    maXn.put("maXNGui", ketQuaCauHinhMay.getKetQuaCauHinhMayChiTiets().get(j).getKetqua() + ";" + ketQuaCauHinhMay.getKetQuaCauHinhMayChiTiets().get(j).getMaXNMay() + ";" + ketQuaCauHinhMay.getKetQuaCauHinhMayChiTiets().get(j).getStt());
                    dsXns.add(maXn);
                }
                Logs.debug.error((Object)("executed data: " + dsXns.toString()));
            }
        }
        catch (Exception ex) {
            ketQuaCauHinhMay = null;
            Logs.error.error((Object)("JavascriptHandler.executeScript: " + ex));
            System.out.println("JavascriptHandler.executeScript: " + ex);
        }
        return ketQuaCauHinhMay;
    }
}
