package Binary_Search;

public class Ceiling_Of_Number {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans= ceiling(arr,target);
        System.out.println("The index of Ceiling No: "+ans);

    }
    static int ceiling(int[] arr , int target){
        int start=0;
        int end = arr.length -1;
        //Middle of the array
//        int mid=(start+end) / 2; (This my possible exeed the Range of the integer
        while (start <= end){
            //        int mid=(start+end) / 2; (This my possible exeed the Range of the integer
            int mid=start + (end - start) / 2;
            //If the target Element is greater then the biggest no of array
            if (target > arr[arr.length-1]){
                return -1;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target >arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
