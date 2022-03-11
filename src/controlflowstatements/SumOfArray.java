package controlflowstatements;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {104,45,567,76,76,103,45,666};
        int sum=0;

        for(int i=0;i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }


}
