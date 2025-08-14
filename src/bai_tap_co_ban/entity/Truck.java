package bai_tap_co_ban.entity;

public class Truck extends Vehicle {
    public int taiTrong;

    public Truck(int bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public Truck() {
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "Truck: " + "Biển số: " + bienKiemSoat + "; Hãng sản xuất: " + hangSanXuat + "; Năm sản xuất: " + namSanXuat +
                "; Chủ sở hữu: " + chuSoHuu + "; Tải trọng: " + taiTrong;
    }
}
