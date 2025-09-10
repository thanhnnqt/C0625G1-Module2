package bai_tap_on_thi.entity;

import java.util.ArrayList;
import java.util.List;

public class CauHoi {
    private String noiDungCauHoi;
    private String maCauHoi;
    private List<DapAn> dapAns = new ArrayList<>();

    public CauHoi() {
    }

    public CauHoi(String maCauHoi, String noiDungCauHoi) {
        this.maCauHoi = maCauHoi;
        this.noiDungCauHoi = noiDungCauHoi;
    }

    public String getMaCauHoi() {
        return maCauHoi;
    }

    public void setMaCauHoi(String maCauHoi) {
        this.maCauHoi = maCauHoi;
    }

    public String getNoiDungCauHoi() {
        return noiDungCauHoi;
    }

    public void setNoiDungCauHoi(String noiDungCauHoi) {
        this.noiDungCauHoi = noiDungCauHoi;
    }

    public void display() {
        System.out.println("Mã câu hỏi: " + maCauHoi + ", Nội dung câu hỏi: " + noiDungCauHoi);
        for (DapAn dapAn : dapAns) {
            dapAn.display();
        }
    }

    public String getInfoToCSV() {
        return getMaCauHoi() + "," + noiDungCauHoi;
    }

    public void addDapAn(DapAn dapAn) {
        dapAns.add(dapAn);
    }

    public List<DapAn> getDapAns() {
        return dapAns;
    }
}
