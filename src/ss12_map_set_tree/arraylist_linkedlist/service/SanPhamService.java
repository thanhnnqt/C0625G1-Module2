package ss12_map_set_tree.arraylist_linkedlist.service;

import ss12_map_set_tree.arraylist_linkedlist.entity.SanPham;
import ss12_map_set_tree.arraylist_linkedlist.repository.ISanPhamRepository;
import ss12_map_set_tree.arraylist_linkedlist.repository.SanPhamRepository;

import java.util.ArrayList;

public class SanPhamService implements ISanPhamService {
    private final ISanPhamRepository sanPhamRepository = new SanPhamRepository();
    @Override
    public ArrayList<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public boolean add(SanPham sanPham) {
        return sanPhamRepository.add(sanPham);
    }

    @Override
    public boolean delete(int id) {
        return sanPhamRepository.delete(id);
    }

    @Override
    public boolean search(int id) {
        return sanPhamRepository.search(id);
    }

    @Override
    public SanPham edit(int i, SanPham sanPham) {
        return sanPhamRepository.edit(i, sanPham);
    }
}
