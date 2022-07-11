public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String calsses, Course c1, Course c2, Course c3) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = calsses;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note1 >= 0 && note1 <= 100) {
            this.c2.note = note2;
        }
        if (note1 >= 0 && note1 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkVerbalNote(int verbal1, int verbal2, int verbal3) {
        this.c1.verbal=verbal1;
        this.c2.verbal=verbal2;
        this.c3.verbal=verbal3;

    }

    void printNote() {
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c2.name + "Notu\t:" + c2.note);
        System.out.println(c3.name + "Notu\t" + c3.note);
    }
    void printVerbal(){
        System.out.println(c1.name + " Sozlusu\t:" + c1.verbal);
        System.out.println(c2.name + "Sozlusu\t:" + c2.verbal);
        System.out.println(c3.name + "Sozlusu\t" + c3.verbal);
    }
    void  printAvarage(){
        System.out.println("Ortalamaniz\t:" + this.avarage);

    }

    void isPass() {
        this.avarage = ((this.c1.note)*0.8+(this.c1.verbal)*0.2 + (this.c2.note)*0.8+(this.c2.verbal)*0.2 + (this.c3.note)*0.8+(this.c3.verbal)*0.2) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sinifi Gectiniz..");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldiniz..!!");
            this.isPass = false;
        }
    }
}
