package bai_tap_lam_them.view;

import bai_tap_lam_them.entity.Drone;
import bai_tap_lam_them.entity.HangSanXuat;

import java.util.List;

public class HangSanXuatView {
    public static void display(List<HangSanXuat> hangSanXuatList) {
        for (HangSanXuat hangSanXuat : hangSanXuatList) {
            System.out.println(hangSanXuat);
        }
    }
}
