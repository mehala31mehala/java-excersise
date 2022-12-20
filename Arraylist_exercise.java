//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;
import java.lang.String;
public class Arraylist_exercise {
    public static void main(String[] args) {
        //1.print out the colors collection:
        ArrayList<String> Colors = new ArrayList<String>();
        Colors.add("Pink");
        Colors.add("Red");
        Colors.add("Blue");
        Colors.add("Purple");
        Colors.add("Yellow");
        System.out.println(Colors + "\n");

        //2.Iterate through all elements in arraylist:
        for (String i : Colors) {
            System.out.println(i);
        }
        System.out.println("3.inserting an element without remove any element:");
        Colors.add(0, "White");
        System.out.println(Colors);

        System.out.println("4.Retrive an element:");
        System.out.println(Colors.get(0));
        System.out.println(Colors.get(3) + "\n");

        System.out.println("5.update the element :");
        Colors.set(2, "White");
        System.out.println(Colors + "\n");

        System.out.println("6.remove third element in array");
        Colors.remove(2);
        System.out.println(Colors + "\n");

        System.out.println("7.search any element in array:");
        System.out.println(Colors.contains("Pink"));
        System.out.println(Colors.contains("Black") + "\n");

        System.out.println("8.sort an arraylist:");
        Collections.sort(Colors);
        for (String color : Colors) {
            System.out.println(color);
        }
        System.out.println("9.shuffle elements:");
        Collections.shuffle(Colors);
        System.out.println(Colors + "\n");

        System.out.println(("10.Reverse an array list:"));
        Collections.reverse(Colors);
        System.out.println(Colors + "\n");

        System.out.println("11.swap two elements:");
        Collections.swap(Colors, 2, 0);
        System.out.println(Colors + "\n");

        System.out.println("12.extract a portion of an arraylist:");
        List<String> sub_clr = Colors.subList(2, 4);
        System.out.println(sub_clr + "\n");

        System.out.println("13.replace the second element with specified element:");
        Colors.set(1, "Orange");
        System.out.println(Colors + "\n");

        System.out.println("14.empty an arraylist:");
        Colors.clear();
        System.out.println(Colors);

        System.out.println("15.test an arraylist is empty or not:");
        System.out.println(Colors.isEmpty());

        System.out.println("16.copy one to another:");
        Colors.add("Green");
        Colors.add("Brown");
        Colors.add("White");
        System.out.println("List 1:" + Colors);

        List<String> List2 = new ArrayList<String>();
        List2.add("pink");
        List2.add("Black");
        List2.add("yellow");
        System.out.println("List 2:" + List2 + "\n");

        // Collections.copy(Colors,List2);
        // System.out.println("List 1:"+Colors+"\n"+"List 2:"+List2);

        System.out.println("17.comparing 2 array lists:");
        List<String>km=new ArrayList<String>();
        for(String e:Colors ) {
            km.add(List2.contains(e) ? "yes" : "no");
        }
            System.out.println(km);
        System.out.println("18.trim the capacity of arraylist:");
        Colors.trimToSize();
        System.out.println(Colors);

        System.out.println("19.increase the size :");
        Colors.ensureCapacity(100);
        Colors.add("silver");
        Colors.add("grey");
        Colors.add("orange");
        System.out.println(Colors);

        System.out.println("20.Clone array list");
        System.out.println(Colors);
        List<String>newclr=(ArrayList<String>)Colors.clone();
        System.out.println("cloned arraylist:"+newclr);

        System.out.println("21.join two array lists:");
        List<String>list3=new ArrayList<String>();
        list3.addAll(Colors);
        list3.addAll(List2);
        System.out.println(list3);

        System.out.println("22.print all elements of an arraylist using the position of the elements:");
        for(int i=0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }

    }

    }





