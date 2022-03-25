package annonymousinnerclasses;

public class AnonymousInnerClass  {
    public static void main(String[] args) {

        Add add = new Add() {
            @Override
            public int addition(int a, int b) {
                return a+b;
            }
        };

        System.out.println(add.addition(3,3));
    }

}

interface Add {
    int addition(int a,int b);
}