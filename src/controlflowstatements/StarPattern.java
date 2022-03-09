package controlflowstatements;

public class StarPattern {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + count++);
            }
            System.out.println();
        }

        System.out.println();

    /*    int count1 = 16;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (count1 < 10) {
                    System.out.print(" 0" + count1--);
                } else System.out.print(" " + count1--);
            }
            System.out.println();
        }
*/
        int count1 = 16;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                if((i==2 && j==2)|| (i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)){
                    System.out.print("   ");
                    count1--;
                }else {
                    if (count1 < 10) {
                        System.out.print(" 0" + count1--);
                    } else System.out.print(" " + count1--);
                }
            }
            System.out.println();
        }

    }
}
