package Searching.BinarySearch;

public class OrderAgnosticBinarySearch {


    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 60, 70, 100, 115, 253, 300,512, 933};
        int[] descarr= {933,655,499,322,266,106,96,76,55,50,34,20,9,8,6,1};
        int target = 50;

//        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(descarr, target));
    }
    static int binarySearch(int[] arr, int target) {


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

