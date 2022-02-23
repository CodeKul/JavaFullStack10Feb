package encapsulation;

/**
 * encapsulation - wrapping a data and code in single unit .
 * making field private and giving access them via public getter and setter
 *
 * advantage ->
 *  you can make class read only or write only
 *  you can protect from unauthorized access
 */
public class EncapsulationDemo {

    private int id;
    private String name;
    private String address;

    public void setId(int id){
        if(id==0){
            System.out.println("Id is 0");
        }else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        obj.id = 1;
        obj.name = "Suhas";
        obj.address = "Pune";

        System.out.println("id=>"+obj.id+" name=>"+obj.name+" address=>"+obj.address);
    }
}

class Sample{
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(1);
//        obj.name = "Suhas";
//        obj.address = "Pune";
    }
}
