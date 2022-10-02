import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {
        double km ,totalPrice,price=0.10 ;
        int age ,fInformation;


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz..: ");
        age=input.nextInt();
        if(age<=0){
            System.out.println("yanlis deger girdiniz..");
        }
        System.out.println("lutfen mesafeyi giriniz");
        km=input.nextInt();
        if (km<=0){
            System.out.println("yanlis deger girdiniz..");
        }
        System.out.println("lutfen yolculuk tipini giriniz.\ntekyon--> 1\ngidis-donus--> 2");
        fInformation=input.nextInt();
        if (fInformation==1 ){

        } else if (fInformation==2) {

        }else{
            System.out.println("yanlis deger girdiniz..!!");
        }

        totalPrice=km*price;

        if (age<12){
            if(fInformation==1){
                System.out.println("indirimli fiyatiniz..: "+(totalPrice/2));
            }else{
                System.out.println("indirimli fiyatiniz..: "+((totalPrice/2)-totalPrice*0.20)*2);
            }
        }else if(age<24){
            if(fInformation==1){
                System.out.println("indirimli bilet fiyatiniz..:"+((totalPrice)-(totalPrice*0.10)));
            }else{
                System.out.println("indirimli bilet fiyatiniz..:"+((totalPrice)-(totalPrice*0.10)-totalPrice*0.20)*2);
            }
        }else if(age>65){
            if(fInformation==1){
                System.out.println("indirimli bilet fiyatiniz..:"+((totalPrice)-(totalPrice*0.30)));
            }else{
                System.out.println("indirimli bilet fiyatiniz..:"+((totalPrice)-(totalPrice*0.30)-totalPrice*0.20)*2);
            }
        }




    }
}
