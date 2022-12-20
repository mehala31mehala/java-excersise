import java.lang.String;
public class arrayletter {
    public static void main(String[] args) {
        String[] name = {"Anitha", "Swetha", "Bhuvana", "Tharani", "Aarthi", "Aruna", "Ahalya", "Anu"};
        System.out.println("count of names starting with A");
        for (int i = 0; i <=name.length; i++) {
            if (name[i].charAt(0)=='A'){
                System.out.println(i);
                System.out.println(name[i]);
            }
        }
    }
}
