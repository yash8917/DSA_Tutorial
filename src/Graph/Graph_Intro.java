package Graph;

import java.util.HashMap;

public class Graph_Intro {
    public static void main(String[] args) {
        HashMap <String ,Integer > obj =new HashMap<>();
        obj.put("Raj",56);
        obj.put("Ram",44);
        obj.put("TAnmay",66);
        System.out.println( obj.containsValue("TAnmay"));
        System.out.println(obj.get("Ram"));
        System.out.println( obj.getOrDefault("Raj",0));
    }
}
