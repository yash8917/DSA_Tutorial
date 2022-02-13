package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        //Base case-This is called Head Recursion
        if( n== 1 ){
            return 1;
        }
        //recursive call with smaller value
        int recAns=fact(n-1);
        int myAns=n*recAns;
        return myAns;
    }
//    //2nd method Approach is the Tail Recursion
//    public static void fact(int n, int ans){
//        if(n==0 || n==1){
//            System.out.println(ans);
//            return;
//        }
//        fact(n-1, ans*n);
//  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter te number:");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
/* how to identify which type of recursion in the code-
In Head recursion there is some statement after the recursive call
but In Tail recursion there is no any statement after the recursive call.
 */