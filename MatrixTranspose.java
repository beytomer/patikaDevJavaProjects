import java.util.Arrays;
import java.util.Scanner;
public class MatrixTranspose {
    /*Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu
     bulan programı yazınız.Matrisin transpozunu (devriğini) almak, matrisin
     aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
     Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin
     transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin
     transpozu (devriği) nxk’lik bir matris olur. Örneğin bir
     A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
     A^T (A üzeri T) ile gösterilir.
     */

    static void transposeMatrix(int[][]matris){
        int[][]transpose=new int[matris[1].length][matris.length];

        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                transpose[j][i]=matris[i][j];
            }
        }
        System.out.println("Transpose : ");
        for (int[]row:transpose){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static int[][] wantMatrix(){
        int row,col;

        Scanner scan=new Scanner(System.in);
        System.out.print("Matrisin satir sayisi : ");
        row=scan.nextInt();
        System.out.print("Matrisin sutun sayisini giriniz : ");
        col=scan.nextInt();
        int[][]array=new int[row][col];
        System.out.println("Matrisin degerlerini giriniz ..");
        for (int i=0; i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print((i+1)+" .satir "+(j+1)+". sutun :");
                array[i][j]=scan.nextInt();

            }
        }

        System.out.println("\nMatris :");
        for (int i=0; i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }
    public static void main(String[] args) {

     transposeMatrix(wantMatrix());

    }

}
