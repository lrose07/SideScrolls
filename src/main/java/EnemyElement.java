public class EnemyElement extends MovingElement {

    private int xPosition, yPosition, startingHealth;
    private final int defaultStartingHealth = 100;
    private int currentHealth;

    EnemyElement(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.startingHealth = defaultStartingHealth;
        this.currentHealth = startingHealth;
    }

    EnemyElement(int xPosition, int yPosition, int startingHealth) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.startingHealth = startingHealth;
        this.currentHealth = startingHealth;
    }

    void getAttacked(int attackDamage) {
        currentHealth -= attackDamage;

        if (currentHealth <= 0) {
            die();
        }
    }

    void die() {
        System.out.println("enemy dead");
    }

    int getCurrentHealth() {
        return currentHealth;
    }
}
