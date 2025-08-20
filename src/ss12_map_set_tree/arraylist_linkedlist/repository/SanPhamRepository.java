package ss12_map_set_tree.arraylist_linkedlist.repository;

import ss12_map_set_tree.arraylist_linkedlist.entity.SanPham;

import java.util.ArrayList;

public class SanPhamRepository implements ISanPhamRepository {
    public static ArrayList<SanPham> sanPhamList = new ArrayList<>();

    static {
        SanPham sanPham1 = new SanPham(1, "Thịt Gà", 100000);
        SanPham sanPham2 = new SanPham(2, "Thịt Vịt", 80000);
        SanPham sanPham3 = new SanPham(3, "Thịt Lợn", 120000);
        sanPhamList.add(sanPham1);
        sanPhamList.add(sanPham2);
        sanPhamList.add(sanPham3);
    }

    @Override
    public ArrayList<SanPham> findAll() {
        return sanPhamList;
    }

    @Override
    public boolean add(SanPham sanPham) {
        sanPhamList.add(sanPham);
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getId() == id) {
                sanPhamList.remove(sanPham);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int id) {
        for (SanPham sanPham : sanPhamList) {
            if (id == sanPham.getId()) {
                System.out.println(sanPham);
                return true;
            }
        }
        return false;
    }

    @Override
    public SanPham edit(int i, SanPham sanPham) {
        for (int j = 0; j < sanPhamList.size(); j++) {
            if (sanPhamList.get(i).getId() == i) {
                sanPhamList.set(i, sanPham);
                return sanPhamList.get(i);
            }
        }
        return null;
    }
}
