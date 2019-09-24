package strategy.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Sneaky knife stab!");
    }
}
