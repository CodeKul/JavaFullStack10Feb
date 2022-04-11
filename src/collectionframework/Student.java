package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    int id;
    String name;
    String address;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj = new Student(1, "Prakash", "Pune");
        Student obj2 = new Student(2, "Namrata", "Pune");
        Student obj3 = new Student(3, "Sagar", "Pune");

        List<Student> list1 = new ArrayList<>();
        list1.add(obj2);
        list1.add(obj3);
        list1.add(obj);

        Collections.sort(list1);
        list1.forEach(s->{
            System.out.println(s);
        });


    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public int compareTo(Student o) {
        return compare(this.id, o.id);
    }
}
