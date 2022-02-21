package polymorphism;

//if parent and child class have same method with same signature
// this called method overriding
public class Animal {

    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

//    public void sound() {
//        System.out.println("Dog sound.");
//    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}

class Cat extends Dog {

//    public void sound() {
//        System.out.println("Cat sound");
//    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}