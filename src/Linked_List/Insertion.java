package Linked_List;
class Node6{
    int data;
    Node6 next;
    public Node6(int data){
        this.data=data;
    }
}
public class Insertion {
   static Node6 head;
   //This is the insert method in the last indext
    public static Node6 insert(){
        Node6 n1=new Node6(100);
        if(head == null){
            head=n1;
        }
        Node6 temp=head;
        while(temp != null){
            temp=temp.next;
        }
        temp=n1;
        return n1;
    }
    public static void display(Node6 ans){
        //Check point
        if (head == null){
            System.out.println("Empty List");
        }else{
            Node6 temp=head;
            while(temp != null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static  Node6 atBegginigInsert(){
        Node6 n1=new Node6(300);
        Node6 n2=new Node6(200);//This is the element which i want to store in the first index
        if(head==null){
            head=n1;
        }
        n2.next=head;
        head=n2;
        return n2;
    }

    public static void main(String[] args) {
        Node6 ans=insert();
        Node6 ans2=atBegginigInsert();
        display(ans2);
        display(ans);
    }
}
