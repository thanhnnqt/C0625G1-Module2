package bai_tap_on_thi.entity;

import java.util.List;

public class DapAn {
    private String maCauHoi;
    private String maDapAn;
    private String noiDungDapAn;

    public DapAn() {
    }

    public DapAn(String maCauHoi, String maDapAn, String noiDungDapAn) {
        this.maCauHoi = maCauHoi;
        this.maDapAn = maDapAn;
        this.noiDungDapAn = noiDungDapAn;
    }

    public String getMaCauHoi() {
        return maCauHoi;
    }

    public void setMaCauHoi(String maCauHoi) {
        this.maCauHoi = maCauHoi;
    }

    public String getMaDapAn() {
        return maDapAn;
    }

    public void setMaDapAn(String maDapAn) {
        this.maDapAn = maDapAn;
    }


    public String getNoiDungDapAn() {
        return noiDungDapAn;
    }

    public void setNoiDungDapAn(String noiDungDapAn) {
        this.noiDungDapAn = noiDungDapAn;
    }


    @Override
    public String toString() {
        return null;
    }

    public void display() {
        System.out.println("Mã đáp án: " + maDapAn + ", Nội dung đáp án: " + noiDungDapAn);
    }

    public String getInfoToCSV() {
        return getMaCauHoi() + "," + maDapAn + "," + noiDungDapAn;
    }
}
