package strategy.weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Powerful axe crush!");
    }
}
