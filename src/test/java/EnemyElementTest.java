import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class EnemyElementTest {

//    private final int playerStartXPosition = 50;
//    private final int playerStartYPosition = 50;

    private final int enemyStartXPosition = 60;
    private final int enemyStartYPosition = 60;
    private final int enemyDamagePerHit = 20;

    private final int moveDistance = 10;

//    private PlayerElement playerElement = new PlayerElement(playerStartXPosition, playerStartYPosition);
    private EnemyElement enemyElement = new EnemyElement(enemyStartXPosition, enemyStartYPosition, enemyDamagePerHit);
    private Weapon weapon = new Weapon(30, 10);

    @Test
    void testMoveLeft() {
        enemyElement.moveLeft(moveDistance);
        assert enemyElement.getXPosition() == enemyStartXPosition - moveDistance;
    }

    @Test
    void testMoveRight() {
        enemyElement.moveRight(moveDistance);
        assert enemyElement.getXPosition() == enemyStartXPosition + moveDistance;
    }

    @Test
    void testTakeDamage() {
        enemyElement.takeDamage(weapon.getDamagePerHit());
        assert enemyElement.getCurrentHealth() == enemyElement.getStartingHealth() - weapon.getDamagePerHit();
    }

    @Test
    void testTakeDamageStartingWithMoreHealth() {
        int alteredStartingHealth = 200;
        EnemyElement ee = new EnemyElement(enemyStartXPosition, enemyStartYPosition, alteredStartingHealth, enemyDamagePerHit);
        ee.takeDamage(weapon.getDamagePerHit());
        assert ee.getCurrentHealth() == ee.getStartingHealth() - weapon.getDamagePerHit();
    }

    @Disabled("currently determined to be not needed - will reevaluate later")
    @Test
    void testAttemptAttack() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> enemyElement.attemptAttack());
    }

    @Test
    void testDie() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> enemyElement.die());
    }
}
