import java.util.Scanner;

public class Switch_Case {
   static int a=10,b=20;
    public Switch_Case() {
        a=10;
        b=20;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1.Addition\n  3.Multiply\n 4.Divition\n 5.Modulo");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("The addition of Number is:- "+ a+b);
                break;
            case 2:
                System.out.println("The Subtraction of Number is:- ");
                break;
            case 3:
                System.out.println("The Multiply of Number is:- "+ a*b);
                break;
            case 4:
                System.out.println("The Divition of Number is:- "+ a/b);
                break;
            case 5:
                System.out.println("The Modulo of Number is:- "+ a%b);
                break;
            default:
                System.out.println("Entered index is invalid.");
        }
    }
}
