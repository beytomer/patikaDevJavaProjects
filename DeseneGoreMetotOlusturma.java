import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void desen(int val1, int val2, int val3) {
        if (val1 > 0)
          // Sayımız sıfırdan küçük olana kadar  azaltılıyor ve ekrana yazdırılıyor.
        {
            System.out.print(val1 + " ");
            val1 = val1 - 5;
            val3 = val1;
            desen(val1, val2, val3);
        } else {
            // Sayı sıfırdan küçük veya eşit olunca bu else bloğuna giriyor
            // Burada sayımızı ilk haline eşit olana kadar arttırıyoruz sayımız ilk hakine eşit olunca
            // birdaha fonksiyonu çağırmıyoruz.
            System.out.print(val3 + " ");
            val3 = val3 + 5;
            if (val3 == val2) {
                System.out.println(val3);
            } else {
                desen(val1, val2, val3);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Lutfen sayiyi girin..: ");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        System.out.println("Deger : "+val);
        System.out.print("Ciktisi : ");
        desen(val, val, val);
    }

}