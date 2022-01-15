import java.util.Scanner;

public class Input_5_ElementInArray {
    int arr[]=new int[5];// instance variable
    Input_5_ElementInArray(){
        arr=new int[5];
        System.out.println("Enter the element's:");
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Input_5_ElementInArray obj=new Input_5_ElementInArray();
        System.out.println("Elements are :-");
        for (int i = 0; i <obj.arr.length ; i++) {
            System.out.println(obj.arr[i]);
        }
    }
}
