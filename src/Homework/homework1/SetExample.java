package Homework.homework1;

import java.util.Map;
import java.util.TreeMap;

public class SetExample {

    public static void main(String[] args) {

        Map<String, Integer> myTreeMap = new TreeMap<>();

        myTreeMap.put("Tesla", 1);
        myTreeMap.put("Toyota", 2);
        myTreeMap.put("Mercedes", 3);
        myTreeMap.put("BMW", 4);
        myTreeMap.put("Ford", 5);
        myTreeMap.put("Audi", 6);

        System.out.println("Here is myTreeMap : " + myTreeMap);

        myTreeMap.remove("Tesla");
        myTreeMap.remove("Audi");

        System.out.println("Here is myTreeMap after values removal : " + myTreeMap);

        myTreeMap.put("Mazda", 4);
        myTreeMap.put("Subaru", 2);

        System.out.println("Here is myTreeMap after replacing values : " + myTreeMap);
    }
}
