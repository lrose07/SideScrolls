import java.util.ArrayList;

public class EnemyManager {

    private GameController gameController;

    private ArrayList<EnemyElement> enemies;

    EnemyManager(GameController gameController) {
        this.gameController = gameController;
        enemies = new ArrayList<>();

        enemies.add(new FlyingEnemyElement(50, 50, 30));
        enemies.add(new EnemyElement(10, 20, 30));
    }

    ArrayList<EnemyElement> getCurrentEnemies() {
        return enemies;
    }
}
