package homework2.ComparatorAndComparable;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Laptop lenovo = new Laptop("Y570", 1000, 16, 8, "Lenovo");
        Laptop asus = new Laptop("ROG Strix", 1500, 32, 7, "Asus");
        Laptop dell = new Laptop("Alienware", 2000, 64, 9, "Dell");
        Laptop macbook = new Laptop("Pro", 1600, 16, 6, "MacBook");
        Laptop acer = new Laptop("ZenBook", 1100, 8, 5, "Acer");

        Laptop[] array = {lenovo, asus, dell, macbook, acer};

        System.out.println("Comparator by model : ");
        Arrays.sort(array, new ComparatorByModel());
        for (Laptop laptop : array) {
            System.out.println(laptop);
        }

        System.out.println("\n" + "Comparator by model : ");
        Arrays.sort(array, new ComparatorByPrice());
        for (Laptop laptop : array) {
            System.out.println(laptop);
        }

        System.out.println("\n" + "Comparator by amount of RAM : ");
        Arrays.sort(array, new ComparatorByAmountOfRam());
        for (Laptop laptop : array) {
            System.out.println(laptop);
        }

        System.out.println("\n" + "Comparator by rating : ");
        Arrays.sort(array, new ComparatorByRating());
        for (Laptop laptop : array) {
            System.out.println(laptop);
        }

        System.out.println("\n" + "Comparator by company : ");
        Arrays.sort(array, new ComparatorByCompany());
        for (Laptop laptop : array) {
            System.out.println(laptop);
        }

        comparable();
    }

    public static void comparable() {

        Laptop xiaomi = new Laptop("Gaming", 1000, 8, 4, "Xiaomi");
        Laptop samsung = new Laptop("IdeaPad", 1050, 12, 7, "Samsung");
        Laptop dreammachines = new Laptop("U765", 1560, 32, 8, "Dream Machines");

        List<Laptop> comparable = new ArrayList<>();

        comparable.add(xiaomi);
        comparable.add(samsung);
        comparable.add(dreammachines);

        System.out.println("\n" + "Comparable sorted list : ");
        Collections.sort(comparable);
        for (Laptop tmp : comparable){
            System.out.println(tmp);
        }
    }
}
