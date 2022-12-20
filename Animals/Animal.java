package Animals;

public class Animal {
    public String name;
    public int no_of_legs;
    public String sound;
public void Animal(String name,int no_of_legs,String sound){
    System.out.println("Animal name:"+name);
    System.out.println("No_of_legs:"+no_of_legs);
    System.out.println("Sound:"+sound);
}
}
class Dog extends Animal {
    private String type;
    private String color;
    private int Running_speed;
    private String food;

    public String getColor() {
        return color;
    }

    public String getFood() {
        return food;
    }

    public int getRunning_speed() {
        return Running_speed;
    }

    public String getType() {
        return type;
    }

    public void set(String type, String food, int Running_speed,String color) {
        this.type = type;
        this.food = food;
        this.Running_speed = Running_speed;
        this.color=color;
    }
    public static void Dog(String type,String food,String color,int Running_speed){
        System.out.println("Dog name:"+type);
        System.out.println("Favourite Food:"+food);
        System.out.println("Dog color:"+color);
       System.out.println("Maximum running speed:"+Running_speed+"km/h");

    }
}


