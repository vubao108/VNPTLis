// // 
// // Decompiled by Procyon v0.5.36
// // 

// package model;

// import model.CauHinhChuyenTiep.CauHinhChuyenTiep;
// import java.io.Serializable;

// public class ConfigDong implements Serializable
// {
//     private static final long serialVersionUID = 8502724919537004595L;
//     private String kyTuBatDau;
//     private String kyTuKetThuc;
//     private int viTriKyTuBatDau;
//     private int viTriKyTuKetThuc;
//     private boolean tuDongAck;
//     private boolean tuDongENQ;
//     private boolean tuDongTinhKetQua;
//     private String kyTuPhanCachDong;
//     private boolean script;
//     private boolean chiNhanKetQua;
//     private String kyTuGuiKhiNhanThanhCong;
//     private String congThucThayTheKyTuGui;
//     private boolean kiemTraKyTuBDKT;
//     private boolean sapXepDSXN;
//     private boolean LRC;
//     private boolean boKhoangTrangKhiNhan;
//     private int thoiGianLayKetQua;
//     private Excel excel;
//     private int thoiGianKetNoiLaiTCPClient;
//     private Database database;
//     private CauHinhDuLieuGui cauHinhDuLieuGui;
//     private boolean isDMLis;
//     private boolean isDMHis;
//     private String thoiGianGuiDuLieuLenMayXN;
//     private boolean BT4500;
//     private boolean chuyenTiep;
//     private int loaiChuyenTiep;
//     private CauHinhChuyenTiep cauHinhChuyenTiep;
//     private boolean isnhieuQ;
//     private boolean BT1500;
//     private boolean isSHPT;
//     private boolean chkScriptHaiChieu;
//     private boolean chkOrder;
//     private boolean chkLiskgg;
//     private boolean chkOrderLiskgg;
//     private String countChar;
//     private CauHinhDuLieuHL7 cauHinhDuLieuHL7;
//     private boolean chkHL7;
//     private boolean chkACKSauKTKT;
//     private boolean chkAdvia;
//     private boolean chkMaXNMay;
    
//     public ConfigDong(final String kyTuBatDau, final String kyTuKetThuc, final int viTriKyTuBatDau, final int viTriKyTuKetThuc, final boolean tuDongAck, final boolean tuDongENQ, final boolean tuDongTinhKetQua, final String kyTuPhanCachDong, final boolean script, final boolean chiNhanKetQua, final String kyTuGuiKhiNhanThanhCong, final String congThucThayTheKyTuGui, final boolean kiemTraKyTuBDKT, final boolean sapXepDSXN, final boolean LRC, final boolean boKhoangTrangKhiNhan, final int thoiGianLayKetQua, final Excel excel, final int thoiGianKetNoiLaiTCPClient, final Database database, final CauHinhDuLieuGui cauHinhDuLieuGui, final boolean isDMLis, final boolean isDMHis, final String thoiGianGuiDuLieuLenMayXN, final boolean bt4500, final CauHinhChuyenTiep cauHinhChuyenTiep, final boolean chuyenTiep, final int loaiChuyenTiep, final boolean isnhieuQ, final boolean bt1500, final boolean SHPT, final boolean chkScriptHaiChieu, final boolean chkOrder, final boolean chkLiskgg, final boolean chkOrderLiskgg, final String countChar, final CauHinhDuLieuHL7 cauHinhDuLieuHL7, final boolean chkHL7, final boolean chkACKSauKTKT, final boolean chkAdvia, final boolean chkMaXNMay) {
//         this.thoiGianGuiDuLieuLenMayXN = "500";
//         this.kyTuBatDau = kyTuBatDau;
//         this.kyTuKetThuc = kyTuKetThuc;
//         this.viTriKyTuBatDau = viTriKyTuBatDau;
//         this.viTriKyTuKetThuc = viTriKyTuKetThuc;
//         this.tuDongAck = tuDongAck;
//         this.tuDongENQ = tuDongENQ;
//         this.tuDongTinhKetQua = tuDongTinhKetQua;
//         this.kyTuPhanCachDong = kyTuPhanCachDong;
//         this.script = script;
//         this.chiNhanKetQua = chiNhanKetQua;
//         this.kyTuGuiKhiNhanThanhCong = kyTuGuiKhiNhanThanhCong;
//         this.congThucThayTheKyTuGui = congThucThayTheKyTuGui;
//         this.kiemTraKyTuBDKT = kiemTraKyTuBDKT;
//         this.sapXepDSXN = sapXepDSXN;
//         this.LRC = LRC;
//         this.boKhoangTrangKhiNhan = boKhoangTrangKhiNhan;
//         this.thoiGianLayKetQua = thoiGianLayKetQua;
//         this.excel = excel;
//         this.thoiGianKetNoiLaiTCPClient = thoiGianKetNoiLaiTCPClient;
//         this.database = database;
//         this.cauHinhDuLieuGui = cauHinhDuLieuGui;
//         this.isDMLis = isDMLis;
//         this.isDMHis = isDMHis;
//         this.thoiGianGuiDuLieuLenMayXN = thoiGianGuiDuLieuLenMayXN;
//         this.BT4500 = bt4500;
//         this.cauHinhChuyenTiep = cauHinhChuyenTiep;
//         this.chuyenTiep = chuyenTiep;
//         this.loaiChuyenTiep = loaiChuyenTiep;
//         this.isnhieuQ = isnhieuQ;
//         this.BT1500 = bt1500;
//         this.isSHPT = SHPT;
//         this.chkScriptHaiChieu = chkScriptHaiChieu;
//         this.chkOrder = chkOrder;
//         this.chkLiskgg = chkLiskgg;
//         this.chkOrderLiskgg = chkOrderLiskgg;
//         this.countChar = countChar;
//         this.cauHinhDuLieuHL7 = cauHinhDuLieuHL7;
//         this.chkHL7 = chkHL7;
//         this.chkACKSauKTKT = chkACKSauKTKT;
//         this.chkAdvia = chkAdvia;
//         this.chkMaXNMay = chkMaXNMay;
//     }
    
