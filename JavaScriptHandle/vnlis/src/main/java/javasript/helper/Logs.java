// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper;

import org.apache.log4j.Logger;


public class Logs
{
    public static final Logger resultParse;
    public static final Logger dataMachine;
    public static final Logger searchData;
    public static final Logger error;
    public static final Logger debug;
    public static final Logger cobas6000;
    public static final Logger cobas601;
    public static final Logger au480;
    public static final Logger au680;
    public static final Logger cp2000;
    public static final Logger cobasC311;
    public static final Logger cobasE411;
    public static final Logger acltop550;
    public static final Logger acltop500;
    public static final Logger au400;
    public static final Logger scriptExcell2Chieu;
    public static final Logger luu;
    
    static {
        resultParse = Logger.getLogger("resultParse");
        dataMachine = Logger.getLogger("dataMachine");
        searchData = Logger.getLogger("searchData");
        error = Logger.getLogger("error");
        debug = Logger.getLogger("debug");
        cobas6000 = Logger.getLogger("cobas6000");
        cobas601 = Logger.getLogger("cobas601");
        au480 = Logger.getLogger("au480");
        au680 = Logger.getLogger("au680");
        cp2000 = Logger.getLogger("cp2000");
        cobasC311 = Logger.getLogger("cobasC311");
        cobasE411 = Logger.getLogger("cobasE411");
        acltop550 = Logger.getLogger("acltop550");
        acltop500 = Logger.getLogger("acltop500");
        au400 = Logger.getLogger("au400");
        scriptExcell2Chieu = Logger.getLogger("scriptExcell2Chieu");
        luu = Logger.getLogger("luu");
    }
}
