import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class VucutKitleEndeksi {

    public static void main(String[] args) {
        double boy,kilo,endeks;

        Scanner input = new Scanner(System.in);

        System.out.println("Boy degerini giriniz : ");
        boy=input.nextDouble();

        System.out.println("Kilo degerini giriniz :");
        kilo=input.nextDouble();

        endeks = kilo / (boy*boy);

        System.out.println("endeksiniz : "+endeks);



    }


}
