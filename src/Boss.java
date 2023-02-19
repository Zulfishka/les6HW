public class Boss extends GameEntity {

    public Weapon one = new Weapon (WeaponType.LASER, "Lifgtsaber");

    @Override
    public String info() {
        return super.info() + ", weapon: " + this.one.getWeapon() + ", weapon type: " + this.one.getWeaponType();
    }
}