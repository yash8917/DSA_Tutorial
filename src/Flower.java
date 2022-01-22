import java.util.Scanner;
/* a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent
 the name of the flower, its number of petals, and price. Your class must include a constructor method that initialises
 each variable to an appropriate value, and your class should include methods for setting the value of each type, and
 getting the value of each type. Create an array of 5 Flower objects and print the value. */

public class Flower {
    String flowername;
    int no_of_petals;
    float price;
    Flower[] ar;
    Flower()                                                  //Constructor
    {
        this.flowername = flowername;
        this.no_of_petals = no_of_petals;
        this.price = price;
    }
    public void setvalues()                               //Method for set values in the Non-Primitive Array Flower
    {
        ar = new Flower[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FlowerName, Number of Petals and Prices of Flowers:");
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = new Flower();
            ar[i].flowername = sc.nextLine();
            ar[i].no_of_petals = sc.nextInt();
            ar[i].price = sc.nextFloat();
        }
    }
    public void display()                                    //Method For Display Values from the Array
    {
        System.out.println("Flower Details:");
        for(int i=0; i<ar.length; i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
class flowertest {
    public static void main(String[] args) {
        Flower obj = new Flower();
        // obj.setvalues();
        obj.display();
    }
}