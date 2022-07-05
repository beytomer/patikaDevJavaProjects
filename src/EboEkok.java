import java.util.Scanner;

public class EboEkok {
    public static void main(String[] args) {

        int val1, val2;
        int ebob = 1,ekok=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("n1 sayisini giriniz.. : ");
        val1 = scan.nextInt();
        System.out.println("n2 sayisini giriniz.. : ");
        val2 = scan.nextInt();
        /* ************************************ EBOB **************************** */

        if (val1 < val2) {
            int i = 1;
            while (i <= val1) {
                if (val1 % i == 0 && val2 % i == 0) {
                    ebob = i;

                }
                i++;
            }
            System.out.println("Ebob"+"("+val1+","+val2+") ="+ebob);
        } else {
            int i = 1;
            while (i <= val2) {
                if (val1 % i == 0 && val2 % i == 0) {
                    ebob = i;

                }
                i++;
            }
            System.out.println("Ebob"+"("+val1+","+val2+") ="+ebob);
        }
     /* ************************************ EKOK **************************** */
        int i =1;
        while (i<(val1*val2)){
            if (i%val1==0 && i%val2==0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("Ekok"+"("+val1+","+val2+") ="+ekok);



    }
}
