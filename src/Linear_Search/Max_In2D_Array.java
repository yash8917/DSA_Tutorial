package Linear_Search;

import java.util.Arrays;

public class Max_In2D_Array {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {12,34,45,45},
                {21,43,54,78,89}
        };
        // formate to return the array of the method contain in a array
        int res=max(arr);
        System.out.println(res);
    }
    static int max(int[][] arr){
        int maxval=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col]>maxval){
                    maxval=arr[row][col];
                }
            }
        }
        return maxval;

    }
}
