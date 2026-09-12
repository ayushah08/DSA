package Searching.BinarySearch;

public class RotationCount {
    static void main(String[] args) {

        int[] arr = {4,5,7,0,1,2};

        System.out.println(count(arr));

    }

    static int count(int[] arr){

        int pivot = pivot(arr);

        return pivot+1;
    }

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
}
