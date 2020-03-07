public class EnemyElement extends MovingElement {

    private int xPosition, yPosition, startingHealth;
    private final int defaultStartingHealth = 100;
    private int currentHealth;
    private int damagePerHit;

    EnemyElement(int xPosition, int yPosition, int damagePerHit) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.startingHealth = defaultStartingHealth;
        this.currentHealth = startingHealth;
        this.damagePerHit = damagePerHit;
    }

    EnemyElement(int xPosition, int yPosition, int startingHealth, int damagePerHit) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.startingHealth = startingHealth;
        this.currentHealth = startingHealth;
        this.damagePerHit = damagePerHit;
    }

    void moveLeft(int dX) {
        xPosition -= dX;
    }

    void moveRight(int dX) {
        xPosition += dX;
    }

    void getAttacked(int attackDamage) {
        currentHealth -= attackDamage;

        if (currentHealth <= 0) {
            die();
        }
    }

    void attackPlayer() {
        throw new UnsupportedOperationException("Enemies cannot yet attack the player");
    }

    void die() {
        System.out.println("enemy dead");
    }

    int getCurrentHealth() {
        return currentHealth;
    }

    int getStartingHealth() {
        return startingHealth;
    }

    int getXPosition() {
        return xPosition;
    }

    int getYPosition() {
        return yPosition;
    }

    int getDamagePerHit() {
        return damagePerHit;
    }
}
