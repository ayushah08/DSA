package Searching.BinarySearch;

//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//Return the index of the peak element.
//
//Your task is to solve it in O(log(n)) time complexity.
public class BiotonicArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(binarySearch(arr));
    }


     static int binarySearch(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while
        (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else  {
                start = mid+1 ;
            }


        }
        return end;
    }
}
