// 
// Decompiled by Procyon v0.5.36
// 

package com.mycompany.mavenproject3.model;

public class LayMaXN
{
    private int id;
    private String ma_barcode;
    private int maXetNghiem;
    private String tenXetNghiem;
    private int maLoaiXetNghiem;
    private String tenLoaiXetNghiem;
    private String ketQua;
    private String csbt;
    private String kiemTraCan;
    private String thoiGianCapNhat;
    private int idMay;
    private String tenMay;
    private String nguoiCapNhat;
    private String dvt;
    private String dvtt;
    private String maXnMay;
    private int idCha;
    private boolean coKetQua;
    private String soPhieu;
    private String soVaoVien;
    private String soVaoVienDt;
    private String stt;
    private int maBN;
    private String tenBN;
    private String gioiTinh;
    private int maBSChiDinh;
    private String tenBSChiDinh;
    private String makhoaChiDinh;
    private String tenKhoaChiDinh;
    private String thoiGianChiDinh;
    private String thoiGianGuiChiDinhSangLab;
    private String thoiGianLabNhanChiDinh;
    private String ngaySinh;
    private String loaiPhieu;
    private int maKhoaThucHien;
    private String tenKhoaThucHien;
    private String thoiGianLabTraKetQua;
    
    public LayMaXN() {
    }
    
