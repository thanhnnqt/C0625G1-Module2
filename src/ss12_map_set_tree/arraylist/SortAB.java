package ss12_map_set_tree.arraylist;

import java.util.Comparator;

public class SortAB implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
