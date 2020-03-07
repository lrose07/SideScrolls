public class PlayerElement extends MovingElement {

    private int xPosition, yPosition;
    private final int jumpHeight = 20;

    private Weapon currentWeapon;
    private final int unarmedDamage = 10;

    PlayerElement(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.currentWeapon = null;
    }

    void moveLeft(int dX) {
        xPosition -= dX;
    }

    void moveRight(int dX) {
        xPosition += dX;
    }

    void jump() {
        yPosition += jumpHeight;
    }

    void setCurrentWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }

    void attackEnemy(EnemyElement enemy) {
        if (currentWeapon == null) {
            enemy.getAttacked(unarmedDamage);
        } else {
            enemy.getAttacked(currentWeapon.getDamagePerHit());
        }
    }

    int getXPosition() {
        return xPosition;
    }

    int getYPosition() {
        return yPosition;
    }
}
