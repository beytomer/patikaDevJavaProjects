import java.util.Scanner;
public class ActivitySuggestion {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sicakligi giriniz : ");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapmayi denemelisiniz..:)");
        }else if(heat<15){
            System.out.println("Sinamaya gitmelisiniz tam zamani..:)");

        }else if (heat<25){
            System.out.println("Pikniz zamani bu havayi kacirma ..:)");
        }else{
            System.out.println("Yuzmek icin harika bir hava..:)");
        }

        if(heat>10 && heat<15){
            System.out.println("piknik yapmayida dusunebilirsin..:)");
        }else if (heat>15 && heat<25){
            System.out.println("piknik yapmayida dusunebilirsin..:)");
        }

    }
}
