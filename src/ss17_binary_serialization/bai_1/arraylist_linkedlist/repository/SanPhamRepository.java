package ss17_binary_serialization.bai_1.arraylist_linkedlist.repository;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;
import ss17_binary_serialization.bai_1.arraylist_linkedlist.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository implements ISanPhamRepository {
    private final String SANPHAM_DAT = "src/ss17_binary_serialization/bai_1/arraylist_linkedlist/data/sanpham.dat";

    @Override
    public List<SanPham> findAll() {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        return sanPhamList;
    }

    @Override
    public void add(SanPham sanPham) {
        List<SanPham> sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        sanPhamList.add(sanPham);
        ReadAndWriteFile.writeListSObjectToDat(SANPHAM_DAT, sanPhamList);
    }

    @Override
    public boolean delete(int id) {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (id == sanPhamList.get(i).getId()) {
                sanPhamList.remove(sanPhamList.get(i).getId());
            }
        }
        ReadAndWriteFile.writeListSObjectToDat(SANPHAM_DAT, sanPhamList);
        return false;
    }

    @Override
    public boolean search(int id) {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
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
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        for (int j = 0; j < sanPhamList.size(); j++) {
            if (sanPhamList.get(j).getId() == i) {
                sanPhamList.set(j, sanPham);
                ReadAndWriteFile.writeListSObjectToDat(SANPHAM_DAT, sanPhamList);
                return sanPhamList.get(j);
            }
        }
        return null;
    }
    public List<SanPham> sortAB () {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        sanPhamList.sort(new SortAB());
        return sanPhamList;
    }

    public List<SanPham> sortBA () {
        List<SanPham> sanPhamList = new ArrayList<>();
        sanPhamList = ReadAndWriteFile.readListObjectFromDat(SANPHAM_DAT);
        sanPhamList.sort(new SortBA());
        return sanPhamList;
    }
}
