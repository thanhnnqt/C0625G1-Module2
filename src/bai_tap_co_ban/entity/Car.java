package bai_tap_co_ban.entity;

public class Car extends Vehicle {
    public int soChoNgoi;
    public String kieuXe;

    public Car(int bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car() {
    }

    @Override
    public String getInfoToCSV() {
        return this.getBienKiemSoat()+","+this.getHangSanXuat()+","+this.getNamSanXuat()+","+this.getChuSoHuu()+","+this.getSoChoNgoi()+","+this.getKieuXe();
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return bienKiemSoat + "," + hangSanXuat + "," + namSanXuat +
                "," + chuSoHuu + "," + soChoNgoi + "," + kieuXe;
    }
}
