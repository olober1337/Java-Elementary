package lesson1.forEachWithPrimitives;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

        // Вывод на экран элементов массива х при помощи  цикла for
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println();

        // Вывод на экран эелементов массива х при помощи цикла foreach
        for (int tmp : x) {
            System.out.println(tmp + " ");
        }
        System.out.println();

        // Изменение значения поля класса
        for (int tmp : x) {
            ++tmp;
            System.out.println(tmp + " ");
        }

        System.out.println(Arrays.toString(x));

        for (int tmp : x) {
            System.out.println(tmp + " ");
        }
    }
}