    public LayMaXN(final int id, final String ma_barcode, final int maXetNghiem, final String tenXetNghiem, final int maLoaiXetNghiem, final String tenLoaiXetNghiem, final String ketQua, final String csbt, final String kiemTraCan, final String thoiGianCapNhat, final int idMay, final String tenMay, final String nguoiCapNhat, final String dvt, final String maXnMay, final int idCha, final boolean coKetQua) {
        this.id = id;
        this.ma_barcode = ma_barcode;
        this.maXetNghiem = maXetNghiem;
        this.tenXetNghiem = tenXetNghiem;
        this.maLoaiXetNghiem = maLoaiXetNghiem;
        this.tenLoaiXetNghiem = tenLoaiXetNghiem;
        this.ketQua = ketQua;
        this.csbt = csbt;
        this.kiemTraCan = kiemTraCan;
        this.thoiGianCapNhat = thoiGianCapNhat;
        this.idMay = idMay;
        this.tenMay = tenMay;
        this.nguoiCapNhat = nguoiCapNhat;
        this.dvt = dvt;
        this.maXnMay = maXnMay;
        this.idCha = idCha;
        this.coKetQua = coKetQua;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getMa_barcode() {
        return this.ma_barcode;
    }
    
    public void setMa_barcode(final String ma_barcode) {
        this.ma_barcode = ma_barcode;
    }
    
    public int getMaXetNghiem() {
        return this.maXetNghiem;
    }
    
    public void setMaXetNghiem(final int maXetNghiem) {
        this.maXetNghiem = maXetNghiem;
    }
    
    public String getTenXetNghiem() {
        return this.tenXetNghiem;
    }
    
    public void setTenXetNghiem(final String tenXetNghiem) {
        this.tenXetNghiem = tenXetNghiem;
    }
    
    public int getMaLoaiXetNghiem() {
        return this.maLoaiXetNghiem;
    }
    
    public void setMaLoaiXetNghiem(final int maLoaiXetNghiem) {
        this.maLoaiXetNghiem = maLoaiXetNghiem;
    }
    
    public String getTenLoaiXetNghiem() {
        return this.tenLoaiXetNghiem;
    }
    
    public void setTenLoaiXetNghiem(final String tenLoaiXetNghiem) {
        this.tenLoaiXetNghiem = tenLoaiXetNghiem;
    }
    
    public String getKetQua() {
        return this.ketQua;
    }
    
    public void setKetQua(final String ketQua) {
        this.ketQua = ketQua;
    }
    
    public String getCsbt() {
        return this.csbt;
    }
    
    public void setCsbt(final String csbt) {
        this.csbt = csbt;
    }
    
    public String getKiemTraCan() {
        return this.kiemTraCan;
    }
    
    public void setKiemtraCan(final String kiemTraCan) {
        this.kiemTraCan = kiemTraCan;
    }
    
    public String getthoiGianCapNhat() {
        return this.thoiGianCapNhat;
    }
    
    public void setthoiGianCapNhat(final String thoiGianCapNhat) {
        this.thoiGianCapNhat = thoiGianCapNhat;
    }
    
    public int getIdMay() {
        return this.idMay;
    }
    
    public void setIdMay(final int idMay) {
        this.idMay = idMay;
    }
    
    public String getTenMay() {
        return this.tenMay;
    }
    
    public void setTenMay(final String tenMay) {
        this.tenMay = tenMay;
    }
    
    public String getNguoiCapNhat() {
        return this.nguoiCapNhat;
    }
    
    public void setNguoiCapNhat(final String nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }
    
    public String getDvt() {
        return this.dvt;
    }
    
    public void setDvt(final String dvt) {
        this.dvt = dvt;
    }
    
    public String getMaXnMay() {
        return this.maXnMay;
    }
    
    public void setMaXnMay(final String maXnMay) {
        this.maXnMay = maXnMay;
    }
    
    public int getIdCha() {
        return this.idCha;
    }
    
    public void setIdCha(final int idCha) {
        this.idCha = idCha;
    }
    
    public boolean isCoKetQua() {
        return this.coKetQua;
    }
    
    public void setCoKetQua(final boolean coKetQua) {
        this.coKetQua = coKetQua;
    }
    
    public void setKiemTraCan(final String kiemTraCan) {
        this.kiemTraCan = kiemTraCan;
    }
    
    public String getDvtt() {
        return this.dvtt;
    }
    
    public void setDvtt(final String dvtt) {
        this.dvtt = dvtt;
    }
    
    public String getSoPhieu() {
        return this.soPhieu;
    }
    
    public void setSoPhieu(final String soPhieu) {
        this.soPhieu = soPhieu;
    }
    
    public String getSoVaoVien() {
        return this.soVaoVien;
    }
    
    public void setSoVaoVien(final String soVaoVien) {
        this.soVaoVien = soVaoVien;
    }
    
    public String getSoVaoVienDt() {
        return this.soVaoVienDt;
    }
    
    public void setSoVaoVienDt(final String soVaoVienDt) {
        this.soVaoVienDt = soVaoVienDt;
    }
    
    public String getStt() {
        return this.stt;
    }
    
    public void setStt(final String stt) {
        this.stt = stt;
    }
    
    public int getMaBN() {
        return this.maBN;
    }
    
    public void setMaBN(final int maBN) {
        this.maBN = maBN;
    }
    
    public String getTenBN() {
        return this.tenBN;
    }
    
    public void setTenBN(final String tenBN) {
        this.tenBN = tenBN;
    }
    
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(final String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public int getMaBSChiDinh() {
        return this.maBSChiDinh;
    }
    
    public void setMaBSChiDinh(final int maBSChiDinh) {
        this.maBSChiDinh = maBSChiDinh;
    }
    
    public String getTenBSChiDinh() {
        return this.tenBSChiDinh;
    }
    
    public void setTenBSChiDinh(final String tenBSChiDinh) {
        this.tenBSChiDinh = tenBSChiDinh;
    }
    
    public String getMakhoaChiDinh() {
        return this.makhoaChiDinh;
    }
    
    public void setMaKhoaChiDinh(final String makhoaChiDinh) {
        this.makhoaChiDinh = makhoaChiDinh;
    }
    
    public String getTenKhoaChiDinh() {
        return this.tenKhoaChiDinh;
    }
    
    public void setTenKhoaChiDinh(final String tenKhoaChiDinh) {
        this.tenKhoaChiDinh = tenKhoaChiDinh;
    }
    
    public String getThoiGianChiDinh() {
        return this.thoiGianChiDinh;
    }
    
    public void setThoiGianChiDinh(final String thoiGianChiDinh) {
        this.thoiGianChiDinh = thoiGianChiDinh;
    }
    
    public String getThoiGianGuiChiDinhSangLab() {
        return this.thoiGianGuiChiDinhSangLab;
    }
    
    public void setThoiGianGuiChiDinhSangLab(final String thoiGianGuiChiDinhSangLab) {
        this.thoiGianGuiChiDinhSangLab = thoiGianGuiChiDinhSangLab;
    }
    
    public String getThoiGianLabNhanChiDinh() {
        return this.thoiGianLabNhanChiDinh;
    }
    
    public void setThoiGianLabNhanChiDinh(final String thoiGianLabNhanChiDinh) {
        this.thoiGianLabNhanChiDinh = thoiGianLabNhanChiDinh;
    }
    
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(final String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String getLoaiPhieu() {
        return this.loaiPhieu;
    }
    
    public void setLoaiPhieu(final String loaiPhieu) {
        this.loaiPhieu = loaiPhieu;
    }
    
    public int getMaKhoaThucHien() {
        return this.maKhoaThucHien;
    }
    
    public void setMaKhoaThucHien(final int maKhoaThucHien) {
        this.maKhoaThucHien = maKhoaThucHien;
    }
    
    public String getTenKhoaThucHien() {
        return this.tenKhoaThucHien;
    }
    
    public void setTenKhoaThucHien(final String tenKhoaThucHien) {
        this.tenKhoaThucHien = tenKhoaThucHien;
    }
    
    public String getThoiGianLabTraKetQua() {
        return this.thoiGianLabTraKetQua;
    }
    
    public void setThoiGianLabTraKetQua(final String thoiGianLabTraKetQua) {
        this.thoiGianLabTraKetQua = thoiGianLabTraKetQua;
    }
}
