import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        books.add(new Book("Harry Potter        ",780,"Ali    ","11 Aralik  "));
        books.add(new Book("Yuzuklerin efendisi ",565,"Nuh    ","12 Mayis   "));
        books.add(new Book("Buyuk Dortler       ",231,"Nicole ","22 Nisan   "));
        books.add(new Book("Sherlock Holmes     ",332,"Nevoras","3 Ocak     "));
        books.add(new Book("Anna                ",750,"Tolstoy","29 Mart    "));
        System.out.println("isime gore siralama !");
        System.out.println();
        for(Book i:books){
            System.out.println("Kitap adi:  "+i.getBookName()+
                    "            Sayfa numarasi:    "+i.getPageNo()+
                    "            Yazari:    "+i.getAuthorName()+
                    "            Kitabin Satis Tarihi:  "+i.getReleaseDate());

        }
        System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!");

        TreeSet<Book> books2=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNo()- o2.getPageNo();
            }
        });

        books2.add(new Book("Harry Potter       ",780,"Ali    ","11 Aralik  "));
        books2.add(new Book("Yuzuklerin efendisi",565,"Nuh    ","12 Mayis   "));
        books2.add(new Book("Buyuk Dortler      ",231,"Nicole ","22 Nisan   "));
        books2.add(new Book("Sherlock Holmes    ",332,"Nevoras","3 Ocak     "));
        books2.add(new Book("Anna               ",750,"Tolstoy","29 Mart    "));
        System.out.println();
        System.out.println("sayfa sayisina gore siralama ");
        System.out.println();
        for(Book i:books2){
            System.out.println("Kitap adi:  "+i.getBookName()+
                    "            Sayfa numarasi:    "+i.getPageNo()+
                    "            Yazari:    "+i.getAuthorName()+
                    "            Kitabin Satis Tarihi:  "+i.getReleaseDate());

        }






    }


}
