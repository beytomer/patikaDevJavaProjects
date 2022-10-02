import java.util.Scanner;
public class YildizlarUcgeni {
    /*Java'da döngüler kullanarak yıldızlar
    ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
     */
    public static void main(String[] args) {
        int val;
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen basamak giriniz : ");
        val=scan.nextInt();

        for (int i =0; i<=val;i++){

            for (int k=0; k<val-i; k++){
                System.out.print(" ");
            }
                for (int j=0; j<(2*i-1); j++){
                    System.out.print("*");
                }
                System.out.println();

        }
        for (int i =(val-1); i>0; i--){

            for (int k=0; k<(val-i); k++){
                System.out.print(" ");
            }
            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");

            }
            System.out.println();

        }


        }





    }

