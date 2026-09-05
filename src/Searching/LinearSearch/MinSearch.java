package Searching.LinearSearch;

public class MinSearch {
    public static void main(String[] args) {


        int[] arr = {10, 30, 50, 62, 53, 52, 15, 23, 3, 2, 33};
        System.out.println(
                "Min Value in the given array is :- "
        );
        System.out.print(linearSearch(arr));

    }
    static int linearSearch(int[] arr) {

        int min =arr[0];

        for(int a : arr){
            if(a<min){
                min=a;
            }
        }
        return min;


    }
}
