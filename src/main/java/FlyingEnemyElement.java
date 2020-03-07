public class FlyingEnemyElement extends EnemyElement {

    private int yPosition;

    FlyingEnemyElement(int xPosition, int yPosition, int damagePerHit) {
        super(xPosition, yPosition, damagePerHit);
        this.yPosition = super.getYPosition();
    }

    void moveUp(int dY) {
        yPosition += dY;
    }

    int getYPosition() {
        return yPosition;
    }

    int getXPosition() {
        return super.getXPosition();
    }
}
