package homework2.ComparatorAndComparable;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        return laptop1.getPrice() - laptop2.getPrice();
    }
}
