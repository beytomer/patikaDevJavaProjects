import java.util.Scanner;

public  class FindPalindromicWord {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.print("Palindrom sorgusu yapilacak kelimeyi yaziniz : ");
        str=scan.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" kelimesi Palindromiktir...");
        }else {
            System.out.println(str+" kelimesi Palindromik Degildir !!!!...");

        }


    }
}
