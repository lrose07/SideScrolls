public class Weapon {

    private int damagePerHit;
    private int range;

    Weapon(int damagePerHit, int range) {
        this.damagePerHit = damagePerHit;
        this.range = range;
    }

    int getDamagePerHit() {
        return damagePerHit;
    }

    int getRange() {
        return range;
    }
}
