package ss17_binary_serialization.bai_1.arraylist_linkedlist.repository;

import ss17_binary_serialization.bai_1.arraylist_linkedlist.entity.SanPham;

import java.util.Comparator;

public class SortAB implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
