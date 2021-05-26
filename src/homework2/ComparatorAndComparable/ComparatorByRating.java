package homework2.ComparatorAndComparable;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<Laptop> {
    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        return laptop1.getRating() - laptop2.getRating();
    }
}
