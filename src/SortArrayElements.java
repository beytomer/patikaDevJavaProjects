import java.util.Scanner;
import java.util.Arrays;

public class SortArrayElements {
    /*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan
    programı yazınız. Dizinin boyutunu ve dizinin elemanlarını
    kullanıcıdan alınız.
     */
    public static void main(String[] args) {
        int val;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        val = scan.nextInt();

        int[] array = new int[val];
        for (int i = 0; i < array.length; i++){
            System.out.print("Dizinin "+(i+1)+". elemenini giriniz : ");
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Siralama : "+Arrays.toString(array));
    }
}
