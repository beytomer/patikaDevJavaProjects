import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        int val1,sum=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edilecek sayiyi giriniz : ");
        val1=scan.nextInt();

        for (int i=1;i<=(val1/2);i++){
            if (val1%i==0){
                sum+=i;
            }
        }
        if (sum==val1){
            System.out.println(val1+" mukemmel sayidir ");
        }else {
            System.out.println(val1+"mukemmel sayi degildir !");
        }

    }
}
