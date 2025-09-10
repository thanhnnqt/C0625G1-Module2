package bai_tap_lam_them.controller;

import bai_tap_lam_them.entity.HangSanXuat;
import bai_tap_lam_them.service.HangSanXuatService;
import bai_tap_lam_them.service.IHangSanXuatService;
import bai_tap_lam_them.view.HangSanXuatView;

import java.util.ArrayList;
import java.util.List;

public class HangSanXuatController {
    public static void display() {
        IHangSanXuatService hangSanXuatService = new HangSanXuatService();
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
        HangSanXuatView.display(hangSanXuatList);
    }
}
