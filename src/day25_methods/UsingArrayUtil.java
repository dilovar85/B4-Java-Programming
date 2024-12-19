package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int [] nums = {23,345,23,1345,765,2344,2};

        System.out.println(ArrayUtil.maxNumInArr(nums));
        System.out.println(ArrayUtil.minNumInArr(nums));

        System.out.println(ArrayUtil.contains(nums, 6));
        System.out.println(ArrayUtil.contains(nums, 23));


        if (ArrayUtil.contains(nums, 80)) {
            System.out.println("Array contains that number");
        } else {
            System.out.println("Array does not contain that number");
        }
    }

        }