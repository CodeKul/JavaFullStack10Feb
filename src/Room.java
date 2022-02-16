
public class Room {

    String fan;
    String tv;

    public String useTv(int i){
        System.out.println("Hello");
        return "Hello";
    }

    public static void main(String[] args) {
        System.out.println("hello");
       Room obj = new Room();
       obj.useTv(4);
    }
}
