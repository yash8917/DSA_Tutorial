package Binary_Tree;
class BinaryNode3{
    int data;
    BinaryNode3 left;
    BinaryNode3 right;
    public BinaryNode3(int  data){
        this.data=data;
    }
}
public class Traversal_Methods {
    public static void main(String[] args) {
        // Creating the Object
        BinaryNode3 Root =new BinaryNode3(10);
        BinaryNode3 RootLeft=new BinaryNode3(5);
        BinaryNode3 Rootright =new BinaryNode3(15);
        Root.left=RootLeft;
        Root.right=Rootright;
        BinaryNode3 leftl=new BinaryNode3(3);
        BinaryNode3 leftr=new BinaryNode3(8);
        RootLeft.left=leftl;
        RootLeft.right=leftr;
        System.out.print("1.Pre Order Traversal:-> ");
        preOrder(Root);
        System.out.println();
        System.out.print("2.In Order Traversal:-> ");
        inOrder(Root);
        System.out.println();
        System.out.print("3.Post Order Traversal:-> ");
        postOrder(Root);
    }
public static void preOrder(BinaryNode3 root){

        if(root == null){
            return;
        }
    System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
}
public static void inOrder(BinaryNode3 root){

        if (root == null)
            return;
        inOrder(root.left);
    System.out.print(root.data+" ");
         inOrder(root.right);
}
public static void postOrder(BinaryNode3 root){
    if (root == null)
        return;
       postOrder(root.left);
       postOrder(root.right);
    System.out.print(root.data+" ");
}
}
