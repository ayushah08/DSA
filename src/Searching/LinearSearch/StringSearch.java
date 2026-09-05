package Searching.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {


        String str = "Ayush";
        char target = 'A';

        System.out.println(stringLinearSearch(str,target));


    }

    static boolean stringLinearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                return true;
            }
        }


        return false;

    }
}





