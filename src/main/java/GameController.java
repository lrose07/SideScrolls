import javax.swing.*;

public class GameController {

    JFrame currentView;

    // should have a list of views

    GameController() {

    }


    void run() {

    }

    // will this work?
    void setCurrentView(JFrame f) {
        currentView.setVisible(false);
        currentView = f;
        currentView.setVisible(true);
    }
}
