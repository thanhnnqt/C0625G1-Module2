package ss12_map_set_tree.arraylist_linkedlist.repository;

import ss12_map_set_tree.arraylist_linkedlist.entity.SanPham;

import java.util.ArrayList;

public interface ISanPhamRepository {
    ArrayList<SanPham> findAll();
    boolean add(SanPham sanPham);
    boolean delete(int id);
    boolean search(int id);
    SanPham edit(int i, SanPham sanPham);
}
