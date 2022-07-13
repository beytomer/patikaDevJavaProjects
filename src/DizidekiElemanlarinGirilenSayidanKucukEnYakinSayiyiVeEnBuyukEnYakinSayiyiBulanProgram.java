import java.util.Scanner;
import java.util.Arrays;


public class DizidekiElemanlarinGirilenSayidanKucukEnYakinSayiyiVeEnBuyukEnYakinSayiyiBulanProgram {

    public static void main(String[] args) {
        int val;
        int j=0;
        int k=0;
        int kIndis=0;
        int bIndis=0;

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int fark =Arrays.stream(list).max().getAsInt();
        int fark1 =Arrays.stream(list).max().getAsInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Deger Giriniz :");
        val = scan.nextInt();

        for (int i : list) {

            if (list[j]<val){
                if (Math.abs(val-list[j])<fark){
                fark=Math.abs(val-list[j]);
                kIndis=list[j];
                }
            }

            j++;
        }
        for (int i : list) {

            if (list[k]>val){

                if (Math.abs(val-list[k])<fark1){
                    fark1=Math.abs(val-list[k]);
                    bIndis=list[k];
                }
            }

            k++;
        }
        System.out.println("Girilen Sayidan Kucuk En Yakin Sayi : "+kIndis);
        System.out.println("Girilen Sayidan Buyuk En Yakin Sayi : "+bIndis);


    }

}
