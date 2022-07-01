import java.util.Scanner;
public class SortingNumbers {
    public static void main(String[] args) {
        int firstNumber,secondNumber,thirdNumber;

        Scanner input =new Scanner(System.in);
        System.out.println("firstNumber : ");
        firstNumber=input.nextInt();

        System.out.println("secondNumber : ");
        secondNumber=input.nextInt();

        System.out.println("c : ");
        thirdNumber=input.nextInt();


        if ((firstNumber>secondNumber) && (firstNumber>thirdNumber)){
            if ((secondNumber>thirdNumber)){
                System.out.println("c<b<a");
            }else {
                System.out.println("b<c<a");
            }

        } else if ((secondNumber>firstNumber) && (secondNumber>thirdNumber)) {
            if ((firstNumber>thirdNumber)){
                System.out.println("c<a<b");
            }else{
                System.out.println("a<c<b");
            }

        }else{
            if ((firstNumber>secondNumber)){
                System.out.println("b<a<c");
            }else{
                System.out.println("a<b<c");
            }
        }

    }

}
