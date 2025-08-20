package ss12_map_set_tree.arraylist_linkedlist.entity;

import java.util.Comparator;

public class SortBA implements Comparator<SanPham> {

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
