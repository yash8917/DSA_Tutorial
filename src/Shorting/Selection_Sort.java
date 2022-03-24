package Shorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void selectionSort(int[] ar){
        for (int i = 0; i < ar.length-1; i++) {
            int min=i;
            for (int j =i+1; j <ar.length ; j++) {
                if(ar[min] > ar[j]){
                    min=j;
                }
                int temp=ar[min];
                ar[min]=ar[i];
                ar[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
