import org.junit.jupiter.api.Test;

class PlayerElementTest {
    private PlayerElement playerElement = new PlayerElement(50, 50);

    @Test
    void testMoveLeft() {
        playerElement.moveLeft(10);
        assert playerElement.getXPosition() == 40;
    }

    @Test
    void testMoveRight() {
        playerElement.moveRight(10);
        assert playerElement.getXPosition() == 60;
    }

    @Test
    void jump() {
        assert false;
    }

    @Test
    void attackEnemy(EnemyElement enemy) {
        assert false;
    }
}
