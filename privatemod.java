import java.lang.String;
public  class privatemod {
    private String fname="Mehala";
    private String lname="karnan";
    private String mailid="mehakarnan@gmail.com";
    private int age=20;
    private String degree="B.sc";

    public static void main(String[] args){
        privatemod obj=new privatemod();
        System.out.println("name:"+obj.fname+" "+obj.lname);
        System.out.println("age:"+obj.age);
        System.out.println("mailid:"+obj.mailid);
        System.out.println("degree:"+obj.degree);
    }

}
