package day34_a_static;
import my_utilities.ArrayUtil;

import static  my_utilities.ArrayUtil.*;
// static import - imports all the static members in util clas called ArrayUtil which is in different package called my_utilities
public class StaticImport {
    public static void main(String[] args) {
        int [] a = {12, 4, 1, 756, 2, 23};

        System.out.println(sum(a));

    }
}
