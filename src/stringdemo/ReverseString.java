package stringdemo;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am a developer and I am also Engineer";

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res.concat(String.valueOf(str.charAt(i)));
        }
//        System.out.println(res);

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
    }
}
