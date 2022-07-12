public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        toMyString();

    }
    double tax(){
        if (this.salary>1000){
            return this.salary*0.03;
        }else{
            return 0;
        }
    }
    int bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }else{
            return 0;
        }
    }
    double raiseSalary(){
        if (2021-this.hireYear<10){
            return this.salary*0.05;
        } else if (2021-this.hireYear<20) {
            return this.salary*0.10;
        }else{
            return this.salary*0.15;
        }
    }
    void  toMyString(){
        System.out.println("Adi : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic Yili : "+this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Maas Artisi : "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maas : "+(this.salary-this.tax()+this.bonus()));
        System.out.println("Maas Artisi, Bonuslar ve Vergi ile Birlikte toplam Maas : "+(this.salary-this.tax()+this.bonus()+this.raiseSalary()));
    }

}
