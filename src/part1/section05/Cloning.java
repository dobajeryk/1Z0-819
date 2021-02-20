package part1.section05;

import java.util.Arrays;
import java.util.List;

public class Cloning {
    public static void main(String[] args) {
        int [] myArr = {1, 2, 3, 4, 5};
        int[] clone = myArr.clone();
        int[] ints = Arrays.copyOf(myArr, myArr.length);
        int[] ints1 = Arrays.copyOfRange(myArr, 0, myArr.length);
        myArr[0] = 100;
        System.out.println(Arrays.toString(clone));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));


    }
}
