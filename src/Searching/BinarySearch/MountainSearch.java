package Searching.BinarySearch;

public class MountainSearch {
    static void main() {

        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(search(arr, 4));


    }





   static int search (int[] arr , int target){
        int peak =  peakSearch(arr,target);
        int firstTry = orderAgnosticSearch(arr,target,0,peak);
        if(firstTry == -1){
            int secondTry = orderAgnosticSearch(arr,target,peak,arr.length-1);
            return  (secondTry);
        }
        return firstTry;

    }
    public static int orderAgnosticSearch(int[] arr, int target, int start, int end) {




        boolean isAsc = arr[start]< arr[end];
        while (start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            else if(arr[mid] < target) {
                if(isAsc){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }else {
                if(isAsc){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }


        }



        return -1;
    }
    public static int peakSearch(int[] arr, int target) {


        int start =  0;
        int end = arr.length - 1;

        boolean isAsc = arr[start]< arr[end];
        while (start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            else if(arr[mid] < target) {
                if(isAsc){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }else {
                if(isAsc){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }


        }



        return -1;
    }
}
