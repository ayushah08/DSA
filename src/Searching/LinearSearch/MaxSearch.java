package Searching.LinearSearch;

public class MaxSearch {

    public static void main(String[] args) {
        int[] arr= {10,20,30,981,2,985,-5,-10,-1000};
        System.out.println(
                "Max Value in the given array is :- "
        );
        System.out.print(linearSearch(arr));
    }

    static int linearSearch(int[] arr) {

        int max =arr[0];

        for(int a : arr){
            if(a>max){
                max=a;
            }
        }
        return max;


    }
}
