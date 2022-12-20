package Absraction;
abstract  class MotorBike {
    public String name;
    public String speed;
    public String brand;
    public String price;
    public String color;
    public abstract void MotorBike_Sound(String name,String speed,String brand,String price,String color);
}
class SportsBike extends MotorBike{
    public void MotorBike_Sound(String name, String speed, String brand,String price,String color ) {
        System.out.println("Bike details:");
        System.out.println("Bike name:"+name);
        System.out.println("Mileage:"+speed);
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
        System.out.println("Color:"+color);

    }
}
class MountainBike extends MotorBike{
    public void MotorBike_Sound(String name, String speed, String brand,String price,String color) {
        System.out.println("Bike details:");
        System.out.println("Bike name:"+name);
        System.out.println("Mileage:"+speed);
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
        System.out.println("Color:"+color);

    }
}
