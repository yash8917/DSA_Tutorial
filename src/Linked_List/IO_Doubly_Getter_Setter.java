package Linked_List;
class Node4 {
    int data;
    Node4 next; //Self Refrential variable
    Node4 prev;
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data=data;
    }
}
public class IO_Doubly_Getter_Setter {
    public static void main(String[] args) {
    Node4 head=createLinkedList();
    display(head);
    }
    public static Node4 createLinkedList(){
        Node4 newnode1=new Node4();
        Node4 newnode2=new Node4();
        newnode1.next=newnode2;
        newnode2.prev=newnode1;
        return newnode1;
    }
    public static void display(Node4 temp){
        System.out.println(temp.data);
        System.out.println(temp.next.data);
        System.out.println(temp.prev);
        System.out.println(temp.next.prev);
    }
}
