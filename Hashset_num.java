import java.util.HashSet;
import java.lang.String;
import java.util.Iterator;
import java.util.*;
import java.util.Arrays;
public class Hashset_num {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(12);
        num.add(2);
        num.add(7);
        num.add(8);
        num.add(25);
        num.add(6);
        System.out.println(num);
        Integer[] newarray=new Integer[num.size()];
        num.toArray(newarray);
        System.out.println(newarray);
        System.out.println("dispaly elements:");
        for(int i:newarray){
            System.out.println(i);
        }
        Iterator<Integer>its=num.iterator();
        System.out.println(its.equals(2));
        System.out.println("iterate through elements:");
        Iterator<Integer>it=num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("clone:");
        HashSet<Integer> cloneset= (HashSet<Integer>)num.clone();
        System.out.println("the clone set is:"+cloneset);
        System.out.println("convert set to array:");

        System.out.println("convert  hash to tree set:");
        Set<Integer>tree=new TreeSet<>(num);
        System.out.println(tree);
        System.out.println("hash to linked/array:");
        List<Integer>arr_list=new ArrayList<>(num);
        System.out.println(arr_list);


        System.out.println("find the numbers less than 10:");
        for (int i = 0; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + "was found in the set");
            } else {
                System.out.println(i + "was not found in the set");
            }
        }
        System.out.println("remove the numbers less than 10:");
        for (int j = 0; j < 10; j++) {
            if (num.remove(j)) ;
        }
        System.out.println(num);

        System.out.println(num.contains(12));
        System.out.println("the size of the set:"+num.size());
        System.out.println("remove all elements in the set");

        HashSet<Integer>set2=new HashSet<Integer>();
        set2.add(2);
        set2.add(6);
        set2.add(5);
        set2.add(10);
        set2.add(23);
        set2.add(8);
        System.out.println("set 1:"+set2);
        //remove  the number:
        num.remove(3);
        System.out.println(num);

        System.out.println();
        HashSet<Integer>num1=new HashSet<Integer>();
        num1.add(12);
        num1.add(2);
        num1.add(7);
        num1.add(8);
        num1.add(25);
        num1.add(6);
        System.out.println("set 2:"+num1);

        HashSet<Integer>num2=new HashSet<Integer>();
        num2.addAll(set2);
        num2.addAll(num1);
        System.out.println("the union is:"+num2);

        num2.retainAll(set2);
        num2.retainAll(num1);
        System.out.println("the intersection is:"+num2);


        set2.removeAll(num1);
        System.out.println("the differece is:"+set2);

        System.out.println(set2.hashCode());
        System.out.println(set2.isEmpty());
        System.out.println(set2.containsAll(num1));
        System.out.println("compare two sets:");
        System.out.println("set 1:"+set2);
        System.out.println("set 2:"+num1);
        for(Integer i:set2){
            System.out.println(num1.contains(i)? "yes!":"no");
        }


    }
}

