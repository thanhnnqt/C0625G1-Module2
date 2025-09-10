package bai_tap_lam_them.entity;

public class HangSanXuat {
    private String maSoHang;
    private String tenHang;
    private String nuocSanXuat;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSoHang, String tenHang, String nuocSanXuat) {
        this.maSoHang = maSoHang;
        this.tenHang = tenHang;
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getMaSoHang() {
        return maSoHang;
    }

    public void setMaSoHang(String maSoHang) {
        this.maSoHang = maSoHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }
}
