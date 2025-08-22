package ss17_binary_serialization.bai_1.arraylist_linkedlist.service;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public interface ISanPhamService {
    List<SanPham> findAll();
    void add(SanPham sanPham);
    boolean delete(int id);
    boolean search(int id);
    SanPham edit(int i, SanPham sanPham);
}
