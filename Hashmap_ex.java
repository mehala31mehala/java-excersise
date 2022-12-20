//import java.util.HashMap;
import java.lang.String;
//import java.util.Collections;
import java.util.*;
import java.util.Map;

public class Hashmap_ex {
    public static void main(String[] args) {
        HashMap<Integer,String>Names=new HashMap<Integer,String>();
        System.out.println("1.Associate Hashmap with key and values:");
        Names.put(1,"Mehala");
        Names.put(2,"Swetha");
        Names.put(3,"Bhuvi");
        Names.put(4,"Tharani");
        Names.put(5,"Sowmiya");
        System.out.println(Names+"\n");

        for(Map.Entry i:Names.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
        System.out.println("2.find the number of keys:");
        System.out.println(Names.size());

        System.out.println("3.copy this map to another map:");
        HashMap<Integer,String>name2=new HashMap<Integer, String>();
        System.out.println("Original map:"+Names);
        name2.putAll(Names);
        System.out.println("another map:"+name2);

        System.out.println("4.remove all of the mappings from the map:");
        System.out.println("Before:"+Names);
        //Names.clear();
       // System.out.println("After removing all mappings:"+Names);

        System.out.println("5.check empty or not:");
        System.out.println(Names.isEmpty());

        System.out.println("6.get the shallow copy (clone):");
        HashMap<Integer,String>copy=new HashMap<Integer,String>();
        copy=(HashMap)Names.clone();
        System.out.println(copy+"\n");

        System.out.println("7.check the map contains the specified key :");
        if(Names.containsKey(3)) {
            System.out.println("yes!-" + Names.get(3));
        }else{
            System.out.println("No!");
        }
        System.out.println("8.check the map contains the specified value:");
        if(Names.containsValue("Mehala")){
            System.out.println("Yes!");
        }else{
            System.out.println("no");
        }
        System.out.println("9.Set view:");
        Set name=Names.entrySet();
        System.out.println(name);

        System.out.println("10.to get the value of key:");

        System.out.println("Value of the key 5:"+Names.get(5));

        System.out.println("11.to get the set view of keys:");
        Set key=Names.keySet();
        System.out.println("the key set view is:"+key);

        System.out.println("12.Collection view of values:");
        System.out.println("The values"+Names.values());
    }
}
