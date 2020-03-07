import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PlayerElementTest {
    private final int playerStartXPosition = 50;
    private final int playerStartYPosition = 50;

    private final int enemyStartXPosition = 60;
    private final int enemyStartYPosition = 60;
    private final int enemyDamagePerHit = 20;

    private PlayerElement playerElement = new PlayerElement(playerStartXPosition, playerStartYPosition);
    private EnemyElement enemyElement = new EnemyElement(enemyStartXPosition, enemyStartYPosition, enemyDamagePerHit);
    private Weapon weapon = new Weapon(30);

    @Test
    void testMoveLeft() {
        int movementDistance = 10;
        playerElement.moveLeft(movementDistance);
        assert playerElement.getXPosition() == playerStartXPosition - movementDistance;
    }

    @Test
    void testMoveRight() {
        int movementDistance = 10;
        playerElement.moveRight(movementDistance);
        assert playerElement.getXPosition() == playerStartXPosition + movementDistance;
    }

    @Test
    void testJump() {
        playerElement.jump();
        assert playerElement.getYPosition() == 70;
    }

    @Disabled("Test not yet implemented")
    @Test
    void testFall() {
        throw new AssertionError("Test not yet implemented");
    }

    @Test
    void testAttackEnemyUnarmed() {
        playerElement.attackEnemy(enemyElement);
        assert enemyElement.getCurrentHealth() == enemyElement.getStartingHealth() - playerElement.getUnarmedDamage();
    }

    @Test
    void testAttackEnemyArmed() {
        playerElement.setCurrentWeapon(weapon);
        playerElement.attackEnemy(enemyElement);
        assert enemyElement.getCurrentHealth() == enemyElement.getStartingHealth() - weapon.getDamagePerHit();
    }
}
