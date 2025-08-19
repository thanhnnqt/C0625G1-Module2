package ss12_map_set_tree.arraylist;

import java.util.Comparator;

public class SortBA implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
