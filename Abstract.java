import java.lang.String;
abstract class Abstract {
    public String name="mehala";
    public String degree="b.sc";
    public int age=20;
    public abstract void study();// create ABSTRACT METHOD
}
//subclass
class Std extends Abstract{

    public int deg_year=2022;
    public void study(){//body of the method
        System.out.println("study all day long");
    }
    }
