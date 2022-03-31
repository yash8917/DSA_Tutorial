package Binary_Tree;
class BinaryNode1<T>{
    T data;
    BinaryNode1 <T> left;
    BinaryNode1<Integer> right;
    public BinaryNode1(T data){
        this.data=data;
    }
}
public class Check_BinarySearchTree{
    public static void main(String[] args) {
        BinaryNode1 <Integer> root=new BinaryNode1<>(15);
        BinaryNode1 <Integer> Rleft=new BinaryNode1<>(10);
        BinaryNode1<Integer> Rright=new BinaryNode1<>(12);
        root.left=Rleft;
        root.right=Rright;
        print(root);
//        isBST(root);
    }
//    public static boolean isBST(BinaryNode1 root){
//        int leftmax = maximum(root.left);
//        int rightmin = minimum(root.right);
//        if (root == null){
//            return true;
//        }
//        if (root.data <= leftmax){
//            return false;
//        }
//        if (root.data > rightmin){
//
//        }
//    }
   public static void print(BinaryNode1 root){
        if (root == null){
            return;
        }
       System.out.println(root.data);
        print(root.left);
        print(root.right);

   }
}
