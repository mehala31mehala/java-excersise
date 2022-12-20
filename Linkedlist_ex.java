import java.util.*;
import  java.lang.String;

public class Linkedlist_ex {
    public static void main(String[] args) {
        LinkedList<String>Flowers=new LinkedList<String>();
        System.out.println("1.Linkedlist:");
        Flowers.add("Rose");
        Flowers.add("Lotus");
        Flowers.add("Jasmine");
        Flowers.add("Lilly");
        Flowers.add("Deisy");
        System.out.println(Flowers+"\n");

        System.out.println("2.Iterate through all elements:");
        for(String i:Flowers){
            System.out.println(i);
        }
        System.out.println("3.Iterate through all elements starting at a specified position:");
        Iterator flr=Flowers.listIterator(2);
        while(flr.hasNext()) {
            System.out.println(flr.next());
        }
        System.out.println("4.Iterate the list in reverse order:");
        Collections.reverse(Flowers);
        System.out.println(Flowers);

        System.out.println("5.insert the specified element at the specified position:");
        Flowers.add(2,"Hibiscus");
        System.out.println(Flowers+"\n");

        System.out.println("6.insert the elements in a first and last position:");
        Flowers.addFirst("Sunflower");
        Flowers.addLast("Lavender");
        System.out.println(Flowers);

        System.out.println("7.insert the element at the first and 8.at the end of the list:");
        Flowers.offerFirst("Iris");
        Flowers.offerLast("Iris");
        System.out.println(Flowers);


        System.out.println("9.Insert some new elements:");
        List<String>l2=new LinkedList<String>();
        l2.add("Tulips");
        l2.add("Orchids");
        Flowers.addAll(1,l2);
        System.out.println(Flowers);

        System.out.println("10.Get the first and last elements:");
        System.out.println(Flowers.getFirst());
        System.out.println(Flowers.getLast());

        System.out.println("11.get the elements and their positions:");
        for(int i=0;i<Flowers.size();i++){
            System.out.println("element"+i+":"+Flowers.get(i));
        }
        System.out.println("12.remove the specified element:");
        Flowers.remove(2);
        System.out.println(Flowers);

        System.out.println("13.remove the first and last element:");
        Flowers.removeFirst();
        Flowers.removeLast();
        System.out.println(Flowers);

       //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // System.out.println("14.remove all the elements:");
       // Flowers.clear();
       // System.out.println(Flowers);

        System.out.println("15.swap two elements :");
        Collections.swap(Flowers,0,4);
        System.out.println(Flowers);

        System.out.println("16.shuffle the elements:");
        Collections.shuffle(Flowers);
        System.out.println(Flowers);

        System.out.println("17.join 2 lists:");
        System.out.println("list 1:"+Flowers);
        List<String>list2=new LinkedList<String>();
        list2.add("black rose");
        list2.add("white rose");
        list2.add("yellow rose");
        System.out.println("list2:"+list2);

        List<String>list3=new LinkedList<String>();
        list3.addAll(Flowers);
        list3.addAll(list2);
        System.out.println(list3);

        System.out.println("18.clone linkedlist to another list:");
        List<String>list4=new LinkedList<String>();
        list4=(LinkedList)Flowers.clone();
        System.out.println(list4);

        System.out.println("19.remove and return the pop:");
        System.out.println("original list:"+Flowers);
        System.out.println(Flowers.pop());
        System.out.println("After:"+Flowers);

        System.out.println("20.retrive but does not remove the 1st element:");
        System.out.println("originallist:"+Flowers);
        System.out.println("the 1st element:"+Flowers.peekFirst());
        System.out.println("list:"+Flowers);

        System.out.println("21.retrive but does not remove the last element:");
        System.out.println("originallist:"+Flowers);
        System.out.println("the last element:"+Flowers.peekLast());
        System.out.println("list:"+Flowers);

        System.out.println("22.check if a particular element exist:");
        System.out.println(Flowers.contains("Rose"));

        System.out.println("23.convert a linked list to arraylist:");
        List<String>list5=new ArrayList<String>(Flowers);
        for(String str:list5){
            System.out.println(str);
        }
        System.out.println("24.compare 2 lists:");
        List<String>km=new LinkedList<String>();
        for(String i:Flowers){
            km.add(list2.contains(i)?"yes":"no");
        }
        System.out.println(km);
        System.out.println("24.check empty or not:");
        System.out.println(Flowers.isEmpty());

        System.out.println("25.replace an element:");
        Flowers.set(2,"carnation");
        System.out.println(Flowers );
    }
}
