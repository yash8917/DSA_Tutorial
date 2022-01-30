package Binary_Search;

public class Find_The_Target {
    public static void main(String[] args) {
        int[] arr={1 , 5, 7, 9,16,19,23,34,45,67,87,89};
        int target=5;
        int ans=search1d(arr,target);
        System.out.println(ans);
    }

    static int search1d(int[] arr , int target){
        int start=0;
        int end = arr.length -1;
        //Middle of the array
//        int mid=(start+end) / 2; (This my possible exeed the Range of the integer
        while (start <= end){
            //        int mid=(start+end) / 2; (This my possible exeed the Range of the integer
            int mid=start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target >arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