//     public boolean isChkScriptHaiChieu() {
//         return this.chkScriptHaiChieu;
//     }
    
//     public void setChkScriptHaiChieu(final boolean chkScriptHaiChieu) {
//         this.chkScriptHaiChieu = chkScriptHaiChieu;
//     }
    
//     public int getThoiGianLayKetQua() {
//         return this.thoiGianLayKetQua;
//     }
    
//     public void setThoiGianLayKetQua(final int thoiGianLayKetQua) {
//         this.thoiGianLayKetQua = thoiGianLayKetQua;
//     }
    
//     public String getKyTuBatDau() {
//         return this.kyTuBatDau;
//     }
    
//     public void setKyTuBatDau(final String kyTuBatDau) {
//         this.kyTuBatDau = kyTuBatDau;
//     }
    
//     public String getKyTuKetThuc() {
//         return this.kyTuKetThuc;
//     }
    
//     public void setKyTuKetThuc(final String kyTuKetThuc) {
//         this.kyTuKetThuc = kyTuKetThuc;
//     }
    
//     public int getViTriKyTuBatDau() {
//         return this.viTriKyTuBatDau;
//     }
    
//     public void setViTriKyTuBatDau(final int viTriKyTuBatDau) {
//         this.viTriKyTuBatDau = viTriKyTuBatDau;
//     }
    
//     public int getViTriKyTuKetThuc() {
//         return this.viTriKyTuKetThuc;
//     }
    
//     public void setViTriKyTuKetThuc(final int viTriKyTuKetThuc) {
//         this.viTriKyTuKetThuc = viTriKyTuKetThuc;
//     }
    
//     public boolean isTuDongAck() {
//         return this.tuDongAck;
//     }
    
//     public void setTuDongAck(final boolean tuDongAck) {
//         this.tuDongAck = tuDongAck;
//     }
    
//     public boolean isTuDongENQ() {
//         return this.tuDongENQ;
//     }
    
//     public void setTuDongENQ(final boolean tuDongENQ) {
//         this.tuDongENQ = tuDongENQ;
//     }
    
//     public boolean isTuDongTinhKetQua() {
//         return this.tuDongTinhKetQua;
//     }
    
