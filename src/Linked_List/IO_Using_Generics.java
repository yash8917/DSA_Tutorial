package Linked_List;
class Node1<Integer>{
      Integer data;
      Node1 next;

     public Node1(Integer data) {
          this.data = data;
     }
}
public class IO_Using_Generics {
    public static void main(String[] args) {
        Node1 head = CreatLinkedList();
        display(head);
    }

    public static Node1 CreatLinkedList() {
        Node1 n1 = new Node1(3);
        Node1 n2 = new Node1(4);
        Node1 n3 = new Node1(5);
        Node1 n4 = new Node1(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void display(Node1 temp){
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.next.next.data);
        System.out.println(temp.next.next.next.data);
    }
}
