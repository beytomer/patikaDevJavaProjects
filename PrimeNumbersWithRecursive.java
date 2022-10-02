import java.util.Scanner;
public class PrimeNumbersWithRecursive {

    static boolean isPrime(int a, int i){
        if (a==2){       // en küçük asal sayı 2 dir.
            return true;
        } else if (a<2) {
            return false;
        }
        if(a%i==0){      // sıra ile i arttırılarak eğer sayımızı bölen sayı var ise asal degildir.
            return false;

        }
        if(i*i>a){        // i kontrol ettiğimiz sayıyı geçmiş ise ve hala bölen sayı yok ise
                         // sayı 1 ve kendisinden baska böleni yoktur anlamına gelir.
            return true;
        }
        return isPrime(a,i+1);
    }

    public static void main(String[] args) {

        int val;
        Scanner scan=new Scanner(System.in);
        System.out.println("Asalligi kontrol edilecek sayiyi giriniz : ");
        val=scan.nextInt();

        if(isPrime(val,2)==true){
            System.out.println(val+ "  Asal sayidir ..");
        }else{
            System.out.println(val+"  Asal sayi degildir !!");
        }

    }
}
