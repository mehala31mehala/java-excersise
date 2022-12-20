import java.lang.String;
public class consstudent {
    String fname;
    String lname;
    String phoneNo;
    String address;
    String mailid;

    public consstudent(String name1, String name2, String num, String add, String mail) {
        fname = name1;
        lname = name2;
        phoneNo = num;
        address = add;
        mailid = mail;
    }
    public static void main(java.lang.String[] args){
        consstudent details=new consstudent("Mehala" ,"karnan","9786452419", "252A,east street,TMK,ond tk,tanjore Dt","mehakarnan@gmail.com");
        System.out.println("Student details:");
        System.out.println("Name:"  +details.fname+" "+details.lname);
        System.out.println("phoneNo:"+details.phoneNo);
        System.out.println("Address:"+details.address);
        System.out.println("Mail:"+details.mailid);
    }


}

