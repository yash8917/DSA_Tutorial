package Binary_Tree;

public class BinaryTree_Structure_Array {
    static     int ar[];
   static int lastUsedIndex;

    public BinaryTree_Structure_Array(int size) {
        ar=new int[size+1];
        lastUsedIndex=0;
    }
    public  void insert(int val){
        if(lastUsedIndex >ar.length -1){
            return;
        }
        ar[lastUsedIndex +1]= val;
        lastUsedIndex ++;
    }
    public void preOrder_Traversal(int index){
        if (index >lastUsedIndex){
            return;
        }
        System.out.println(ar[index]);
        preOrder_Traversal(2 * index);
        preOrder_Traversal(2 * index + 1);
    }

    public static void main(String[] args) {
    BinaryTree_Structure_Array obj=new BinaryTree_Structure_Array(7);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.preOrder_Traversal(0);



    }
}
