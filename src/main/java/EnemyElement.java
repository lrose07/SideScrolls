import java.util.Random;

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

    void takeDamage(int damage) {
        currentHealth -= damage;

        if (currentHealth <= 0) {
            die();
        }
    }

    int attemptAttack() {
        Random random = new Random();
        return random.nextInt(getDamagePerHit() + 1);
    }

    void die() {
        System.out.println("enemy dead");
        throw new UnsupportedOperationException("Enemies cannot yet die");
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
