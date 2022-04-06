package Linked_List;
//class Node3{
//    int data;
//    Node3 next;
//
//    public Node3(int data) {
//        this.data = data;
//    }
//}
//public class Reverse_LinkedList {
//    public static void main(String[] args) {
//        Node3 head=CreatLinkedList();
//
//    }
//    public static Node3  CreatLinkedList() {
//        Node3 n1 = new Node3(3);
//        Node3 n2 = new Node3(4);
//        Node3 n3 = new Node3(5);
//        Node3 n4 = new Node3(6);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        return n1;
//    }
//    public static Node3 print(Node3 head){
//
//    }
//}
// Java program for reversing the linked list

class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}