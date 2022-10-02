import java.util.Scanner;
/*Java ile bir sayının
"Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle
aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

 */
public class PalindromeNumbers {

    static boolean isPalindrom(int number){

        int temp=number,reverseNumber=0,lastNumber;

        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(number==reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {

        int val;
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edilecek sayiyi giriniz.. : ");
        val=scan.nextInt();
        if (isPalindrom(val)==true){
            System.out.println(val+" bir polindrome sayidir..");
        }else{
            System.out.println(val+" bir polindrome sayi degildir !!!");
        }

    }
}
