package ss17_binary_serialization.bai_1.arraylist_linkedlist.service;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.repository.ISanPhamRepository;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.repository.SanPhamRepository;

import java.util.List;

public class SanPhamService implements ISanPhamService {
    private final ISanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void add(SanPham sanPham) {
        sanPhamRepository.add(sanPham);
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

    public List<SanPham> sortAB() {
        ((SanPhamRepository) sanPhamRepository).sortAB();
        return ((SanPhamRepository) sanPhamRepository).sortAB();
    }

    public List<SanPham> sortBA() {
        ((SanPhamRepository) sanPhamRepository).sortBA();
        return ((SanPhamRepository) sanPhamRepository).sortBA();
    }
}
