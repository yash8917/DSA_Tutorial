package Linear_Search;

public class Minimum_InTheArray {

    static int min(int[] arr){
        int minval=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr[0]){
                minval=arr[i];
            }
        }
        return minval;
    }

    public static void main(String[] args) {
        int[] arr={12,23,54,4,-2,-34};
        System.out.println(min(arr));
    }
}
