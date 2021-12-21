package javasript.helper.Common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import javasript.helper.ScriptFactory;

public class ProcessData {

    public static void HandleFromFileSample(){
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
    public static String HandleWithInput(String data, String script){
        try {
            // String myscript = loadScriptFromFile();
            // String data = loadDataFromFile();
            Object lstOb = ScriptFactory.create("JAVASCRIPT").executeToString(data, "", script);
            final ObjectMapper mapperObj = new ObjectMapper();
            final String jsonStr = mapperObj.writeValueAsString(lstOb);
            System.out.println(jsonStr);
            return jsonStr;
        } catch (Exception e) {
            
            System.out.println(e.getStackTrace());
            return e.getMessage();
        }
    }

    public static String loadScriptFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src\\main\\java\\javasript\\helper\\scripts\\xuly_ketqua.js")));
    }

    public static String loadDataFromFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src\\main\\java\\javasript\\helper\\scripts\\data.txt")));
    }

    
}
