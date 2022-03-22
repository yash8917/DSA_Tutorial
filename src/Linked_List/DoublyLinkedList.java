package Linked_List;


import java.util.Scanner;

class Nod
{
    int data;
    Nod next;
    Nod previos;
}
public class DoublyLinkedList {
    Nod head;
    public DoublyLinkedList()
    {
        head=null;
    }
    public void insert()
    {
        System.out.println("Enter the data: ");
        Scanner sca=new Scanner(System.in);
        Nod n=new Nod();
        n.data=sca.nextInt();
        if(head==null )
        {
            head=n;
        }
        else
        {
            Nod temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.previos=temp;
            System.out.println("Data inserted");
        }
    }
    public void traverse()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Nod current;
            for(current=head;current!=null;current=current.next)
            {
                System.out.print(current.data+" ");
            }
        }
    }
    public static void main(String []args)
    {
       DoublyLinkedList obj=new DoublyLinkedList();
        Scanner sca=new Scanner(System.in);
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for Traverse");
            System.out.println("Press 3 for ReverseTraverse");
            System.out.println("Press 4 for Exit");

            System.out.println("Enter your choice ");
            int choice=sca.nextInt();
            switch(choice)
            {
                case 1:
                {
                    obj.insert();
                    break;
                }
                case 2:
                {
                    obj.traverse();
                    break;
                }
                case 3:
                {
                    obj.ReverseTraverse();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice.");
                }
            }
        }
    }

    public  void ReverseTraverse() {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Nod temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            while(temp.previos!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.previos;
            }
            System.out.println(temp.data);
        }
    }
}
