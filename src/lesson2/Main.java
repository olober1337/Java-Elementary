package lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("British", 5, 200, 1000);
        Animal dog = new Animal("Husky", 30, 500, 1000);
        Animal bird = new Animal("Correla", 1, 1000, 500);

        Animal[] animals = {cat, dog , bird};

//        Arrays.sort(animals, (o1, o2) -> o1.price - o2.price);
//        Arrays.sort(animals, new homework2.Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                if (o1.price == o2.price) {
//                    return o1.weight - o2.weight;
//                } else {
//                    return o1.price - o2.price;
//                }
//            }
//        });

        Arrays.sort(animals, new ComparatorByPrice());

        for (Animal tmp : animals) {
            System.out.println(tmp);
        }

        System.out.println();

    }
}
