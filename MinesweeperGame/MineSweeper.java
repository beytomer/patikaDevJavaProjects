import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int size;
    char [][]map;
    int [][]board;
    boolean game=true;
    Random rand=new Random();
    Scanner scan=new Scanner(System.in);
    MineSweeper(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.map=new char[rowNumber][colNumber];
        this.board=new int[rowNumber][colNumber];
        this.size=rowNumber*colNumber;
    }
    public void run(){
        int row,col;
        int success=0;
        prepareGame();
        //print(map);
        System.out.println("Oyun Basladi...");
        while (game){
            print(board);
            System.out.print("Satir : ");
            row=scan.nextInt();
            System.out.print("Sutun :");
            col=scan.nextInt();

            if(row>=0 && row<this.rowNumber && col>=0 && col<this.colNumber){
                if (map[row][col]!='*'){
                    checkMine(row,col);
                    success++;
                    if(success==this.size-(this.size/4)){
                        System.out.println("!!!! Oyunu Kazandiniz !!!");
                        break;
                    }else {
                    }
                }else{
                    game=false;
                    System.out.println("Game Over..!");
                    print(map);
                }
            }else {
                System.out.println("Gecersiz Koordinat");
                continue;
            }
        }
    }
    public void checkMine(int row,int col){
        if (map[row][col]=='0'){
            if ((col<colNumber-1)&&(map[row][col+1]=='*')){
                board[row][col]=  (board[row][col]+1);
            }
            if ((row<rowNumber-1)&&(map[row+1][col]=='*')){
                board[row][col]=  (board[row][col]+1);
            }
            if ((row>0)&&(map[row-1][col]=='*')){
                board[row][col]=  (board[row][col]+1);
            }
            if ((col>0)&&(map[row][col-1]=='*')){
                board[row][col]=  (board[row][col]+1);
            }
            if(board[row][col]==0){
                board[row][col]=-2;
            }
        }
    }
    public void prepareGame(){
        int randRow,randCol,count=0;
        while (count!=size/4){
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);
            if (map[randRow][randCol]!='*'){
                map[randRow][randCol]='*';
                count++;
            }
        } for (int i=0; i<this.rowNumber;i++){
            for (int j=0; j<this.colNumber;j++){
                if (map[i][j]!='*'){
                    map[i][j]='0';
                }
            }
        }

    }
    public void print(int [][]arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0; j< arr.length; j++){
                if (arr[i][j]>=0)
                    System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public void print(char [][]arr){
        for (int i=0; i<arr.length;i++){
            for (int j=0; j< arr.length; j++){

                System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
