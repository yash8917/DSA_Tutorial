import java.util.ArrayList;

class Deletion_of_Array {
    public static void main(String[] args) {
//        ArrayList<Integer>i=new ArrayList<>();
//        i.add(10);
//        i.add(20);
//        i.add(30);
//        i.add(1,787);//to use this method it will shift the value of indx 1 to indx 2
//        //it don't override the value
//        i.remove(0);//it also shift the index 1 to index 0.
//        System.out.println(i);
        int arr[]={10,20,30,40,50};
        int index=1;
        int i=0;
        for ( i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[i]=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
    }
}