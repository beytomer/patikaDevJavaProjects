public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ali","12345","Tarih");

        Course tarih=new Course("tarih","101","trh");

        Course fizik=new Course("fizik","102","fzk");
        Course biyo=new Course("biyo","103","byl");

        Student s1=new Student("Ali","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(80,34,65);
        s1.addBulkVerbalNote(50,20,67);
        s1.isPass();
        s1.printNote();
        s1.printVerbal();
        s1.printAvarage();
    }
}
