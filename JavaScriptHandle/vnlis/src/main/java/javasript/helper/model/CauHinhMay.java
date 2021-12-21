// 
// Decompiled by Procyon v0.5.36
// 

package javasript.helper.model;

import java.util.UUID;
import javax.swing.Timer;
import java.util.List;
import java.sql.Connection;
import java.net.ServerSocket;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.net.Socket;
import jssc.SerialPort;
import java.io.Serializable;

public class CauHinhMay implements Serializable
{
    private static final long serialVersionUID = 8502724919537004595L;
    private transient SerialPort serialPort;
    @JsonIgnore
    private transient Socket socket;
    @JsonIgnore
    private transient ServerSocket serverSocket;
    @JsonIgnore
    private boolean isCloseTCPClient;
    private transient Connection connection;
    private int ghiLogs;
    private String trangThaiMay;
    private String dvtt;
    private int maDonVi;
    private int maMay;
    private String maMay4210;
    private int loai;
    private ComPort comPort;
    private String pathName;
    private String ipServer;
    private int portServerConnect;
    private int portServer;
    private String kyTuBatDau;
    private String kyTuKetThuc;
    private int viTriKyTuBatDau;
    private int viTriKyTuKetThuc;
    private boolean tuDongAck;
    private boolean tuDongTinhKetQua;
    private String kyTuPhanCachDong;
    private int maTinhToan;
    private String tenMay;
    private boolean suDung;
    private int thoiGianLayKetQua;
    private boolean haiChieu;
    private byte[] script;
    private byte[] ketQua;
    private boolean cauHinhChuan;
    private byte[] mapDanhMuc;
    private byte[] ttCauHinh;
    private List<Integer> phongXns;
    private StringBuilder builder;
    private StringBuilder sendDataBuilder;
    @JsonIgnore
    private Timer timer;
    @JsonIgnore
    private transient Socket socketServer;
    @JsonIgnore
    private transient boolean flag2Chieu;
    @JsonIgnore
    private transient String tenFile;
    @JsonIgnore
    private transient String uuid;
    @JsonIgnore
    private transient int countChar;
    @JsonIgnore
    private transient int dongTrong;
    @JsonIgnore
    private transient int countListener1;
    @JsonIgnore
    private transient int countListener2;
    
    public String getTenFile() {
        return this.tenFile;
    }
    
    public void setTenFile(final String tenFile) {
        this.tenFile = tenFile;
    }
    
    public boolean isFlag2Chieu() {
        return this.flag2Chieu;
    }
    
    public void setFlag2Chieu(final boolean flag2Chieu) {
        this.flag2Chieu = flag2Chieu;
    }
    
    public String getUuid() {
        return this.uuid;
    }
    
    public Timer getTimer() {
        return this.timer;
    }
    
    public void setTimer(final Timer timer) {
        this.timer = timer;
    }
    
    public StringBuilder getBuilder() {
        return this.builder;
    }
    
    public void setBuilder(final StringBuilder builder) {
        this.builder = builder;
    }
    
    public StringBuilder getSendDataBuilder() {
        return this.sendDataBuilder;
    }
    
    public void setSendDataBuilder(final StringBuilder sendDataBuilder) {
        this.sendDataBuilder = sendDataBuilder;
    }
    
    public CauHinhMay() {
        this.flag2Chieu = false;
        this.countChar = 0;
        this.dongTrong = 0;
        this.countListener1 = 0;
        this.countListener2 = 0;
        this.uuid = UUID.randomUUID().toString();
        System.out.println("kh\u1ecfi t\u1ea1o c\u1ea5u h\u00ecnh m\u00e1y" + this.uuid);
    }
    
