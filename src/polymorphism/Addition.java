package polymorphism;

public class Addition {
//method overloading
//    - same class we have same method name with different number of arguments
    public int add(int a,int b){
       return a+b;
    }

    public float add(float a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(1,4));
        System.out.println(addition.add(1.9f,4));
    }

}

