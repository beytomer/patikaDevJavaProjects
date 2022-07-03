/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı
yazınız.
 */
import java.util.Scanner;
public class ThreeAndFourDivisibility {
    public static void main(String[] args) {

        int k, sum=0, counter =0 ;
        Scanner inp = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        k=inp.nextInt();

        for (int i =0; i<=k; i++){

            if (i%3==0 && i%4==0){
                sum=sum+i;
                counter++;

            }

        }
        System.out.println("Girilen sayidan sifira kadar olan sayilarin\n 3 ve 4 e bolunenlerin ortalamasi : "+(sum/counter));


    }
}
