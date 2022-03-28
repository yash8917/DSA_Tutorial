package Binary_Tree;
class BinaryNode<T>{
    T data;
    BinaryNode <T>  left;
    BinaryNode <T> right;

    public BinaryNode(T data) {
        this.data = data;
    }
}
public class Structure {
    public static void main(String[] args) {

        BinaryNode <Integer> root=new BinaryNode<>(15);
        BinaryNode<Integer> Rleft= new BinaryNode<>(10);
        BinaryNode <Integer> Rright = new BinaryNode<>(12);
        root.left=Rleft;
        root.right=Rright;
        print(root);
    }
    public static void print(BinaryNode root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
