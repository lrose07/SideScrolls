import javax.swing.*;
import java.awt.*;

public class MainMenuView extends JFrame {

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
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        addGameElements(this);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void addGameElements(JFrame frame) {
        JPanel mainPanel = new JPanel();
        JButton startButton = new JButton();

        startButton.addActionListener(e -> startButtonClicked());

        mainPanel.add(startButton);

        frame.add(mainPanel);
    }

    private void startButtonClicked() {
        // doing it this way requires the views to know about each other, and they should not
        gameController.setCurrentView(this);
    }
}
