import java.util.Scanner;
public class ExponentsCalculatorWithRecursive {
    static int exponentsCalculator(int a ,int b){

        if(b==0){
            return 1;
    }else{
         return (a*exponentsCalculator(a,b-1));
        }
    }

    public static void main(String[] args) {

        int val,val1;
        Scanner scan=new Scanner(System.in);
        System.out.print("ussu alinacak sayiyi giriniz : ");
        val=scan.nextInt();
        System.out.print("ussu giriniz : ");
        val1=scan.nextInt();
        System.out.println(val+"^"+val1+" = "+exponentsCalculator(val,val1));
    }
}
