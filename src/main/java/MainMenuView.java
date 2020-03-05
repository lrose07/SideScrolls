import javax.swing.*;
import java.awt.*;

public class MainMenuView {

    private GameController gameController;
    private final int screenWidth = 600;
    private final int screenHeight = 400;

    MainMenuView() {
        buildView();
    }

    void addController(GameController gameController) {
        this.gameController = gameController;
    }

    private void buildView() {
        JFrame mainFrame = new JFrame("SideScrolls");

        mainFrame.setPreferredSize(new Dimension(screenWidth, screenHeight));

        addGameElements(mainFrame);

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void addGameElements(JFrame frame) {

    }
}
