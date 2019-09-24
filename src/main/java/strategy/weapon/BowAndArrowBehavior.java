package strategy.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Swift bow volley!");
    }
}
