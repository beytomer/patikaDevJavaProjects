import java.util.Scanner;

public class PassTheClass {

    public static void main(String[] args) {

        int matematik,turkce,fizik,kimya,muzik,counter=5;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        matematik=input.nextInt();
        if(matematik<0 || matematik >100){
            matematik=0;
            counter--;
        }

        System.out.println("turkce notunuz :");
        turkce=input.nextInt();
        if(turkce<0 || turkce >100){
            turkce=0;
            counter--;
        }

        System.out.println("fizik notunuz :");
        fizik=input.nextInt();
        if(fizik<0 || fizik >100){
            fizik=0;
            counter--;
        }

        System.out.println("kimya notunuz :");
        kimya=input.nextInt();
        if(kimya<0 || kimya >100){
            kimya=0;
            counter--;
        }

        System.out.println("Muzik notunuz :");
        muzik=input.nextInt();
        if(muzik<0 || muzik >100){
            muzik=0;
            counter--;
        }

        double avarage =(matematik+turkce+fizik+kimya+muzik)/counter;
        if(avarage<55){
            System.out.println("sinifta kaldiniz..!");
        }else{
            System.out.println("sinifi gectiniz !");
        }

        System.out.println("ortalamaniz "+avarage);


    }

}
