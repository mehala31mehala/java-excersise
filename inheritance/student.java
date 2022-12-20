package inheritance;

public class student {
    private String sname;
    private int  std;
    private String sec;
    private String add;

    public student(String s,int sd,String sc,String ad){
        sname=s;
        std=sd;
        sec=sc;
        add=ad;
    }


    public String getName() {
        return sname;
    }

    public int getStd() {
        return std;
    }
    public String getSec() {
        return sec;
    }
    public void setSec(String sec) {
        this.sec = sec;
    }
    public String getAdd() {
        return add;
    }

    public void SetDetails(String name,String sec,String add,int std) {
        this.sname = name;
        this.std=std;
        this.sec=sec;
        this.add=add;

    }



}
