package Linked_List;
class Node5<Integer>{
    Integer data;
    Node5 next;
    Node5 prev;

    public Node5(Integer data) {
        this.data = data;
    }
}
public class IO_DoublyLinkedList_Generics {
    public static void main(String[] args) {
        Node5 head=createLinkedList();
        display(head);
    }
    public static Node5 createLinkedList(){
        Node5 newnode1=new Node5(100);
        Node5 newnode2=new Node5(200);
        newnode1.next=newnode2;
        newnode2.prev=newnode1;
        return newnode1;
    }
    public static void display(Node5 temp){
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.prev);
        System.out.println(temp.next.prev);
    }
}
