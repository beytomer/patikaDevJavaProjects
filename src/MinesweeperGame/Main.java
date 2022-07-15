import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int row,col;
        Scanner scan=new Scanner(System.in);
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz ");
        System.out.println("Lutfen Oynamak Istediginiz Boyutlari Giriniz ");
        System.out.print("Satir Sayisi : ");
        row=scan.nextInt();
        System.out.print("Sutun Sayisi : ");
        col=scan.nextInt();

        MineSweeper mine=new MineSweeper(row,col);
        mine.run();

    }
}
