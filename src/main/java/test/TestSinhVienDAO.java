package test;

import dao.SinhVienDAO;
import model.SinhVien;

public class TestSinhVienDAO {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setHoDem("hoang");
        sinhVien.setTen("dat");
        sinhVien.setMaChuongTrinhDaoTao("CNTT");
        SinhVienDAO.getInstance().insert(sinhVien);
    }

}
