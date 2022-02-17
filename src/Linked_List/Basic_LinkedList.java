package Linked_List;
class Node<I extends Number> {
    int data;
    Node<Number> next;
    Node(int data){
        this.data=data;
    }
}
public class Basic_LinkedList {
    public static void main(String[] args) {
        Node head=CreatLinkedList();
        display(head);
    }
    public static Node <Integer> CreatLinkedList(){
        Node n1=new Node(3);
        Node n2=new Node(4);
        Node n3=new Node(5);
        Node n4=new Node(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void display(Node temp){
        System.out.println("The values of Linked List is: ");
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.next.next.data);
        System.out.println(temp.next.next.next.data);
    }
}
