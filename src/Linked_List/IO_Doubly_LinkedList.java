package Linked_List;
//Structure of the Doubly Linked List

class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data=data;
        next=null;//this statement is not mandatory
    }
}

public class IO_Doubly_LinkedList {
    public static void main(String[] args) {
        Node2 head=createLinkedList();
        display(head);
    }

    public static Node2 createLinkedList(){
        Node2 newnode1=new Node2(10);
        Node2 newnode2=new Node2(20);
        newnode1.next=newnode2;
        newnode1.prev=newnode2;
        return newnode1;
    }
    public static void display(Node2 temp){
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.prev);//it will print the address of the previous node
    }
}
