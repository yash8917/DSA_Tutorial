package Shorting;
import java.util.Arrays;

public class Bubble_Short {

    public static void main(String[] args) {
    int[] arr={1,22,13,44,25};
    bubbleShort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static public void bubbleShort(int[] arr){
        boolean swap;
        //this loop runs for i-th pass
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            //this loop runs for the n-th element of the i-th pass (for swift the largest element in the end of the index)
            for (int j = 1; j < arr.length-i ; j++) {
                //check the condition for the greater then the privious element
                if(arr[j] < arr[j-1]){
                    //swap the values if privious is greater
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
                    //without taking the third variable
                    arr[j]=arr[j]^arr[j-1];
                    arr[j-1]=arr[j]^arr[j-1];
                    arr[j]=arr[j]^arr[j-1];
                    swap=true;
                }
            }
            if (swap==false){   //if(!swap)
                break;
            }
        }
    }
}
