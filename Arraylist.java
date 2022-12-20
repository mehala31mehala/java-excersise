import java.util.Collections;
import java.util.ArrayList;
import java.lang.String;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("ford");
        cars.add("bmw");
        cars.add("lambogini");
        cars.add("opel");
        cars.add("volvo");

        cars.remove(3);
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(3,"Tata");
        System.out.println(cars);
        System.out.println(cars.size());

        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
       }
        Collections.sort(cars);
        for(String i:cars){
            System.out.println(i);
        }
    }
}
