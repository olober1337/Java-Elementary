package Homework.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsExampleAddAndDelete {

    public static void main(String[] args) {

        List<Integer> myNewList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            myNewList.add(i);
        }

        System.out.println("myNewList is :" + myNewList);

        Iterator<Integer> iterator = myNewList.iterator();

        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a % 2 != 0)
                iterator.remove();
        }

        System.out.println("myNewList after odd number removal is :" + myNewList);

        myNewList.removeAll(myNewList);

        System.out.println("myNewList after all numbers removal is : " + myNewList);
    }
}
