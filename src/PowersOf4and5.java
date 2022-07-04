/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;
public class PowersOf4and5 {
    public static void main(String[] args) {

        int val;
        Scanner scan =new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        val=scan.nextInt();

        System.out.println("5'in kuvvetleri");
        for (int i =1; i<val; i*=5){
            System.out.println(i);

        }

        System.out.println("4'un Kuvvetleri");
        for (int k =1; k<val; k*=4){

            System.out.println(k);

        }





    }
}
