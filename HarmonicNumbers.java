import java.util.Scanner;
public class HarmonicNumbers {
    /*Java ile girilen sayının harmonik serisini
     bulan program yazacağız.
     */
    public static void main(String[] args) {

        double total=0.0;
        int val;

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen harmonik serisi hesaplanacak sayiyi giriniz : ");
        val=scan.nextInt();

        for(double i=1;i<=val;i++){
            total+=(1/i);
        }
        System.out.println("istenilen harmonik seri : "+total);


    }
}
