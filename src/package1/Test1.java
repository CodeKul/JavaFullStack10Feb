package package1;

public class Test1 {

    //instance variable or global variable or class level variable
    protected int i = 10;//member variable

    public void show(){ // member function
        int j = 8; //local variable
        System.out.println("in show");
    }

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);

    }
}

/**
 *  access specifier or modifier
 *
 *  private -> it can be accessed within class only
 *
 *  default -> it can be accessed within package,and it is more restrictive than protected.
 *
 *  protected -> it can be accessed within package and outside package through inheritance
 *
 *  public -> it can be accessed in whole project

 *
 */