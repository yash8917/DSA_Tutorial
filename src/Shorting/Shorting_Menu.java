package Shorting;

import java.beans.Expression;
import java.util.Scanner;

public class Shorting_Menu {
    static int[] arr;
    Shorting_Menu(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:-> ");
        n= sc.nextInt();
        for (int i = 0; i < n ; i++) {
            arr[i]= sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Shorting_Menu obj=new Shorting_Menu();
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        switch (num){
            case 1:
                System.out.println(arr[1]);
            case 2:
                System.out.println(arr[2]);
            default:
                System.out.println("Index is not Found");

        }
    }
}
