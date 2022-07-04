import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak
         r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
         olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde
         gösterilir.Java ile kombinasyon hesaplayan program yazınız.

         Kombinasyon formülü
         C(n,r) = n! / (r! * (n-r)!)

         */

        int val1,val2,sum1=1, sum2=1,sum3=1;

        Scanner scan = new Scanner(System.in);
        System.out.println("N'in r'li kombinasyonu icin");
        System.out.println("N : ");
        val1=scan.nextInt();
        System.out.println("r : ");
        val2=scan.nextInt();

        for (int i=1; i<=val1; i++){

            sum1*=i;
        }

        for (int k=1; k<=val2; k++){

            sum2*=k;
        }

        for (int j=1; j<=(val1-val2); j++){

            sum3*=j;
        }

        System.out.println("C("+val1+","+val2+") : "+(sum1/(sum2*sum3)));

    }
}
