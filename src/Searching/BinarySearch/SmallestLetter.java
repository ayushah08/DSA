package Searching.BinarySearch;


// #744 LeetCode Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
public class SmallestLetter {
    public static void main(String[] args) {


        char[] arr = {'x','x','y','y'};
        char target = 'z';

        System.out.println(binarySearch(arr, target));

    }

    static char binarySearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;



        while (start <= end) {

            mid = (start + end) / 2;


            //TODO target is greater
             if (arr[mid] < target) {
                start = mid + 1;
            }

            //Todo Target is smaller
            else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];

    }
}
