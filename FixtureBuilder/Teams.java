import java.util.*;

public class Teams {
    List<String> teamList = new LinkedList<>();
    Scanner scan =new Scanner(System.in);

    public void enterTeam(){
        System.out.print("Toplam takim sayisi kactir? : ");
        int totalTeam =scan.nextInt();
        for (int i=0; i<totalTeam; i++){
            System.out.println((i+1)+". takim : ");
            teamList.add(i,scan.next());
        }

    }
    public void mixTeam(){

        Collections.shuffle(teamList); // Takımları karıştırıyor

    }

    public void Fixture() {
        mixTeam();
        if (teamList.size() % 2 != 0) {
            teamList.add("Bay");
        }

        if (teamList.size() != 0) {
            System.out.println("TAKIMLAR\n");
            for (String say : teamList) {
                System.out.println("-" + say);
            }
        } else {
            System.out.println("Kayitli takim bulunmamaktadir.");
        }
        System.out.println();
        round();
    }
    private void round() {

        List<String> week  = new LinkedList<>();

        for(int k=0; k<teamList.size()-1; k++){
            List<String> copy1 = new LinkedList<>(teamList);
            List<String> copy2 = new LinkedList<>(teamList);

            while(copy1.size()!=0){
                int i=0;
                int j=0;
                while ((copy2.size()!=0)){

                    j++;
                  //  System.out.println("i : "+i);
                  //  System.out.println("j : "+j);
                    if(i!=j){
                      //  System.out.println("1. if icinde ");
                        if (!((week.contains(copy1.get(i)+" "+ copy2.get(j))) || (week.contains(copy2.get(j)+" "+ copy1.get(i))))){
                        //    System.out.println("2. if icinde ");
                            week.add(copy1.get(i)+" "+ copy2.get(j));
                            String value1=copy1.get(i);
                            copy1.remove(value1);
                            String value2=copy2.get(j);
                            copy1.remove(value2);
                            copy2.remove(value1);
                            copy2.remove(value2);
                            break;
                        }
                    }
                }
            }
        }
        int count=0;
        int count2=0;
        System.out.println("----------------Ligin 1. yarisi-----------------");
        for (String a:week){

            if (count%(teamList.size()/2)==0){
                count2++;
                System.out.println();
                System.out.println((count2)+". hafta ");
            }
            System.out.println(a);
            count++;
        }
        List<String> week2  = new LinkedList<>();


        for(int k=0; k<teamList.size()-1; k++){
            List<String> copy1 = new LinkedList<>(teamList);
            List<String> copy2 = new LinkedList<>(teamList);

            while(copy1.size()!=0){
                int i=0;
                int j=0;
                while ((copy2.size()!=0)){

                    j++;
                 //   System.out.println("i : "+i);
                //    System.out.println("j : "+j);
                    if(i!=j){
                      //  System.out.println("1. if icinde ");
                        if (!((week2.contains(copy1.get(i)+" "+ copy2.get(j))) || (week2.contains(copy2.get(j)+" "+ copy1.get(i))))){
                          //  System.out.println("2. if icinde ");
                            week2.add(copy2.get(j)+" "+ copy1.get(i));
                            String value1=copy1.get(i);
                            copy1.remove(value1);
                            String value2=copy2.get(j);
                            copy1.remove(value2);
                            copy2.remove(value1);
                            copy2.remove(value2);
                            break;
                        }
                    }
                }
            }
        }

        int count3=0;
        int count4=0;
        System.out.println("----------------Ligin 2. yarisi-----------------");
        for (String a:week2){

            if (count3%(teamList.size()/2)==0){
                count4++;
                System.out.println();
                System.out.println((count4)+". hafta ");
            }
            System.out.println(a);
            count3++;
        }
    }


}