package Arraylstex;

public class Teacher {
    private String name;
    private int age;
    private String deg;
    private int std;
    private String location;

    public Teacher(String name, int age, String deg, int std, String location) {
        this.name = name;
        this.age = age;
        this.deg = deg;
        this.std = std;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDeg() {
        return deg;
    }

    public int getStd() {
        return std;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name, int age, String deg, int std, String location) {
        this.name = name;
        this.age = age;
        this.deg = deg;
        this.std = std;
        this.location = location;
    }
}
