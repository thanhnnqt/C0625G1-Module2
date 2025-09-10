package bai_tap_lam_them.entity;


public abstract class PhuongTien {
    private String soHieuDangKy;
    private String hangCheTao;
    private int namSanXuat;
    private String nguoiDieuPhoi;

    public PhuongTien() {
    }

    public PhuongTien(String soHieuDangKy, String hangCheTao, int namSanXuat, String nguoiDieuPhoi) {
        this.soHieuDangKy = soHieuDangKy;
        this.hangCheTao = hangCheTao;
        this.namSanXuat = namSanXuat;
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public String getSoHieuDangKy() {
        return soHieuDangKy;
    }

    public void setSoHieuDangKy(String soHieuDangKy) {
        this.soHieuDangKy = soHieuDangKy;
    }

    public String getHangCheTao() {
        return hangCheTao;
    }

    public void setHangCheTao(String hangCheTao) {
        this.hangCheTao = hangCheTao;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getNguoiDieuPhoi() {
        return nguoiDieuPhoi;
    }

    public void setNguoiDieuPhoi(String nguoiDieuPhoi) {
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public abstract String getInfoToCSV();
}
