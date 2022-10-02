import java.util.Scanner;

public class MinAndMaxValue {
    public static void main(String[] args) {
        int val1, min = 1, max = 1, count;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kac numara girilecek : ");
        count = scan.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". numara : ");
            val1 = scan.nextInt();

            if (i == 1) {
                min = val1;
                max = val1;
            }

            if (val1 < min) {
                min = val1;
            }

            if (val1 > max) {
                max = val1;
            }



        }
        System.out.println("Min value : " + min);
        System.out.println("Max value : " + max);
    }
}
