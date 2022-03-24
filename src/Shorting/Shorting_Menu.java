package Shorting;

import java.beans.Expression;
import java.util.Arrays;
import java.util.Scanner;

public class Shorting_Menu {
    public static void main(String[] args) {
        int[] arr={17,23,11,10,3,9};
//       bubbleSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int min =i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min=j;
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
