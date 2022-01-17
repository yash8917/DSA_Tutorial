package Linear_Search;

import java.util.Arrays;

public class Search_In2D_Array {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {12,34,45,45},
                {21,43,54,78,89}
        };
        // formate to return the array of the method contain in a array
        int[] res=search(arr,43);
        System.out.println(Arrays.toString(res));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
