public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double chance;
    double possibility;

    Fighter(String name, int damage, int health, int weight,int dodge,double chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (this.dodge>=0 && this.dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
        this.chance=chance;
        this.possibility=isFirst();
    }

    int hit(Fighter foe) {
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isDodge()){
            System.out.println("Gelen hasar bloklandi..!");
            return foe.health;

        }
        if (foe.health<0){
            return 0;
        }
        if (foe.health-this.damage<0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }
    double isFirst(){

        double randomNumber1=Math.random()*100;
        return this.possibility=randomNumber1;
    }
}
