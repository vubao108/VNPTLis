package javasript.helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.ScriptException;

import com.fasterxml.jackson.databind.ObjectMapper;




/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // 
       // JavascriptHandler scriptHandler = (JavascriptHandler)ScriptFactory.create("JAVASCRIPT");
       // String tmp_script = "var dsketqua = []; var x=1; return data + '20';";
        // String data = "D 000601 0048                2348    E                    76  30.7r 77  24.4r 87  62.7r 88  6.00Pr94   2.3Nr";
        //String result_script = scriptHandler.createScript(tmp_script);
        
        try {
            String myscript = loadScriptFromFile();
            String data = loadDataFromFile();
            Object lstOb = ScriptFactory.create("JAVASCRIPT").executeToString(data, "", myscript);
            final ObjectMapper mapperObj = new ObjectMapper();
            final String jsonStr = mapperObj.writeValueAsString(lstOb);
            System.out.println(jsonStr);
        } catch (Exception e) {
            
            System.out.println(e.getStackTrace());

        }

        
    }


    public static String loadScriptFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src\\main\\java\\javasript\\helper\\scripts\\xuly_ketqua.js")));
    }

    public static String loadDataFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src\\main\\java\\javasript\\helper\\scripts\\data.txt")));
    }
}
