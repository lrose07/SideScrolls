public class PlayerElement extends MovingElement {

    private int xPosition, yPosition;

    PlayerElement(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    void moveLeft(int dX) {
        xPosition -= dX;
    }

    void moveRight(int dX) {
        xPosition += dX;
    }

    int getXPosition() {
        return xPosition;
    }
}
