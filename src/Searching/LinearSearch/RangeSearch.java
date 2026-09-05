package Searching.LinearSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 62, 53, 52, 15, 23, 3, 2, 33};
        int target= 30;
        System.out.println(linearSearch(arr,target,1,5));


    }

    static int linearSearch(int[] arr, int target , int start , int end) {

        if (arr.length == 0) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return 1;
        }
        return -1;
    }
}
