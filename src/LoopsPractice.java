import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {

        int val, sum=0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Lutfen bir sayi giriniz : ");
            val=scan.nextInt();
            if (val%4==0 ){
                sum+=val;
            }

        }while(val%2==0);
        System.out.println("Cift ve 4'un kati olan sayilarin toplami : "+sum);
    }

}
