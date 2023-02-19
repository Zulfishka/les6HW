public class Weapon {
    private WeaponType weaponType;
    private String weapon;

    public Weapon (WeaponType weaponType, String weapon) {
        this.weaponType = weaponType;
        this.weapon = weapon;
    }

    public Weapon () {
    }
    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
    public WeaponType getWeaponType() {
        return weaponType;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String getWeapon() {
        return weapon;
    }

}

