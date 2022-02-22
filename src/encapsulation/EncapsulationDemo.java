package encapsulation;

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

    public int getId(){
        return id;
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
