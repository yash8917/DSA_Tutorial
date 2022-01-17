package Linear_Search;

public class Search_InArray_Limt {
     static public int Search(int[] arr,int target,int start,int end) {
        if (arr.length==0) {
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            if (target==arr[index]){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,3,34,45,56,3,32,57,65};
        int target=56;
        int res=Search(arr,target,2,6);
        System.out.println(res);
    }
}