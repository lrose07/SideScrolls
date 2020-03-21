public class PlayerElement extends MovingElement {

    // TODO: apply singleton here - there should only be one player ever

    private int xPosition, yPosition;
    private final int jumpHeight = 20;

    private Weapon currentWeapon;
    private int unarmedDamage = 10;
    private int unarmedRange = 5;

    private final int startingHealth = 100;
    private int currentHealth;

    PlayerElement(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.currentWeapon = null;
        this.currentHealth = startingHealth;
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
            enemy.takeDamage(unarmedDamage);
        } else {
            enemy.takeDamage(currentWeapon.getDamagePerHit());
        }
    }

    int getXPosition() {
        return xPosition;
    }

    int getYPosition() {
        return yPosition;
    }

    int getUnarmedDamage() {
        return unarmedDamage;
    }

    int getStartingHealth() {
        return startingHealth;
    }

    int getCurrentHealth() {
        return currentHealth;
    }

    int getCurrentRange() {
        if (currentWeapon == null) {
            return unarmedRange;
        } else {
            return currentWeapon.getRange();
        }
    }

//    void setCurrentHealth(int newHealth) {
//        currentHealth = newHealth;
//    }
//
//    PlayerElement getPlayerElement() {
//        return this;
//    }
//
//    void getAttacked(int damageReceived) {
//        currentHealth = getPlayerElement().getCurrentHealth();
//        currentHealth -= damageReceived;
//        getPlayerElement().setCurrentHealth(currentHealth);
//    }
}
