package Searching.BinarySearch;

class FloorSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 15;

        System.out.println(binarySearch(arr,target));

    }

    static int binarySearch(int[] arr, int target) {

        if(arr[0] > target){
            return -1;
        }

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
        return end;


    }
}
