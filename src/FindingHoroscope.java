import java.util.Scanner;
public class FindingHoroscope {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz gunu giriniz : ");
        day = input.nextInt();
        System.out.println("Lutfen dogdugunuz ayi giriniz : ");
        month = input.nextInt();

        if(month==1){
            if(day<22){
                System.out.println(" Oglak Burcu");
            }else{
                System.out.println(" Kova Burcu");
            }

        }else if(month==2){
            if(day<20){
                System.out.println(" Kova Burcu");
            }else{
                System.out.println(" Balik Burcu");
            }

        }
        else if(month==3){
            if(day<21){
                System.out.println(" Balik Burcu");
            }else{
                System.out.println(" Koc Burcu");
            }

        }else if(month==4){
            if(day<21){
                System.out.println(" Koc Burcu");
            }else{
                System.out.println(" Boga Burcu");
            }

        }else if(month==5){
            if(day<21){
                System.out.println(" Boga Burcu");
            }else{
                System.out.println(" ikizler Burcu");
            }

        }else if(month==6){
            if(day<22){
                System.out.println(" ikizler Burcu");
            }else{
                System.out.println(" Yengec Burcu");
            }

        }else if(month==7){
            if(day<22){
                System.out.println(" Yengec Burcu");
            }else{
                System.out.println(" Aslan Burcu");
            }

        }else if(month==8){
            if(day<22){
                System.out.println(" Aslan Burcu");
            }else{
                System.out.println(" Basak Burcu");
            }

        }else if(month==9){
            if(day<22){
                System.out.println(" Basak Burcu");
            }else{
                System.out.println(" Terazi Burcu");
            }

        }else if(month==10){
            if(day<22){
                System.out.println(" Terazi Burcu");
            }else{
                System.out.println(" Akrep Burcu");
            }

        }else if(month==11){
            if(day<21){
                System.out.println(" Akrep Burcu");
            }else{
                System.out.println(" Yay Burcu");
            }

        }else if(month==12){
            if(day<22){
                System.out.println(" Yay Burcu");
            }else{
                System.out.println(" Oglak Burcu");
            }

        }else {
            System.out.println("yanlis deger girdiniz !!");
        }
    }

}
