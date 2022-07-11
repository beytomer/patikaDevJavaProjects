public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adi   \t:"+this.name);
        System.out.println("Tel No\t:"+this.mpno);
        System.out.println("Branch\t:"+this.branch);

    }
}
