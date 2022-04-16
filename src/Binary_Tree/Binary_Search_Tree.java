package Binary_Tree;

class BinaryNode4{
    int data;
    BinaryNode4 left;
    BinaryNode4 right;
    public BinaryNode4(int data){
        this.data=data;
    }
}
public class Binary_Search_Tree {

   static BinaryNode4 root;
   Binary_Search_Tree()
   {
       root=null;
   }

 public static BinaryNode4 insert(BinaryNode4 root,BinaryNode4 newNode){
     if(root == null){
         root = newNode;
         return root;
     }
     if(root.data > newNode.data){
         if (root.left == null){
             root.left=newNode;
         }else{
             insert(root.left ,newNode);
         }
     }
     if (root.data < newNode.data){
         if (root.right == null){
             root.right=newNode;
         }else{
             insert(root.right,newNode);
         }
     }
     return root;
 }

 // Insertion Without Recurtioon
 public static BinaryNode4 insertWithoutRecurtion(int value ){
     BinaryNode4 newNode=new BinaryNode4(value);
     if (root == null){
         root=newNode;
         return root;
     }else{
         BinaryNode4 current=root;
         BinaryNode4 parent=null;
         while (true){
             parent=current;
             if(value < current.data){
                 parent=current.left;
                 if (parent == null){
                     parent.left=newNode;
                     return parent;
                 }
             }
             if (value > current.data){
                 parent=current.right;
                 if (parent == null){
                     parent.right=newNode;
                     return parent;
                 }
             }
         }
     }
 }
    public static void print(BinaryNode4 root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }public static boolean search(BinaryNode4 root, BinaryNode4 newNode){
       boolean result;
       if (root == null){
           return false;
       }
       if (root.data == newNode.data){
           return true;
       }
       if (root.data > newNode.data)
           result=search(root.left,newNode);
           else{
               result=search(root.right,newNode);
           }
           return result;
       }
//       public static boolean checkBST(BinaryNode4 root){
//       int leftMax=maximum(root);
//       int rightMin=minimum(root);
//       if (root == null){
//           return true;
//       }
//       if (root.data < leftMax){
//           return false;
//       }
//       if (root.data >rightMin){
//           return false;
//       }
//       boolean leftBST =checkBST(root.left);
//       boolean rightBST = checkBST(root.right);
//       if (leftBST && rightBST){
//           return true;
//       }else {
//           return false;
//       }
//   }
//   public static int maximum(BinaryNode4 root){
//       if (root == null){
//           return Integer.MAX_VALUE;
//       }
//       return Math.min(root.data,Math.max(maximum(root.left),maximum(root.right)));
//   }
//    public static int minimum(BinaryNode4 root){
//        if (root == null){
//            return Integer.MIN_VALUE;
//        }
//        return Math.max(root.data,Math.min(maximum(root.left),minimum(root.right)));
//    }

    public static void main(String[] args) {
       BinaryNode4 root= insert(null,new BinaryNode4(89));
       BinaryNode4 rleft=insert(root,new BinaryNode4(64));
       BinaryNode4 rright=insert(root,new BinaryNode4(70));
       root.left=rleft;
       root.right=rright;
       print(root);
//        System.out.println(checkBST(root));

    }

}