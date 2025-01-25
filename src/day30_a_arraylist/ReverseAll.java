package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
/*
        Reverse All

        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        @param words - Given ArrayList of Strings
        @return - ArrayList of Strings

        Ex:
            Input: {"ted", "talk", "learn"}
            Output: {"det", "klat", "nrael"}
 */

public class ReverseAll {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println("Not reserved: " + list);

        System.out.println("Reversed: " + reverseAllInList((list)));

    }
    public static ArrayList <String> reverseAllInList (ArrayList <String> originalList) {

        ArrayList<String> reversedList = new ArrayList<>();

        /*
        for ( String each : originalList) {
            System.out.println(each);

            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--) {

                reverse += each.charAt(i);
            }

            reversedList.add(reverse);
        }

      return reversedList;

         */

        for ( String each : originalList) {
            // Here we also called our own custom reusable class which had a method called .reverse(String str);
            reversedList.add( StringUtil.reverse( each ) );
        }

        return reversedList;

    }

}
