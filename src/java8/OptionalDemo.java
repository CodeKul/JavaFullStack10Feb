package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {

        Employee obj = new Employee(1, "Prashant", null);
//        System.out.println(obj.getEmail());
//        System.out.println(obj.getEmail().toUpperCase());

        if (obj.getEmail() != null) {
            System.out.println(obj.getEmail().toUpperCase());
        } else {
//            System.out.println("email is null");
        }

//        Optional<String> optional = Optional.empty();
//        System.out.println(optional);

//        Optional<String> optional1 = Optional.of(obj.getEmail());//it return exception when optional is null
//        System.out.println(optional1);

        Optional<String> optional2 = Optional.ofNullable(obj.getEmail());//it returns empty when optional is null
        System.out.println(optional2.orElse("email is null"));

        Optional<String> optional3 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional3.orElseGet(() -> "email is null"));

        Optional<String> optional4 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional4.orElseThrow(() -> {
                    return new Exception("email is null ");
                }
        ));
        Optional<String> optional5 = Optional.ofNullable(obj.getEmail());
        System.out.println(optional5.orElseThrow());


    }
}

class Employee {

    private int id;
    private String name;
    private String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}