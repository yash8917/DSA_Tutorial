package Binary_Tree;

import java.util.Scanner;

class BinaryNode9 {
    int data;
    BinaryNode9 Left;
    BinaryNode9 Right;
    public BinaryNode9(int data){
        this.data=data;
    }
}
public class Demo {

//    Search Method
    public static boolean search(BinaryNode9 root,int target){
        boolean res ;
        if (root == null)
            return false;
        if (root.data == target){
            return true;
        }
        if (target < root.data){
            res=search(root.Left,target);
        }else{
            res=search(root.Right,target);
        }
        return res;
    }

//    Insert Method
    public static BinaryNode9 insert(BinaryNode9 root,BinaryNode9 newNode){
        if(root == null){
            root =newNode;
            return root;
        }
        if (root.data > newNode.data){
            if (root.Left == null){
                root.Left=newNode;
            }else{
                insert(root.Left,newNode);
            }
        }
        if (root.data < newNode.data){
            if (root.Right == null){
                root.Right=newNode ;
            }else{
                insert(root.Right,newNode);
            }
        }
        return root;
    }

//    IN - Order Traversal
   public static void inOrder_Traversal(BinaryNode9 root){
        if (root == null){
            return;
        }
       inOrder_Traversal(root.Left);
       System.out.print(root.data+" ");
       inOrder_Traversal(root.Right);
   }

//   Pre - Order Traversal
   public static void preOrder_Traversal(BinaryNode9 root){
        if (root == null){
            return;
        }
       System.out.print(root.data+" ");
        preOrder_Traversal(root.Left);
        preOrder_Traversal(root.Right);
    }

//    Post - Order Traversal
    public static void postOrder_Travesal(BinaryNode9 root) {
        if (root == null) {
            return;
        }
        postOrder_Travesal(root.Left);
        postOrder_Travesal(root.Right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryNode9 root=new BinaryNode9(9);
        BinaryNode9 rleft=new BinaryNode9(7);
        BinaryNode9 rright=new BinaryNode9(12);
        BinaryNode9 rleftLeft=new BinaryNode9(3);
        BinaryNode9 rleftRight=new BinaryNode9(8);
        BinaryNode9 rrightLeft = new BinaryNode9(11);
        BinaryNode9 rrightRight =new BinaryNode9(13);
        root.Left=rleft;
        root.Right=rright;
        rleft.Left=rleftLeft;
        rleft.Right=rleftRight;
        rright.Left=rrightLeft;
        rright.Right=rrightRight;
        System.out.print("Inorder Traversal :> ");
        inOrder_Traversal(root);
        System.out.println();
        System.out.print("Preorder Traversal :> ");
        preOrder_Traversal(root);
        System.out.println();
        System.out.print("Postorder Traversal :> ");
        postOrder_Travesal(root);
        System.out.println();

//        Calling the insert Method
        insert(root,new BinaryNode9(15));
        insert(root,new BinaryNode9(14));
        insert(root,new BinaryNode9(6));
        System.out.print("After insert the value(By using insert Method) our BST is :> ");
        inOrder_Traversal(root);
        System.out.println("(In-Order Traversal)");
        System.out.print("Enter the value What you want to search : ");
        int target=sc.nextInt();
        System.out.println(search(root,target));
    }
}
