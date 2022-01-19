//Q. Write a program to input the elements of a two- dimensional array. Then from this array,
//        make two arrays one that stores all odd elements of the two-dimensional array and the other
//        that stores all even elements of the array. 
//        Note:-  Resulting arrays will be of ArrayList type


import java.util.Scanner;

public class L1 {
   static int[][] arr=new int[2][2];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 arr[i][j]= sc.nextInt();
            }
        }
    }
}
