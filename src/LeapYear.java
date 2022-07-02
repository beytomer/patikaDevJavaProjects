import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yili giriniz..: ");
        year=input.nextInt();

        if (year%4==0 ){
            if(year%100==0 && year%400==0){
                System.out.println(year+" yili artik yildir");
            }else if (year%100!=0){
                System.out.println("yili artik yildir..");
            }

        }else{
            System.out.println("artik yil degildir..");
        }

    }
}
