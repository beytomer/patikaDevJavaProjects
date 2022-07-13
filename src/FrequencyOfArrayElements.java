import java.util.Arrays;

public class FrequencyOfArrayElements {
    /*Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

    Senaryo
    Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    Tekrar Sayıları
    10 sayısı 3 kere tekrar edildi.
    20 sayısı 4 kere tekrar edildi.
    5 sayısı 1 kere tekrar edildi.
     */
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    count++;
                }
            }
            if (i == array.length - 1 || array[i] != array[i + 1])
                System.out.println(array[i] + " sayisi " + count + " kere tekrar edildi..");

        }
    }
}
