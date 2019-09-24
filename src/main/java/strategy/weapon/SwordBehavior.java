package strategy.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Mighty sword swing!");
    }
}
