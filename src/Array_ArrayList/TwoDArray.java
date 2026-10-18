package Array_ArrayList;

public class TwoDArray {

    static void main() {

        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};

        for(int i =0 ; i < arr.length ; i++){
            for (int j =0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
