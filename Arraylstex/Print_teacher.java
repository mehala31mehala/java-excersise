package Arraylstex;
import TeachersDetails.Teacher1;

import java.util.ArrayList;
public class Print_teacher {
    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher("Mehala", 21, "B.sc Maths", 6, "Ond");
        Teacher Teacher2 = new Teacher("Swetha", 20, "BCA", 7, "TMK");
        Teacher Teacher3 = new Teacher("Tharani", 25, "B.sc physics", 6, "Ond");
        Teacher Teacher4 = new Teacher("Bhuvana", 22, "B.sc Maths", 8, "Ond");
        Teacher Teacher5 = new Teacher("Pichaiselvi", 36, "B.sc physics", 7, "TMK");
        Teacher Teacher6 = new Teacher("Uthaya", 28, "B.sc Maths", 10, "TMK");
        Teacher Teacher7 = new Teacher("Sowmiya", 30, "BCA", 8, "Ond");
        Teacher Teacher8 = new Teacher("Manasa", 40, "B.sc Maths", 6, "TMK");
        Teacher Teacher9 = new Teacher("Suruthika", 38, "BCA", 10, "Trichy");
        Teacher Teacher10 = new Teacher("Dharshini", 20, "B.tech", 10, "Ond");

        ArrayList<Teacher> list = new ArrayList();
        list.add(Teacher1);
        list.add(Teacher2);
        list.add(Teacher3);
        list.add(Teacher4);
        list.add(Teacher5);
        list.add(Teacher6);
        list.add(Teacher7);
        list.add(Teacher8);
        list.add(Teacher9);
        list.add(Teacher10);
        for (Teacher i : list) {
            System.out.println("Name:" + i.getName() + " \n" + "Age:" + i.getAge() + "\n" + "Degree:" + i.getDeg() + "\n" + "Standard:" + i.getStd() + "\n" + "Location:" + i.getLocation() + "\n");
        }
        System.out.println("No.of teachers in same  location:");
        System.out.println(method1(list, "Ond"));
        System.out.println("NO.of teachers in the same location and same class: ");
        System.out.println(method2(list, "Ond", 6));
        System.out.println("No.of teachers in the same location and their sum of age:");
        System.out.println(method3(list, "Ond"));
        System.out.println("Teachers count of age between 20 and 40 in the same degree:");
        System.out.println(method4(list, "B.sc Maths"));
        System.out.println("Teachers count in the same age:");
        System.out.println(method5(list, 20));
        System.out.println("Teachers list:");
        System.out.println(method6(list, "Ond"));
        System.out.println("Teachers list in the same class:");
        System.out.println(method7(list, 6));
    }

    public static int method1(ArrayList<Teacher> list, String location) {
        int count = 0;

        for (Teacher p : list) {
            if (p.getLocation() == location) {
                count++;
            }
        }
        return count;
    }

    public static int method2(ArrayList<Teacher> list, String location, int std) {
        int count = 0;
        for (Teacher q : list) {
            if ((q.getLocation() == location) && (q.getStd() == std)) {
                count++;
            }
        }
        return count;
    }

    public static int method3(ArrayList<Teacher> list, String location) {
        int count = 0;
        int sum = 0;
        for (Teacher r : list) {
            if (r.getLocation() == location) {
                count++;
                sum += r.getAge();
            }
        }
        return sum;
    }

    public static int method4(ArrayList<Teacher> list, String deg) {
        int count = 0;
        for (Teacher s : list) {
            if (s.getDeg() == deg && (s.getAge() > 20) && (s.getAge() < 40)) {
                count++;
            }
        }
        return count;
    }

    public static int method5(ArrayList<Teacher> list, int age) {
        int count = 0;
        for (Teacher t : list) {
            if (t.getAge() == age) {
                count++;

            }
        }
        return count;
    }

    public static int method6(ArrayList<Teacher> list, String location) {
        int count = 0;
        for (Teacher i : list) {
            if (i.getLocation() == location) {
                System.out.println(i.getName());
                count++;
            }

        }
        return count;
    }

    public static int method7(ArrayList<Teacher> list, int std) {
        int count = 0;
        for (Teacher i : list) {
            if (i.getStd() == std) {
                System.out.println(i.getName());
                count++;
            }
        }
        return count;
    }
}