public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if ((this.f1.chance-this.f1.possibility)>(this.f2.chance-this.f2.possibility)) {

            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("----**Yeni Round**----");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();

                }
            } else {
                System.out.println("Sporcularin sikletleri uymuyor !!");
            }
        } else if ((this.f1.chance-this.f1.possibility)<(this.f2.chance-this.f2.possibility)) {

            if (isCheck()) {
                while (this.f2.health > 0 && this.f1.health > 0) {
                    System.out.println("----**Yeni Round**----");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();

                }
            } else {
                System.out.println("Sporcularin sikletleri uymuyor !!");
            }

        }else{
            System.out.println("olasılık esit cikti dagiliiin !! :)");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandi..");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandi..");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

}
