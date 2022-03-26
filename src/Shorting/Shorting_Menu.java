package Shorting;

import java.beans.Expression;
import java.util.Arrays;
import java.util.Scanner;

public class Shorting_Menu {
    public static void main(String[] args) {
        int[] arr={-17,-23,-20,0,11,10,3,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("    ..Wellcome to the Sorting Menu..");
        System.out.println("Enter the Sort Method :-\n1. Bubble Sort\n2. Selection Sort\n3.Insertion Sort");
        int n=sc.nextInt();
        switch (n){
            case 1:
                bubbleSort(arr);
                System.out.println("After Apply the Bubble Sort the Array is:-");
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                selectionSort(arr);
                System.out.println("After Apply the Selection Sort the Array is:-");
                System.out.println(Arrays.toString(arr));
                break;
            case 3:
                insertionSort(arr);
                System.out.println("After Apply the Insertion Sort the Array is:-");
                System.out.println(Arrays.toString(arr));
            default:
                System.out.print("You entered a wrong choice.");
        }

    }
//    ------------------------------------------------------------------------------
    // Selection Sort
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
//    -------------------------------------------------------------------------------
//    Bubble Sort
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
//    ----------------------------------------------------------------------------------
//    Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
