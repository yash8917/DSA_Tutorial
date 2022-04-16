class BinaryNode9 {
    int data;
    BinaryNode9 Left;
    BinaryNode9 Right;
    public BinaryNode9(int data){
        this.data=data;
    }
}
public class Demo {
    public static void main(String[] args) {
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

    }
   public static void inOrder_Traversal(BinaryNode9 root){
        if (root == null){
            return;
        }
       inOrder_Traversal(root.Left);
       System.out.print(root.data+" ");
       inOrder_Traversal(root.Right);
   }
   public static void preOrder_Traversal(BinaryNode9 root){
        if (root == null){
            return;
        }
       System.out.print(root.data+" ");
        preOrder_Traversal(root.Left);
        preOrder_Traversal(root.Right);
    }
    public static void postOrder_Travesal(BinaryNode9 root) {
        if (root == null) {
            return;
        }
        postOrder_Travesal(root.Left);
        postOrder_Travesal(root.Right);
        System.out.print(root.data+" ");
    }
}
