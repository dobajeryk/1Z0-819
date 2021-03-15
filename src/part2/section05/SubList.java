package part2.section05;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(List.of(1, 8, 3 , 5));
        System.out.println("Integeres");
        System.out.println(integers);
        System.out.println("Sublist");
        List<Integer> subList = integers.subList(1, 3);
        System.out.println(subList);
        System.out.println("Add element to sublist");
        subList.add(997);
        System.out.println(subList);
        System.out.println("Integers");
        System.out.println(integers);
        System.out.println("Add element to integers");
        integers.add(10000);
        System.out.println(integers);
        System.out.println(subList);
    }
}
