package operator;

/**
 * unary operator -> a++ post increment, ++a pre increment , a-- ,--a
 * arithmetic operator -> + , - ,/ ,* ,%
 * relational -> < , > , <=, >=
 * logical -> & , |
 * assignment -> = , !=
 * ternary operator -> : ?
 * bitwise -> && , ||
 * shift operator -> <<  >>
 */
public class Operators {

    public static void main(String[] args) {
        int a = 9 ;
        int b = 9;
        int c = 90;



//        System.out.println(a++); //a = a + 1

//        System.out.println(++a); //a+1 = a
//        System.out.println(a);

//        System.out.println(a--);//a = a-1

//        System.out.println(--a);//a-1 = a

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        System.out.println(a<b);//false
//        System.out.println(a>b);//true


//        System.out.println(a & b);//8
//        System.out.println(a | b);//13
        System.out.println(a==b);//false


        if(a>b && a>c ){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        System.out.println(a<<b);//a = a*2^b = 9*2^4=144
        System.out.println(a>>b);//a = a/2^b = 9/2^4 =0

//        System.out.println(a>b?"a is greater":"b is greater");
    }

}
