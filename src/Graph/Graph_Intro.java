package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Graph_Intro {
//     we can use the HashMap also
    Map<Integer ,LinkedList<Integer>>obj;
    public Graph_Intro(){
        obj=new HashMap<>();
    }
    public void addEdge(int v1, int v2,boolean biDirectional){
    LinkedList <Integer > v1neighbour =obj.getOrDefault(v1,new LinkedList());
    v1neighbour.add(v2);
    obj.put(v1,v1neighbour);
    if (biDirectional == true){
        LinkedList <Integer > v2neighbour =obj.getOrDefault(v2,new LinkedList());
        v2neighbour.add(v1);
        obj.put(v2,v2neighbour);
    }
    }
//    display Method
    public  void display( ){
        for (Map.Entry <Integer,LinkedList<Integer>>res:obj.entrySet()) {
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
    }
    public static void main(String[] args) {
        Graph_Intro obj=new Graph_Intro();
        obj.addEdge(1,2,true);
        obj.addEdge(1,3,true);
        obj.addEdge(3,4,true);
        obj.addEdge(3,5,true);
        obj.addEdge(5,6,true);
        obj.display();
        Scanner sc=new Scanner(System.in);
//        String s= sc.nextLine();
//        Integer i= sc.nextInt();
//        for (Map.Entry <String,Integer>res:obj.entrySet()) {
//            System.out.println(res.getKey());
//            System.out.println(res.getValue());
//        }
        //        HashMap <String ,Integer > obj =new HashMap<>();
        //      key can not be duplicate
//        obj.put("Raj",56);
//        obj.put("Ram",44);
//        obj.put("TAnmay",66);
//        obj.put("Abhi",43);
//        obj.put("Amit",98);
//        for (Map.Entry<String,Integer> res:obj.entrySet()) {
//            System.out.print(res.getKey()+" ");
//            System.out.println(res.getValue());
//        }
//        System.out.println( obj.containsValue("TAnmay"));
//        System.out.println(obj.get("Ram"));
//        System.out.println( obj.getOrDefault("Raj",0));
    }
}
