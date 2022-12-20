import java.lang.String;
public class accessmethod {
    public void fullThrottle() {
        System.out.println("the car has more speed");
}
public void speed(int x){
        System.out.println("max speed is:"+ x);
}
public static void main(String[] args){
        accessmethod mycar=new accessmethod();
        mycar.fullThrottle();
        mycar.speed(200);

}
}