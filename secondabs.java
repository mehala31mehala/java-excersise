import java.lang.String;
public class secondabs {
    public static void main(String[] args){
        Std obj=new Std();//create an object by sublass
        System.out.println("name:"+obj.name);
        System.out.println("degree:"+obj.degree);
        System.out.println("age:"+obj.age);
        obj.study();//call the abstract method
    }
}
