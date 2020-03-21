import javax.swing.*;
import java.util.ArrayList;

public class GameController {

    private JFrame currentView;

    private PlayerElement playerElement;

    private EnemyManager enemyManager;
    private ArrayList<EnemyElement> currentEnemies;
    private ArrayList<EnemyElement> enemiesInRange;

    private double hitThreshold;

    // should have a list of views

    GameController() {
        playerElement = new PlayerElement(50, 50);
        playerElement.setCurrentWeapon(new Weapon(40, 15));
        hitThreshold = playerElement.getCurrentRange();

//        enemyManager = new EnemyManager(this);
//        currentEnemies = enemyManager.getCurrentEnemies();
    }


    void run() {

    }

    ArrayList<EnemyElement> getEnemiesInRange(ArrayList<EnemyElement> eeList) {
        ArrayList<EnemyElement> eeInRange = new ArrayList<>();
        for (EnemyElement enemy : eeList) {
            if (isInRange(Math.abs(enemy.getXPosition() - playerElement.getXPosition()))
                && isInRange(Math.abs(enemy.getYPosition() - playerElement.getYPosition()))) {
                eeInRange.add(enemy);
            }
        }

        return eeInRange;
    }

    private boolean isInRange(double distance) {
        return distance < hitThreshold;
    }

    int executeEnemyAttacks(ArrayList<EnemyElement> enemiesAttacking) {
        int totalDamageToPlayer = 0;
        for (EnemyElement enemy : enemiesAttacking) {
            int temp = enemy.attemptAttack();
            System.out.println("dmg by 1 enemy " + temp);
            totalDamageToPlayer += temp;
        }
        return totalDamageToPlayer;
    }

    // will this work?
    void setCurrentView(JFrame f) {
        currentView.setVisible(false);
        currentView = f;
        currentView.setVisible(true);
    }
}