//     public void setTuDongTinhKetQua(final boolean tuDongTinhKetQua) {
//         this.tuDongTinhKetQua = tuDongTinhKetQua;
//     }
    
//     public String getKyTuPhanCachDong() {
//         return this.kyTuPhanCachDong;
//     }
    
//     public void setKyTuPhanCachDong(final String kyTuPhanCachDong) {
//         this.kyTuPhanCachDong = kyTuPhanCachDong;
//     }
    
//     public boolean isScript() {
//         return this.script;
//     }
    
//     public void setScript(final boolean script) {
//         this.script = script;
//     }
    
//     public boolean isChiNhanKetQua() {
//         return this.chiNhanKetQua;
//     }
    
//     public void setChiNhanKetQua(final boolean chiNhanKetQua) {
//         this.chiNhanKetQua = chiNhanKetQua;
//     }
    
//     public String getKyTuGuiKhiNhanThanhCong() {
//         return this.kyTuGuiKhiNhanThanhCong;
//     }
    
//     public void setKyTuGuiKhiNhanThanhCong(final String kyTuGuiKhiNhanThanhCong) {
//         this.kyTuGuiKhiNhanThanhCong = kyTuGuiKhiNhanThanhCong;
//     }
    
//     public String getCongThucThayTheKyTuGui() {
//         return this.congThucThayTheKyTuGui;
//     }
    
//     public void setCongThucThayTheKyTuGui(final String congThucThayTheKyTuGui) {
//         this.congThucThayTheKyTuGui = congThucThayTheKyTuGui;
//     }
    
//     public boolean isKiemTraKyTuBDKT() {
//         return this.kiemTraKyTuBDKT;
//     }
    
//     public void setKiemTraKyTuBDKT(final boolean kiemTraKyTuBDKT) {
//         this.kiemTraKyTuBDKT = kiemTraKyTuBDKT;
//     }
    
//     public boolean isSapXepDSXN() {
//         return this.sapXepDSXN;
//     }
    
//     public void setSapXepDSXN(final boolean sapXepDSXN) {
//         this.sapXepDSXN = sapXepDSXN;
//     }
    
//     public boolean isLRC() {
//         return this.LRC;
//     }
    
//     public void setLRC(final boolean LRC) {
//         this.LRC = LRC;
//     }
    
//     public boolean isBoKhoangTrangKhiNhan() {
//         return this.boKhoangTrangKhiNhan;
//     }
    
//     public void setBoKhoangTrangKhiNhan(final boolean boKhoangTrangKhiNhan) {
//         this.boKhoangTrangKhiNhan = boKhoangTrangKhiNhan;
//     }
    
//     public Excel getExcel() {
//         return this.excel;
//     }
    
//     public void setExcel(final Excel excel) {
//         this.excel = excel;
//     }
    
//     public int getThoiGianKetNoiLaiTCPClient() {
//         return this.thoiGianKetNoiLaiTCPClient;
//     }
    
//     public void setThoiGianKetNoiLaiTCPClient(final int thoiGianKetNoiLaiTCPClient) {
//         this.thoiGianKetNoiLaiTCPClient = thoiGianKetNoiLaiTCPClient;
//     }
    
//     public Database getDatabase() {
//         return this.database;
//     }
    
//     public void setDatabase(final Database database) {
//         this.database = database;
//     }
    
//     public CauHinhDuLieuGui getCauHinhDuLieuGui() {
//         return this.cauHinhDuLieuGui;
//     }
    
//     public void setCauHinhDuLieuGui(final CauHinhDuLieuGui cauHinhDuLieuGui) {
//         this.cauHinhDuLieuGui = cauHinhDuLieuGui;
//     }
    
//     public boolean isDMLis() {
//         return this.isDMLis;
//     }
    
//     public void setDMLis(final boolean DMLis) {
//         this.isDMLis = DMLis;
//     }
    
//     public boolean isDMHis() {
//         return this.isDMHis;
//     }
    
//     public void setDMHis(final boolean DMHis) {
//         this.isDMHis = DMHis;
//     }
    
