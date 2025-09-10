package bai_tap_lam_them.entity;


public class Drone extends PhuongTien {
    private String tamBay;

    public Drone() {
    }

    public Drone(String soHieuDangKy, String hangCheTao, int namSanXuat, String nguoiDieuPhoi, String tamBay) {
        super(soHieuDangKy, hangCheTao, namSanXuat, nguoiDieuPhoi);
        this.tamBay = tamBay;
    }

    public String getTamBay() {
        return tamBay;
    }

    public void setTamBay(String tamBay) {
        this.tamBay = tamBay;
    }

    @Override
    public String toString() {
        return "-----------Drone----------- " +
                "\n  Số hiệu đăng ký: " + getSoHieuDangKy() +
                "\n  Hãng chế tạo   : " + getHangCheTao() +
                "\n  Năm sản xuất   : " + getNamSanXuat() +
                "\n  Người điều phối: " + getNguoiDieuPhoi() +
                "\n  Tầm bay        : " + tamBay +
                "\n";
    }
    @Override
    public String getInfoToCSV() {
        return getSoHieuDangKy() + "," + getHangCheTao() + "," + getNamSanXuat() + "," + getNguoiDieuPhoi() + "," + tamBay;
    }
}
