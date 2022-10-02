
import java.util.Scanner;

public class GreengrocerProgram {

    public static void main(String[] args) {

        double p,a,t,b,e,pear=2.14,apple=3.67,tomatoes=1.11,banana=0.95,eggplant=5.00,totalSum;

        Scanner input = new Scanner(System.in);

        System.out.println("How many weight pear : ");
        p=input.nextDouble();

        System.out.println("How many weight apple : ");
        a=input.nextDouble();

        System.out.println("How many weight tomatoes : ");
        t=input.nextDouble();

        System.out.println("How many weight banana : ");
        b=input.nextDouble();

        System.out.println("How many weight eggplant : ");
        e=input.nextDouble();

        totalSum = pear*p + apple*a + tomatoes*t + banana*b + eggplant*e ;
        System.out.println("Total sum : "+totalSum);

    }
}
