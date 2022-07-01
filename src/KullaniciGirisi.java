import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, val2 ="java123",newPassword ,val1;


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kullanici adini giriniz : ");
        userName=input.nextLine();
        System.out.println("lutfen sifreyi giriniz : ");
        password=input.nextLine();

        if (userName.equals("patika") && (password.equals(val2))){
            System.out.println("Giris Yaptiniz");
        }else {
            System.out.println("Bilgileriniz Hatali");

            System.out.println("Sifrenizi sifirlamak istiyorsaniz 1 giriniz\nSifrenizi sifirlamak istemiyorsaniz 2 giriniz ");
            val1=input.nextLine();

            switch (val1){

                case "1" : {
                    System.out.println("lutfen yeni sifrenizi giriniz : ");
                    newPassword = input.next();


                    if (newPassword.equals("java123")) {
                        System.out.println("Sifre olusturulamadi lutfen farkli sifre giriniz !");
                         newPassword=input.next();
                        System.out.println("Sifre olustirildi..");
                    } else {
                        System.out.println("Sifre olusturildi..");
                    }
                    break;
                }
                case "2" :
                    System.out.println("iyi gunler..");
                    break;
            }



        }


    }


}
