package Searching.BinarySearch;

//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//
//Return the minimized largest sum of the split.
//
//A subarray is a contiguous part of the array
public class SplitArraySearch {
    static void main() {
        int[] arr = {7,8,10,15,14,30};
        int m = 5;

        System.out.println(splitArraySearch(arr,m));
    }

    static int splitArraySearch(int[] arr, int m) {

        int start = 0;
        int end = 0;


        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start)/2;
            int sum =0;
            int pieces =1;
            for (int num : arr) {
                if (sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }

            if(pieces > m){
               start = mid + 1;
            }else
            {
                end = mid;
            }
        }
        return start;
    }
}
