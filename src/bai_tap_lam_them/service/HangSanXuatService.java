package bai_tap_lam_them.service;

import bai_tap_lam_them.entity.HangSanXuat;
import bai_tap_lam_them.repository.HangSanXuatRepository;
import bai_tap_lam_them.repository.IHangSanXuatRepository;

import java.util.List;

public class HangSanXuatService implements IHangSanXuatService{
    private final IHangSanXuatRepository hangSanXuatRepository = new HangSanXuatRepository();

    public List<HangSanXuat> getAllManufacturers() {
        return hangSanXuatRepository.findAll();
    }
    public void displayManufacturers(List<HangSanXuat> hangList) {
        if (hangList.isEmpty()) {
            System.out.println("Chưa có hãng nào.");
            return;
        }

        System.out.println("Danh sách hãng chế tạo:");
        for (int i = 0; i < hangList.size(); i++) {
            System.out.println((i + 1) + ". " + hangList.get(i).getTenHang());
        }
    }

    @Override
    public List findAll() {
        return List.of();
    }
}
