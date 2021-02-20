package part1.section05;

import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int [] myIntArray, mySecondArray = new int[10];
//        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("mySecondArray " + Arrays.toString(mySecondArray));

        int [] myArr1, myArr2 = myArr1 = new int[10];
        System.out.println("myArr1 " + Arrays.toString(myArr1));
        System.out.println("myArr2 " + Arrays.toString(myArr2));

        Object o = new int[5];

        int a [] = new int[]{1, 2, 3, 4, 5};
        int b [] = {1, 2, 3, 4, 5};
        System.out.println("a " + Arrays.toString(a));
        System.out.println("b " + Arrays.toString(b));

    }
}
