package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> arrList = new ArrayList<>();

        arrList.add("java");
        arrList.add("bread");
        arrList.add("water");
        arrList.add("butter");

        System.out.println(arrList.size());
        arrList.remove(0);
        System.out.println(arrList);

        boolean isRemoved = arrList.remove("water");
        System.out.println(isRemoved);
        System.out.println(arrList);

    }
}