    public CauHinhMay(final int maDonVi, final int maMay, final String maMay4210, final int loai, final ComPort comPort, final String pathName, final String ipServer, final int portServerConnect, final int portServer, final String kyTuBatDau, final String kyTuKetThuc, final int viTriKyTuBatDau, final int viTriKyTuKetThuc, final boolean tuDongAck, final boolean tuDongTinhKetQua, final String kyTuPhanCachDong, final int maTinhToan, final String tenMay, final boolean suDung, final int thoiGianLayKetQua, final boolean haiChieu, final byte[] script, final byte[] ketQua, final boolean cauHinhChuan, final byte[] mapDanhMuc, final byte[] ttCauHinh, final int ghiLogs, final List<Integer> phongXns) {
        this.flag2Chieu = false;
        this.countChar = 0;
        this.dongTrong = 0;
        this.countListener1 = 0;
        this.countListener2 = 0;
        this.maDonVi = maDonVi;
        this.maMay = maMay;
        this.maMay4210 = maMay4210;
        this.loai = loai;
        this.comPort = comPort;
        this.pathName = pathName;
        this.ipServer = ipServer;
        this.portServerConnect = portServerConnect;
        this.portServer = portServer;
        this.kyTuBatDau = kyTuBatDau;
        this.kyTuKetThuc = kyTuKetThuc;
        this.viTriKyTuBatDau = viTriKyTuBatDau;
        this.viTriKyTuKetThuc = viTriKyTuKetThuc;
        this.tuDongAck = tuDongAck;
        this.tuDongTinhKetQua = tuDongTinhKetQua;
        this.kyTuPhanCachDong = kyTuPhanCachDong;
        this.maTinhToan = maTinhToan;
        this.tenMay = tenMay;
        this.suDung = suDung;
        this.thoiGianLayKetQua = thoiGianLayKetQua;
        this.haiChieu = haiChieu;
        this.script = script;
        this.ketQua = ketQua;
        this.cauHinhChuan = cauHinhChuan;
        this.mapDanhMuc = mapDanhMuc;
        this.ttCauHinh = ttCauHinh;
        this.ghiLogs = ghiLogs;
        this.phongXns = phongXns;
    }
    
    public List<Integer> getphongXns() {
        return this.phongXns;
    }
    
    public void setphongXns(final List<Integer> phongXns) {
        this.phongXns = phongXns;
    }
    
    public String getMaMay4210() {
        return this.maMay4210;
    }
    
    public void setMaMay4210(final String maMay4210) {
        this.maMay4210 = maMay4210;
    }
    
    public SerialPort getSerialPort() {
        return this.serialPort;
    }
    
    public void setSerialPort(final SerialPort serialPort) {
        this.serialPort = serialPort;
    }
    
    public Socket getSocket() {
        return this.socket;
    }
    
    public void setSocket(final Socket socket) {
        this.socket = socket;
    }
    
    public ServerSocket getServerSocket() {
        return this.serverSocket;
    }
    
