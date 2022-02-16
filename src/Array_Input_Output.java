import java.util.Arrays;
import java.util.Scanner;

public class Array_Input_Output {
    static  int[] arr;
    Array_Input_Output(){
        arr=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter te array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }
    }
    public static void main(String[] args) {
        Array_Input_Output obj=new Array_Input_Output();
        System.out.print("Array is:-"+"  \n");
        //First way to print the array using for i loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  \n");
        }
        //Second way to print the Array using for each loop
        System.out.println("Array is :\n");
        for (int res:arr) {
            System.out.print(res+" \n");
        }
        
        //3 rd way to print the array using array toSting method
        System.out.print("Array is :\n");
        System.out.print(Arrays.toString(arr));
    }
}
