import java.util.Scanner;

public class kdvCalculator {

    public static void main(String[] args) {


        double fiyat ,kdvFiyat , kdvOrani  , kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("ucreti giriniz :");
        fiyat =input.nextInt();

        System.out.println("Kdvsiz ucreti : "+fiyat);


       boolean tmp = (fiyat >1000);
       kdvOrani=tmp ? 0.08: 0.18;

        kdvFiyat = kdvOrani * fiyat;
        kdvliFiyat= kdvFiyat + fiyat;

        System.out.println("kdv orani : "+ kdvOrani);
        System.out.println("kdv fiyati"+kdvFiyat);
        System.out.println("kdvliFiyat :"+kdvliFiyat);


    }



}
