package bai_tap_lam_them.entity;

import java.time.LocalTime;

public class Xe extends PhuongTien {
    private int chongBucXa;

    public Xe() {
    }

    @Override
    public String getInfoToCSV() {
        return getSoHieuDangKy() + "," + getHangCheTao() + "," + getNamSanXuat() + "," + getNguoiDieuPhoi() + "," + chongBucXa;
    }

    public Xe(String soHieuDangKy, String hangCheTao, int namSanXuat, String nguoiDieuPhoi, int chongBucXa) {
        super(soHieuDangKy, hangCheTao, namSanXuat, nguoiDieuPhoi);
        this.chongBucXa = chongBucXa;
    }

    public int getChongBucXa() {
        return chongBucXa;
    }

    public void setChongBucXa(int chongBucXa) {
        this.chongBucXa = chongBucXa;
    }

    @Override
    public String toString() {
        return "-----------Xe----------- " +
                "\n  Số hiệu đăng ký: " + getSoHieuDangKy() +
                "\n  Hãng chế tạo   : " + getHangCheTao() +
                "\n  Năm sản xuất   : " + getNamSanXuat() +
                "\n  Người điều phối: " + getNguoiDieuPhoi() +
                "\n  Chống bức xạ   : " + chongBucXa +
                "\n";
    }
}
