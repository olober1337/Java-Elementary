package lesson2;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.weight - o2.weight;
    }
}
