package Binary_Tree;

class BinaryNode2
{
    int data;
    BinaryNode2 left;
    BinaryNode2 right;
    public BinaryNode2(int data)
    {
        this.data=data;
    }
}
public class Formatted_Output {
        public static void  Print(BinaryNode2 root)
        {
//        if(root==null)
//            return;
//        System.out.println(root.data);
//        Print(root.left);
//        Print(root.right);

            if(root==null)
                return;
            System.out.print(root.data+"->");
            if(root.left!=null)
            {
                System.out.print("L"+root.left.data+",");
            }
            else{
                System.out.print(" ,");
            }
            if(root.right!=null)
            {
                System.out.print("R"+root.right.data);
            }
            System.out.println();
            Print(root.left);
            Print(root.right);

        }

        public static void main(String[] args) {
            BinaryNode2 root=new BinaryNode2(15);
            BinaryNode2 onel=new BinaryNode2(16);
            BinaryNode2 oner=new BinaryNode2(20);
            root.right=oner;
            root.left=onel;
            BinaryNode2 onelr=new BinaryNode2(18);
            BinaryNode2 onerl=new BinaryNode2(60);
            onel.right=onelr;
            oner.left=onerl;


            Print(root);
        }
}

