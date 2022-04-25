//Definition class.
public class Array_Operations
{
   int arr[];

   //create the constructer for initiate the values
   public Array_Operations()
   {
       arr= new int[5];
       for (int i = 0; i < arr.length; i++)
       {
           //set the min value of wrapper class default value
           arr[i]=Integer.MIN_VALUE;
       }
   }

   //Method to insert
    public void Insert(int index, int value) throws ArrayIndexOutOfBoundsException
    {

            if (arr[index] == Integer.MIN_VALUE)
            {
                arr[index] = value;
            } else
            {
                System.out.println("Already Filled");
            }
    }


   // method to traverse the array
    public void traverse()
    {
        for (int res:arr)
        {
            System.out.println(res);
        }
    }

    //Method to print the specific value of a array
    public void getvalue(int index)
    {
       try
       {
           System.out.println(arr[index]);
       }catch (ArrayIndexOutOfBoundsException o)
       {
           System.out.println("Invalid index");
       }
    }


    //Searc ah a value in the array
    public void search(int value)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==value)
            {
                System.out.println("Value found");
                return;
            }else
            {
                System.out.println();
            }
        }
        System.out.println("value not found.");
    }

    //method to delete the value of an array
    public void delete(int index)
    {
       try
       {
           arr[index]=Integer.MIN_VALUE;
       }
       catch (ArrayIndexOutOfBoundsException obj){
           System.out.println("Invalid Index");
       }
    }

    //method to delete the array
    public void deleteArray()
    {
       arr=null;

    }
}


// Execution class
class Main
{
    public static void main(String[] args)
    {
       Array_Operations obj=new Array_Operations();
       try {
           obj.traverse();
           obj.Insert(2,34);
           obj.search(3);
           obj.getvalue(3);
           obj.deleteArray();
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid Index");
       }

    }
}