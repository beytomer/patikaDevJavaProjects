import javax.sound.midi.Soundbank;
import java.awt.geom.AffineTransform;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    Random r=new Random();
    public BattleLoc(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Suan Buradasiniz : "+this.getName());
        System.out.println("Dikkatli ol ! Burada "+obsNumber+" tane "+this.getObstacle().getName()+" yasiyor");
        boolean control =true;
        while(control){
            System.out.println(" <S>avas veya <K>ac ");
            String selectCase=input.nextLine();
            control=false;
            if (!(selectCase.equals("s") || selectCase.equals("S") || selectCase.equals("k") || selectCase.equals("K"))){
                System.out.println("Yanlis karakter girdiniz. Lutfen yeniden giriniz.");
                control=true;
            }

            selectCase=selectCase.toUpperCase();
            if(selectCase.equals("S")){
                System.out.println("Savas islemleri olacak");
                if (combat(obsNumber)){
                    System.out.println(this.getName()+" tum dusmanlari yendiniz ");
                    if (this.getObstacle().getId()!=4){
                        System.out.println("Bolge Odulu "+this.getAward()+ " Kazandiniz");
                    }
                    if (this.getAward().equals("food")){
                        this.getPlayer().getInventory().setAward("food",0);
                    } else if (this.getAward().equals("water")) {
                        this.getPlayer().getInventory().setAward("water",1);
                    } else if (this.getAward().equals("firewood")) {
                        this.getPlayer().getInventory().setAward("firewood",2);
                    }

                    System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!");
                    System.out.println();
                    return true;
                }
            }
        }

        if (this.getPlayer().getHealth()<=0){
            System.out.println("Oldunuzzz..");
            return false;
        }

        return true;
    }
    public boolean combat(int obsNumber){
        boolean control=true;
        for(int i=1; i<=obsNumber; i++){
            int rand=r.nextInt(2);
            int snakeDamage=r.nextInt(4)+3;
            if (this.getObstacle().getId()==4){
                this.getObstacle().setDamage(snakeDamage);
            }

            this.getObstacle().setHealth(this.getObstacle().getOrjinalHelth());

            playerStats();
            obstacleStats(i);
            if (rand==0){
                while (control){
                    while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                        System.out.println("<V>ur veya <K>ac : ");
                        String selectCombat=input.nextLine().toUpperCase();
                        control =false;
                        if (!( selectCombat.equals("V") || selectCombat.equals("K"))){
                            System.out.println("Yanlis karakter girdiniz. Lutfen yeniden giriniz.");
                            control=true;
                        }

                        if (selectCombat.equals("V")){
                            System.out.println("Siz vurdunuz ");
                            this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                            afterHit();
                            if (this.getObstacle().getHealth()>0){
                                System.out.println("Canavar Size Vurdu ");
                                int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();

                                if (obstacleDamage<0) {
                                    obstacleDamage=0;
                                }

                                this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                                afterHit();
                            }

                        }else {
                            if (selectCombat.equals("K")){
                                return false;
                            }

                        }
                    }
                }

            }
            if (rand==1){
                while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                    if (this.getObstacle().getHealth()>0){
                        System.out.println("Canavar Size Vurdu ");
                        int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();

                        if (obstacleDamage<0) {
                            obstacleDamage=0;
                        }

                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                        afterHit();
                    }
                    if (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                        System.out.println("<V>ur veya <K>ac : ");
                        String selectCombat=input.nextLine().toUpperCase();
                        if (selectCombat.equals("V")){
                            System.out.println("Siz vurdunuz ");
                            this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                            afterHit();

                        }else {
                            return false;
                        }
                    }

                }
            }
            if (this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Dusmani Yendiniz *!*!*!*!");
                if (this.getObstacle().getId()!=4){
                    System.out.println(this.getObstacle().getAward()+" para kazandiniz *!*!*!*!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                }
                System.out.println("Guncel Paraniz "+this.getPlayer().getMoney());
            }else{
                return false;
            }
        }
        return true;
    }
    public void playerStats(){
        System.out.println("Oyuncu Degerleri ");
        System.out.println("--------------------------------");
        System.out.println("Saglik = "+this.getPlayer().getHealth());
        System.out.println("Silah = "+this.getPlayer().getInventory().getWeapon().getDamage());
        System.out.println("Zirh = "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama  = "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar = "+this.getPlayer().getTotalDamage());
        System.out.println("Para = "+this.getPlayer().getMoney());
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i+". "+this.getObstacle().getName()+" Degerleri");
        System.out.println("----------------------------------");
        System.out.println("Saglik  : "+this.getObstacle().getHealth());
        System.out.println("Hasar   : "+this.getObstacle().getDamage());
        System.out.println("Para    : "+this.getObstacle().getAward());
        System.out.println();
    }
    public void afterHit(){
        System.out.println("Caniniz        : "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Cani : "+this.getObstacle().getHealth());
        System.out.println("----------------------------------------");
    }
    public int randomObstacleNumber(){
        Random r=new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
