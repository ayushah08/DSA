package Searching.LinearSearch;

public class BasicSearch {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};
        int target=20;

        System.out.println(linearSearch(arr,target));



    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int e : arr) {
            if (e == target) {
                return e;
            }
        }
        return -1;

    }

}

