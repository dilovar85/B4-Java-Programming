package day18_loops;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String / keep one character from each.
         Ex:
                Input: abcabbcd
                Output: abcd
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abbddtw";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            // if unique DOES NOT have eachChar, then add
            if (!unique.contains("" + eachChar)) {
                unique += eachChar;
            }

        }

        System.out.println("Original: " + str);
        System.out.println("Uniques: " + unique);

        String unique2 = "";

        for (int i = 0; i < str.length(); i++) {
            // Check if the character has already been added to unique2
            if (unique2.indexOf(str.charAt(i)) == -1) {
                unique2 += str.charAt(i);

            }
        }
        System.out.println(unique2);
    }
}



