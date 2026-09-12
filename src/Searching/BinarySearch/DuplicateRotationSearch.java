package Searching.BinarySearch;

public class DuplicateRotationSearch {
    static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,0};
//        int target = 6;
//        System.out.println(search(arr,target));
        System.out.println(pivot(arr));

    }

//    static int search(int[] nums , int target){
//        int pivotOfArr = pivot(nums);
//        if(nums[pivotOfArr]==target){
//            return pivotOfArr;
//        }
//        else if(nums[pivotOfArr]==-1){
//            return binarySearch(nums, target,0,nums.length-1);
//        }
//        else if(nums[0] > target){
//            return binarySearch(nums, target,pivotOfArr+1,nums.length-1);
//        }
//            return binarySearch(nums, target,0,pivotOfArr+1);
//
//    }
    static int pivot(int[] nums  ){

        int start = 0;
        int end = nums.length-1;
        while(start <= end ){

            int mid = start +(end-start)/2;

            if(mid < end &&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>nums[start+1]){
                return start;
            } else if(nums[end]<nums[end-1]) {
                return end-1;
            }
            else if(nums[start]<nums[mid]||(nums[start]== nums[mid] && nums[mid]> nums[end])){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return -1;
    }
//    static int binarySearch(int[] arr, int target , int start, int end) {
//
//
//
//        while (start <= end) {
//
//            int mid = (start + end) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//
//            else if (arr[mid] < target) {
//                start = mid + 1;
//            }
//
//            else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//
//
//    }
}
