import java.util.Scanner;

public class triangelAreaCalculate {

    public static void main(String[] args) {
        double a,b,c,cevreYarisi,alankaresi;


        Scanner input = new Scanner (System.in);
        System.out.println("a giriniz :");
        a=input.nextInt();
        System.out.println("b giriniz :");
        b=input.nextInt();
        System.out.println("c giriniz :");
        c=input.nextInt();

        cevreYarisi =(a+b+c)/2;

        alankaresi =cevreYarisi*(cevreYarisi-a)*(cevreYarisi-b)*(cevreYarisi-c);
        System.out.println(Math.sqrt(alankaresi));

    }





}