    public void setServerSocket(final ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    
    public boolean isCloseTCPClient() {
        return this.isCloseTCPClient;
    }
    
    public void setCloseTCPClient(final boolean closeTCPClient) {
        this.isCloseTCPClient = closeTCPClient;
    }
    
    public int getGhiLogs() {
        return this.ghiLogs;
    }
    
    public void setGhiLogs(final int ghiLogs) {
        this.ghiLogs = ghiLogs;
    }
    
    public String getTrangThaiMay() {
        return this.trangThaiMay;
    }
    
    public void setTrangThaiMay(final String trangThaiMay) {
        this.trangThaiMay = trangThaiMay;
    }
    
    public String getDvtt() {
        return this.dvtt;
    }
    
    public void setDvtt(final String dvtt) {
        this.dvtt = dvtt;
    }
    
    public int getMaDonVi() {
        return this.maDonVi;
    }
    
    public void setMaDonVi(final int maDonVi) {
        this.maDonVi = maDonVi;
    }
    
    public int getMaMay() {
        return this.maMay;
    }
    
    public void setMaMay(final int maMay) {
        this.maMay = maMay;
    }
    
    public int getLoai() {
        return this.loai;
    }
    
    public void setLoai(final int loai) {
        this.loai = loai;
    }
    
    public ComPort getComPort() {
        return this.comPort;
    }
    
    public void setComPort(final ComPort comPort) {
        this.comPort = comPort;
    }
    
    public String getPathName() {
        return this.pathName;
    }
    
    public void setPathName(final String pathName) {
        this.pathName = pathName;
    }
    
    public String getIpServer() {
        return this.ipServer;
    }
    
    public void setIpServer(final String ipServer) {
        this.ipServer = ipServer;
    }
    
    public int getPortServerConnect() {
        return this.portServerConnect;
    }
    
    public void setPortServerConnect(final int portServerConnect) {
        this.portServerConnect = portServerConnect;
    }
    
    public int getPortServer() {
        return this.portServer;
    }
    
    public void setPortServer(final int portServer) {
        this.portServer = portServer;
    }
    
    public String getKyTuBatDau() {
        return this.kyTuBatDau;
    }
    
    public void setKyTuBatDau(final String kyTuBatDau) {
        this.kyTuBatDau = kyTuBatDau;
    }
    
    public String getKyTuKetThuc() {
        return this.kyTuKetThuc;
    }
    
    public void setKyTuKetThuc(final String kyTuKetThuc) {
        this.kyTuKetThuc = kyTuKetThuc;
    }
    
    public int getViTriKyTuBatDau() {
        return this.viTriKyTuBatDau;
    }
    
    public void setViTriKyTuBatDau(final int viTriKyTuBatDau) {
        this.viTriKyTuBatDau = viTriKyTuBatDau;
    }
    
    public int getViTriKyTuKetThuc() {
        return this.viTriKyTuKetThuc;
    }
    
    public void setViTriKyTuKetThuc(final int viTriKyTuKetThuc) {
        this.viTriKyTuKetThuc = viTriKyTuKetThuc;
    }
    
    public boolean isTuDongAck() {
        return this.tuDongAck;
    }
    
    public void setTuDongAck(final boolean tuDongAck) {
        this.tuDongAck = tuDongAck;
    }
    
    public boolean isTuDongTinhKetQua() {
        return this.tuDongTinhKetQua;
    }
    
    public void setTuDongTinhKetQua(final boolean tuDongTinhKetQua) {
        this.tuDongTinhKetQua = tuDongTinhKetQua;
    }
    
    public String getKyTuPhanCachDong() {
        return this.kyTuPhanCachDong;
    }
    
    public void setKyTuPhanCachDong(final String kyTuPhanCachDong) {
        this.kyTuPhanCachDong = kyTuPhanCachDong;
    }
    
    public int getMaTinhToan() {
        return this.maTinhToan;
    }
    
    public void setMaTinhToan(final int maTinhToan) {
        this.maTinhToan = maTinhToan;
    }
    
    public String getTenMay() {
        return this.tenMay;
    }
    
    public void setTenMay(final String tenMay) {
        this.tenMay = tenMay;
    }
    
    public boolean isSuDung() {
        return this.suDung;
    }
    
    public void setSuDung(final boolean suDung) {
        this.suDung = suDung;
    }
    
    public int getThoiGianLayKetQua() {
        return this.thoiGianLayKetQua;
    }
    
    public void setThoiGianLayKetQua(final int thoiGianLayKetQua) {
        this.thoiGianLayKetQua = thoiGianLayKetQua;
    }
    
    public boolean isHaiChieu() {
        return this.haiChieu;
    }
    
    public void setHaiChieu(final boolean haiChieu) {
        this.haiChieu = haiChieu;
    }
    
    public byte[] getScript() {
        return this.script;
    }
    
    public void setScript(final byte[] script) {
        this.script = script;
    }
    
    public byte[] getKetQua() {
        return this.ketQua;
    }
    
    public void setKetQua(final byte[] ketQua) {
        this.ketQua = ketQua;
    }
    
    public boolean isCauHinhChuan() {
        return this.cauHinhChuan;
    }
    
    public void setCauHinhChuan(final boolean cauHinhChuan) {
        this.cauHinhChuan = cauHinhChuan;
    }
    
    public byte[] getMapDanhMuc() {
        return this.mapDanhMuc;
    }
    
    public void setMapDanhMuc(final byte[] mapDanhMuc) {
        this.mapDanhMuc = mapDanhMuc;
    }
    
    public byte[] getTtCauHinh() {
        return this.ttCauHinh;
    }
    
    public void setTtCauHinh(final byte[] ttCauHinh) {
        this.ttCauHinh = ttCauHinh;
    }
    
    public Connection getConnection() {
        return this.connection;
    }
    
    public void setConnection(final Connection connection) {
        this.connection = connection;
    }
    
    public Socket getSocketServer() {
        return this.socketServer;
    }
    
    public void setSocketServer(final Socket socketServer) {
        this.socketServer = socketServer;
    }
    
    public int getCountChar() {
        return this.countChar;
    }
    
    public void setCountChar(final int countChar) {
        this.countChar = countChar;
    }
    
    public int getDongTrong() {
        return this.dongTrong;
    }
    
    public void setDongTrong(final int dongTrong) {
        this.dongTrong = dongTrong;
    }
    
    public int getCountListener1() {
        return this.countListener1;
    }
    
    public void setCountListener1(final int countListener1) {
        this.countListener1 = countListener1;
    }
    
    public int getCountListener2() {
        return this.countListener2;
    }
    
    public void setCountListener2(final int countListener2) {
        this.countListener2 = countListener2;
    }
}
