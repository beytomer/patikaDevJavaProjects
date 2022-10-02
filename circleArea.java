import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {

        double pi=3.14,r,aci,area;

        Scanner input = new Scanner(System.in);

        System.out.println("yaricapi giriniz : ");
        r=input.nextDouble();

        System.out.println("aciyi giriniz :");
        aci=input.nextDouble();

        area= (pi*(r*r)*aci)/360;
        System.out.println("Dairenin alani : "+area);


    }
}
