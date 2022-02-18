package inheritance;

/**
 * inheritance -> acquiring all the properties from parent to child class.
 * <p>
 * advantage -> code re-usability
 */
public class Teacher { //parent class , super class , base class

    int id;
    String name;
    String address;

    public void show() {
        System.out.println("In show Teacher");
    }
}

class MathsTeacher extends Teacher { //child class , sub class ,derived class


    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Rakesh";
        obj.address = "pune";
    }

    public void show() {
        System.out.println("In show Teacher");
    }
}

class PhysicsTeacher extends MathsTeacher {

    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 2;
        obj.name = "Akash";
        obj.address = "Mumbai";
        obj.show();
    }

}

class ChemistryTeacher extends Teacher {

    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 2;
        obj.name = "Akash";
        obj.address = "Mumbai";
        obj.show();
    }

}