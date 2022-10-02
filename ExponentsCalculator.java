import java.util.Scanner;
public class ExponentsCalculator {
    /*Java ile kullanıcının girdiği değerler ile üslü sayı
    hesaplayan programı "For Döngüsü" kullanarak yapınız.

     */
    public static void main(String[] args) {

        int val1,val2,sum=1;


        Scanner scan =new Scanner(System.in);
        System.out.println("Ussu alinacak sayiyi giriniz : ");
        val1 = scan.nextInt();

        System.out.println("Us olacak sayiyi giriniz : ");
        val2 = scan.nextInt();

        for (int i=0; i<val2; i++){

            sum=sum*val1;
        }
        System.out.println(val1+"^"+val2+"="+sum);


    }
}
