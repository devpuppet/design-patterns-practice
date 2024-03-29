package strategy;

import strategy.model.*;
import strategy.model.Character;
import strategy.weapon.*;

public class StrategyTest {

    public static void run() {
        WeaponBehavior sword = new SwordBehavior();
        Character knight = new Knight();
        knight.setWeaponBehavior(sword);
        knight.performAttack();

        WeaponBehavior axe = new AxeBehavior();
        Character troll = new Troll();
        troll.setWeaponBehavior(axe);
        troll.performAttack();

        WeaponBehavior knife = new KnifeBehavior();
        Character king = new King();
        king.setWeaponBehavior(knife);
        king.performAttack();

        WeaponBehavior bowAndArrow = new BowAndArrowBehavior();
        Character queen = new Queen();
        queen.setWeaponBehavior(bowAndArrow);
        queen.performAttack();
    }

}
