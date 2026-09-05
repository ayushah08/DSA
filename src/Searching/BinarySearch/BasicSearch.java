package Searching.BinarySearch;

public class BasicSearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 56, 78, 87, 97, 103, 116, 246};
        int target = 56;

        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
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
