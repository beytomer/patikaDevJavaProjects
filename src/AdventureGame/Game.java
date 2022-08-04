import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner input=new Scanner(System.in);
    private Random r=new Random();



    public void start(){
        System.out.println("Macera oyununa hosgeldiniz ! ");
        System.out.print("Lutfen bir isim giriniz : ");
        String playerName=input.nextLine();
        Player player = new Player(playerName);
        boolean win=false;
        boolean lost=false;

        System.out.println("Sayin "+ player.getName()+" Bu karanlik ve sisli adaya Hosgeldiniz..Bu adada ki hersey gercek..!");
        player.selectChar();

        Location location=null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("********************************** Bolgeler **********************************");
            System.out.println();
            System.out.println("1- Guvenli Ev    -->  Burasi sizin icin guvenli dusman yoktur");
            System.out.println("2- Esya Dukkani  -->  Silah ve zirh satin alabilirsiniz");
            System.out.println("3- Magara        -->  Odul <food>, Magaraya git ,Dikkatli ol zombi cikabilir ");
            System.out.println("4- Orman         -->  Odul <firewood>, Ormana git , Dikkatli ol vampir cikabilir ");
            System.out.println("5- Nehir         -->  Odul <water>,  Nehire git, Dikkatli ol ayi cikabilir ");
            System.out.println("6- Maden         -->  Odul <random nesne para>,  Nehire git, Dikkatli ol yilan cikabilir ");
            System.out.println("0- Cikis Yap     -->  Oyunu Sonlandir ");

            System.out.println("Lutfen gitmek istediginiz bolgeyi secin ..");
            int selectLoc=input.nextInt();

            switch (selectLoc){
                case 0:
                    location=null;
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }
                    break;
                case 1:
                    if (player.getInventory().getAward()[0].equals("food")&&player.getInventory().getAward()[1].equals("water")&&player.getInventory().getAward()[2].equals("firewood")){
                        System.out.println("*-*-**-*-*-*-*-*-*-*-* OYUNU KAZANDINIZ*-*-*-*-**-*-*-*-*-**");
                        win=true;
                        break;
                    }

                    location=new SafeHouse(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }
                    break;
                case 2:
                    location=new ToolStore(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }
                    break;
                case 3:
                    if (player.getInventory().getAward()[0].equals("food")){
                        System.out.println("Magarada ki tum canavarlari daha once yendiniz. Baska bolge seciniz !");
                        break;
                    }
                    location=new Cave(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }

                    break;
                case 4:
                    if (player.getInventory().getAward()[2].equals("firewood")){
                        System.out.println("Ormanda ki tum canavarlari daha once yendiniz. Baska bolge seciniz !");

                        break;
                    }
                    location=new Forest(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }

                    break;
                case 5:
                    if (player.getInventory().getAward()[1].equals("water")){
                        System.out.println("Nehirde ki tum canavarlari daha once yendiniz. Baska bolge seciniz !");

                        break;
                    }
                    location=new River(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }

                    break;
                case 6:
                    location=new Coal(player);
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }
                    int awardRand=r.nextInt(100);
                    int weapRand=r.nextInt(10);
                    int armorRand=r.nextInt(10);
                    int moneyRand=r.nextInt(10);
                    if (awardRand<15){
                        if (weapRand<2){
                            System.out.println("Sanslisiniz tufek odulu kazandiniz tebrikler..");
                            if (player.getInventory().getWeapon().getDamage()<Weapon.weapons()[2].getDamage()){
                                player.getInventory().setWeapon(Weapon.weapons()[2]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }


                        }
                        if (weapRand<5 && weapRand>=2){
                            System.out.println("Sanslisiniz kilic odulu kazandiniz tebrikler..");
                            if (player.getInventory().getWeapon().getDamage()<Weapon.weapons()[1].getDamage()){
                                player.getInventory().setWeapon(Weapon.weapons()[1]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }

                        }else{
                            System.out.println("Sanslisiniz tabanca odulu kazandiniz tebrikler..");
                            if (player.getInventory().getWeapon().getDamage()<Weapon.weapons()[0].getDamage()){
                                player.getInventory().setWeapon(Weapon.weapons()[0]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }
                        }
                    }
                    if (awardRand<30 &&awardRand>=15){
                        if (armorRand<2){
                            System.out.println("Sanslisiniz Agir zirh odulu kazandiniz tebrikler..");
                            if (player.getInventory().getArmor().getBlock()<Armor.armors()[2].getBlock()){
                                player.getInventory().setArmor(Armor.armors()[2]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }
                        }
                        if (armorRand<5 && armorRand>=2){
                            System.out.println("Sanslisiniz Orta zirh odulu kazandiniz tebrikler..");
                            if (player.getInventory().getArmor().getBlock()<Armor.armors()[1].getBlock()){
                                player.getInventory().setArmor(Armor.armors()[1]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }

                        }else{
                            System.out.println("Sanslisiniz Hafif Zirh odulu kazandiniz tebrikler..");
                            if (player.getInventory().getArmor().getBlock()<Armor.armors()[0].getBlock()){
                                player.getInventory().setArmor(Armor.armors()[0]);
                            }else{
                                System.out.println("Envanterinizdeki esya kazandiginizdan degerli oldugu icin envanterinizdeki ile degistirilmedi");
                            }
                        }

                    }
                    if (awardRand<55 &&awardRand>=30){
                        if (moneyRand<2){
                            System.out.println("Sanslisiniz 10 para odulu kazandiniz tebrikler..");
                            player.setMoney(player.getMoney()+10);
                        }
                        if (moneyRand<5 && moneyRand>=2){
                            System.out.println("Sanslisiniz 5 para odulu kazandiniz tebrikler..");
                            player.setMoney(player.getMoney()+5);

                        }else{
                            System.out.println("Sanslisiniz 1 para odulu kazandiniz tebrikler..");
                            player.setMoney(player.getMoney()+1);
                        }

                    }
                    if(awardRand>=55 ){
                        System.out.println("odul yok");
                    }

                    break;

                default:
                    System.out.println("Lutfen gecerli bir bolge giriniz !");
                    if (!location.onLocation()){
                        System.out.println("GAME OVER ");
                        lost=true;
                        break;
                    }
            }
            if (win){
                break;
            }
            if (lost){
                break;
            }


        }





    }
}
