import java.util.Scanner;

public class FibonacciNumbers {
    /* In mathematics, the Fibonacci is a concept that can be represented as numbers, sequences, or
    series such that each term is the sum of the two terms preceding it and the first two
    terms are 0 and 1. A Fibonacci number is generally denoted by Fn, where n is a natural number.
    The Fibonacci sequence is given by, 0, 1, 1, 2, 3, 5, and so on.

     */
    public static void main(String[] args) {
        int val1, val2, val3, sum = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinde istediginiz basamak  : ");
        val1 = scan.nextInt();

        val2 = 0;  // val2 ve val3 ü fibonaccinin ilk 2 değerini biz tanımladık
        val3 = 1;
        if (val1<1){  // Bu if bloğu girilen değeri istenen koşulda olup olmadığını kontrol ediyor
            System.out.println("Yanlis deger girdiniz !");
        }else{
            if (val1 == 1) { // Bu if bloğu girilen değer 1 e eşitse yazılması gerekeni yazıyor
                System.out.println("Fibonacci Acilimi\n" + val2);
            } else {
                System.out.println("Fibonacci Acilimi\n" + val2 + "\n" + val3);

                for (int i = 0; i < (val1 - 2); i++) { 
                    System.out.println(sum);     // -->döngü her döndüğünde hesaplanan değeri yazdırıyor
                    val2 = val3;                 //  --> val2 val3 deki değeri alıyor
                    val3 = sum;                  //    --> val3 sum ın değerini alıyor
                    sum = (val2 + val3);         //    --> sum ise fibonaccide istenilen önceki iki sayının toplamını alıyor
                }
            }
        }
    }
}
