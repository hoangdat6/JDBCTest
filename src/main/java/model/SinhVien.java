package model;

import java.sql.Date;

public class SinhVien {
    private Integer maSinhVien;
    private String hoDem;
    private String ten;
    private Date ngaySinh;
    private Integer namNhapHoc;
    private String maChuongTrinhDaoTao;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String hoDem, String ten, Date ngaySinh, Integer namNhapHoc, String maChuongTrinhDaoTao, boolean gioiTinh) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.namNhapHoc = namNhapHoc;
        this.maChuongTrinhDaoTao = maChuongTrinhDaoTao;
        this.gioiTinh = gioiTinh;
    }

    public Integer getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(Integer maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Integer getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(Integer namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    public String getMaChuongTrinhDaoTao() {
        return maChuongTrinhDaoTao;
    }

    public void setMaChuongTrinhDaoTao(String maChuongTrinhDaoTao) {
        this.maChuongTrinhDaoTao = maChuongTrinhDaoTao;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoDem='" + hoDem + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", namNhapHoc=" + namNhapHoc +
                ", maChuongTrinhDaoTao='" + maChuongTrinhDaoTao + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
