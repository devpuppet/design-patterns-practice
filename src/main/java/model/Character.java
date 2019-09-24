package model;

import strategy.weapon.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performAttack() {
        weaponBehavior.attack();
    }
}
