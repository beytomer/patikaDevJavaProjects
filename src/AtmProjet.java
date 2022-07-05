import java.util.Scanner;
public class AtmProjet {
    public static void main(String[] args) {
        /*Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi
        userName : patika
        password : dev123
         */

        String userName,password;
        int right =3,val,balance=1500,money;
        Scanner scan=new Scanner(System.in);

        while (right>0){
            System.out.println("Kullanici Adi : ");
            userName=scan.nextLine();
            System.out.println("Kullanici Sifresi :");
            password=scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Sisteme Giris Yaptiniz ..");

                do {
                    System.out.println("1- Para Yatirma \n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis Yap");
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    val=scan.nextInt();

                    switch (val){
                        case 1: {
                            System.out.println("Yatirilacak Miktar : ");
                            money= scan.nextInt();
                            balance+=money;
                            break;
                        }
                        case 2 : {
                            System.out.println("Cekilecek Miktar : ");
                            money= scan.nextInt();
                            if (money<=balance) {
                                balance -= money;
                            }else {
                                System.out.println("Yetersiz bakiye !! Bakiyeniz kadar cekebilirsiniz..!");
                            }
                            break;
                        }
                        case 3 : {
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        }
                    }
                }while(val!=4);
                System.out.println("iyi gunler..Cikis yapildi..");
                break;

            }else{
                right--;
                System.out.println("Hatali kullanici adi yada sifre tekrar deneyiniz !!");
                if (right==0){
                    System.out.println("Hesabiniz bloke olmustur lütfen banka ile iletisime geciniz !!");
                }else{
                    System.out.println("kalan hak : "+right);
                }
            }

        }

    }
}
