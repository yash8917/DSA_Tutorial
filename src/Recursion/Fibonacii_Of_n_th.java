package Recursion;
public class Fibonacii_Of_n_th {
    public static void main(String[] args) {
        int ans=fibo(4);
        System.out.println("The Fibonacii no of n^th term is: "+ans);
    }
    static int fibo(int n){
        //Base condition
        if(n< 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
