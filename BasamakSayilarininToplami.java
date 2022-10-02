import java.util.Scanner;
public class BasamakSayilarininToplami {
    /* Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

    Örnek : 1643 = 1 + 6 + 4 + 3 = 14

     */
    public static void main(String[] args) {
        int val, count=0,sum=0;

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen rakamlari toplanacak sayiyi giriniz : ");
        val=scan.nextInt();


        while (val!=0){
            sum+=val%10;
            val/=10;
            count++;

        }
        System.out.println("Girilen Sayinin rakamlari toplami "+sum);



    }
}
