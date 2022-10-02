import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        double val1,val2,sum,subtract,multiply,divide ;
        int select ;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk degeri giriniz : ");
        val1=input.nextDouble();

        System.out.println("ikinci degeri giriniz : ");
        val2=input.nextDouble();

        System.out.println(" 1 = toplama \n 2 = cikarma \n 3 = carpma \n 4 = bolme ");
        System.out.println("lutfen bir secim yapiniz : ");
        select=input.nextInt();

        switch (select) {

            case 1 :
                sum=val1+val2;
                System.out.println(val1+" + "+val2 +" ="+sum);
                break;
            case 2 :
                subtract=val1-val2;
                System.out.println(val1 +" - "+val2+ " ="+subtract);
                break;
            case 3 :
                multiply=val1*val2;
                System.out.println(val1+" * "+val2+" ="+multiply);
                break;
            case 4 :
                divide=val1/val2;
                System.out.println(val1+" / "+val2+ " ="+divide);
                break;


        }




    }


}
