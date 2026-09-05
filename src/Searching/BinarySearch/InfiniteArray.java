package Searching.BinarySearch;

//Searchig in an infinite Array
public class InfiniteArray {
    public static void main(String[] args) {


        int[] arr = {5,7,8,10,22,33,44,55,66,77,77,88,99,100,120,140,160};
        int target = 99;

        System.out.println(binarySearch(arr, target));



    }

    static int[] searchRange(int[] arr, int target) {

        int start =0;
        int end = 1;

        while(arr[end]<target){
            int temp = end +1;
             end = end+( end - start + 1 )*2;
             start = temp;
        }
        return  new int[] {start,end};
    }



    static int binarySearch(int[] arr, int target) {

        int[] range =searchRange(arr, target);
        int start = range[0];
        int end = range[1];

        while (start <= end) {

            int mid = start -(start + end) / 2;
            //TODO target k equal
            if (arr[mid] == target) {
                return mid;
            }

            //TODO target is greater
            else if (arr[mid] < target) {
                start = mid + 1;
            }

            //Todo Target is smaller
            else {
                end = mid - 1;
            }
        }
        return -1;


    }
}
