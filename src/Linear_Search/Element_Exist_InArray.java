package Linear_Search;

public class Element_Exist_InArray {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 23, 10, 24, 13};
        int target = 10;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }
}