//     public String getThoiGianGuiDuLieuLenMayXN() {
//         return "500";
//     }
    
//     public void setThoiGianGuiDuLieuLenMayXN(final String thoiGianGuiDuLieuLenMayXN) {
//         this.thoiGianGuiDuLieuLenMayXN = thoiGianGuiDuLieuLenMayXN;
//     }
    
//     public boolean isBT4500() {
//         return this.BT4500;
//     }
    
//     public void setBT4500(final boolean BT4500) {
//         this.BT4500 = BT4500;
//     }
    
//     public CauHinhChuyenTiep getCauHinhChuyenTiep() {
//         return this.cauHinhChuyenTiep;
//     }
    
//     public void setCauHinhChuyenTiep(final CauHinhChuyenTiep cauHinhChuyenTiep) {
//         this.cauHinhChuyenTiep = cauHinhChuyenTiep;
//     }
    
//     public boolean isChuyenTiep() {
//         return this.chuyenTiep;
//     }
    
//     public void setChuyenTiep(final boolean chuyenTiep) {
//         this.chuyenTiep = chuyenTiep;
//     }
    
//     public int getLoaiChuyenTiep() {
//         return this.loaiChuyenTiep;
//     }
    
//     public void setLoaiChuyenTiep(final int loaiChuyenTiep) {
//         this.loaiChuyenTiep = loaiChuyenTiep;
//     }
    
//     public boolean isSHPT() {
//         return this.isSHPT;
//     }
    
//     public void setSHPT(final boolean SHPT) {
//         this.isSHPT = SHPT;
//     }
    
//     public boolean isIsnhieuQ() {
//         return this.isnhieuQ;
//     }
    
//     public void setIsnhieuQ(final boolean isnhieuQ) {
//         this.isnhieuQ = isnhieuQ;
//     }
    
//     public boolean isBT1500() {
//         return this.BT1500;
//     }
    
//     public void setBT1500(final boolean BT1500) {
//         this.BT1500 = BT1500;
//     }
    
//     public boolean isChkOrder() {
//         return this.chkOrder;
//     }
    
//     public void setChkOrder(final boolean chkOrder) {
//         this.chkOrder = chkOrder;
//     }
    
//     public boolean isChkLiskgg() {
//         return this.chkLiskgg;
//     }
    
//     public void setChkLiskgg(final boolean chkLiskgg) {
//         this.chkLiskgg = chkLiskgg;
//     }
    
//     public boolean isChkOrderLiskgg() {
//         return this.chkOrderLiskgg;
//     }
    
//     public void setChkOrderLiskgg(final boolean chkOrderLiskgg) {
//         this.chkOrderLiskgg = chkOrderLiskgg;
//     }
    
//     public String getCountChar() {
//         return this.countChar;
//     }
    
//     public void setCountChar(final String countChar) {
//         this.countChar = countChar;
//     }
    
//     public CauHinhDuLieuHL7 getCauHinhDuLieuHL7() {
//         return this.cauHinhDuLieuHL7;
//     }
    
//     public void setCauHinhDuLieuHL7(final CauHinhDuLieuHL7 cauHinhDuLieuHL7) {
//         this.cauHinhDuLieuHL7 = cauHinhDuLieuHL7;
//     }
    
//     public boolean isChkHL7() {
//         return this.chkHL7;
//     }
    
//     public void setChkHL7(final boolean chkHL7) {
//         this.chkHL7 = chkHL7;
//     }
    
//     public boolean isChkACKSauKTKT() {
//         return this.chkACKSauKTKT;
//     }
    
//     public void setChkACKSauKTKT(final boolean chkACKSauKTKT) {
//         this.chkACKSauKTKT = chkACKSauKTKT;
//     }
    
//     public boolean isChkAdvia() {
//         return this.chkAdvia;
//     }
    
//     public void setChkAdvia(final boolean chkAdvia) {
//         this.chkAdvia = chkAdvia;
//     }
    
//     public boolean isChkMaXNMay() {
//         return this.chkMaXNMay;
//     }
    
//     public void setChkMaXNMay(final boolean chkMaXNMay) {
//         this.chkMaXNMay = chkMaXNMay;
//     }
// }
