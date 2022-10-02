public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Guvenli Evdesiniz ");
        System.out.println("Canininz Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalhelth());
        return true;
    }
}
