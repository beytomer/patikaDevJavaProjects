import java.util.Scanner;

public class taximeter {

    public static void main(String[] args) {
        double kl,tUcret,sbt=2.20,bsl=10.0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("kilometreyi giriniz : ");
        kl=input.nextDouble();

        tUcret=(kl*sbt)+bsl;
        tUcret=(tUcret < 20.0) ? 20.0 : tUcret;


        System.out.println("toplam maliyet : "+tUcret);



    }

}
