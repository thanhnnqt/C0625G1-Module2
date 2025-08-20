package ss12_map_set_tree.arraylist_linkedlist.entity;

import java.util.Comparator;

public class SortAB implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
