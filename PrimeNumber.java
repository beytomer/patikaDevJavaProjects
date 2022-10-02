import java.util.Scanner;
/* Java ile 1 - 100 arasındaki asal sayıları ekrana
yazdıran programı yazınız.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        String prime="";
        for (int i = 1; i < 100; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime+=(i+" ");
            }
        }
        System.out.println("Prime Number : "+prime);

    }
}
