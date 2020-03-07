import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class EnemyElementTest {

    private final int playerStartXPosition = 50;
    private final int playerStartYPosition = 50;

    private final int enemyStartXPosition = 60;
    private final int enemyStartYPosition = 60;
    private final int enemyDamagePerHit = 20;

    private final int moveDistance = 10;

    private PlayerElement playerElement = new PlayerElement(playerStartXPosition, playerStartYPosition);
    private EnemyElement enemyElement = new EnemyElement(enemyStartXPosition, enemyStartYPosition, enemyDamagePerHit);
    private Weapon weapon = new Weapon(30);

    @Test
    void moveLeft() {
        enemyElement.moveLeft(moveDistance);
        assert enemyElement.getXPosition() == enemyStartXPosition - moveDistance;
    }

    @Test
    void moveRight() {
        enemyElement.moveRight(moveDistance);
        assert enemyElement.getXPosition() == enemyStartXPosition + moveDistance;
    }

    @Test
    void testGetAttacked() {
        enemyElement.getAttacked(weapon.getDamagePerHit());
        assert enemyElement.getCurrentHealth() == enemyElement.getStartingHealth() - weapon.getDamagePerHit();
    }

    @Disabled("Enemies cannot yet attack the player")
    @Test
    void testAttackPlayer() {
        enemyElement.attackPlayer();
        assert playerElement.getCurrentHealth() == playerElement.getStartingHealth() - enemyElement.getDamagePerHit();
    }
}
