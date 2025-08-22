package ss17_binary_serialization.bai_1.arraylist_linkedlist.repository;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;

import java.util.List;

public interface ISanPhamRepository {
    List<SanPham> findAll();
    void add(SanPham sanPham);
    boolean delete(int id);
    boolean search(int id);
    SanPham edit(int i, SanPham sanPham);
}
