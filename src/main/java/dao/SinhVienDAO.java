package dao;

import database.JDBCUtil;
import model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class SinhVienDAO implements DAOInterface<SinhVien>{
    public static SinhVienDAO getInstance(){
        return new SinhVienDAO();
    }

    @Override
    public int insert(SinhVien sinhVien) {
        int result = 0;
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "INSERT INTO QuanLySinhVien.sinhvien (hoDem, ten, maChuongTrinhDaoTao)" +
                    " VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sinhVien.getHoDem());
            preparedStatement.setString(2, sinhVien.getTen());
            preparedStatement.setString(3, sinhVien.getMaChuongTrinhDaoTao());

            result = preparedStatement.executeUpdate();
            System.out.println("Ban da thu thi : " + sql);
            System.out.println("so dong da thay doi : " + result);

            // b5 : dong ket noi
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public int update(SinhVien sinhVien) {
        return 0;
    }

    @Override
    public int delete(SinhVien sinhVien) {
        return 0;
    }

    @Override
    public ArrayList<SinhVien> selectAll() {
        return null;
    }

    @Override
    public SinhVien selectById(SinhVien sinhVien) {
        return null;
    }

    @Override
    public ArrayList<SinhVien> selectByCondition(String condition) {
        return null;
    }
}
