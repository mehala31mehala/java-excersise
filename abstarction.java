import java.lang.String;
public  class abstarction {
    public static void main(String[] args) {
        cat obj = new cat();
        obj.sleep();
        obj.animalsound();

    }
    }

    abstract class animal {
            public abstract void animalsound();
            public void sleep() {
                System.out.println("Zzzz");
            }
        }
    class cat extends animal{
        public void animalsound() {
            System.out.println("meow meow");
        }
    }


