import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameControllerTest {

    static private GameController gameController = new GameController();

    private PlayerElement playerElement = new PlayerElement(50, 50);

    static private ArrayList<EnemyElement> allEnemies = new ArrayList<>();
    static private ArrayList<EnemyElement> enemiesInRange = new ArrayList<>();
    static private EnemyElement enemyElementInRangeLeft = new EnemyElement(45, 45, 10);
    static private EnemyElement enemyElementInRangeRight = new EnemyElement(55, 55, 10);
    static private EnemyElement enemyOutOfRange = new EnemyElement(10, 10, 10);

    @BeforeAll
    public static void init() {
        allEnemies.add(enemyElementInRangeLeft);
        allEnemies.add(enemyElementInRangeRight);
        allEnemies.add(enemyOutOfRange);
        enemiesInRange = gameController.getEnemiesInRange(allEnemies);
    }

    @Test
    void testGetEnemiesInRange() {
        EnemyElement newEnemyInRange = new EnemyElement(45, 50, 10);
        ArrayList<EnemyElement> newCurrentEnemies = (ArrayList<EnemyElement>) allEnemies.clone();
        newCurrentEnemies.add(newEnemyInRange);
        ArrayList<EnemyElement> newEnemiesInRange = gameController.getEnemiesInRange(newCurrentEnemies);
        assert newEnemiesInRange.size() == 3;
    }

    @Test
    void testExecuteEnemyAttacks() {
        int totalDamageToPlayer = gameController.executeEnemyAttacks(enemiesInRange);
        int totalPossibleDamageByEnemies = enemyElementInRangeLeft.getDamagePerHit() +
                enemyElementInRangeRight.getDamagePerHit();

        System.out.println("damage done " + totalDamageToPlayer);
        System.out.println("damage possible " + totalPossibleDamageByEnemies);
        assertTrue (totalDamageToPlayer > 0 && totalDamageToPlayer < totalPossibleDamageByEnemies);
    }
}
