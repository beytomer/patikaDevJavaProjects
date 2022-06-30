import java.util.Scanner;

public class taximeter {

    public static void main(String[] args) {
        double kl,tUcret,sbt=2.20,bsl=10.0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("kilometreyi giriniz : ");
        kl=input.nextInt();

        tUcret=(kl*sbt)+bsl;
        boolean tmp =(tUcret > 20.0);
        tUcret= tmp ? tUcret : 20.0;

        System.out.println("toplam maliyet : "+tUcret);



    }







}
