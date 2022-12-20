import java.lang.String;
public class Complex {
    int n1;
    int n2;
    public Complex(int n1,int n2) {
        this.n1 = n1;
        this.n2=n2;
    }
    public void show(){
        System.out.println(this.n1+"+i"+this.n2);
}
public static Complex add(Complex c1,Complex c2){
        Complex add=new Complex(0,0);
        add.n1=c1.n1+c2.n1;
        add.n2=c1.n2+c2.n2;
        return add;
}
public static Complex sub(Complex c1,Complex c2){
        Complex sub=new Complex(0,0);
        sub.n1=c1.n1-c2.n1;
        sub .n2=c1.n2-c2.n2;
        return sub;
}
public static Complex mul(Complex c1,Complex c2){
        Complex mul=new Complex(0,0);
        mul.n1=c1.n1*c2.n1;
        mul.n2=c1.n2*c2.n2;
        return mul;
}
public static void main(String[]args){
        Complex c1=new Complex(4,5);
        Complex c2=new Complex(10,5);
        Complex add=add(c1,c2);
        Complex sub=sub(c1,c2);
        Complex mul=mul(c1,c2);
        System.out.println("Addition of complex:");
        add.show();
        System.out.println("Subraction:");
        sub.show();
        System.out.println("Multiplication:");
        mul.show();
}


}
