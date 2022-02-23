package thisdemo;

/**
 * this keyword =>
 * 1. it refers the current class instance variable
 *
 */
public class ThisDemo {

    //instance variable // global variable
    private int id;
    private String name;
    private String address;

    public void setValues(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();

        obj.setValues(1,"Raj","pune");
        obj.setValues(2,"Prakash","Mumbai");

        System.out.println("Id=>"+obj.id+" name=>"+obj.name+" address=>"+obj.address);
    }

}
