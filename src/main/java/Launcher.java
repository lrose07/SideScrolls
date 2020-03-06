public class Launcher {
    public static void main(String[] args) {

        GameController gameController = new GameController();

        MainMenuView mainMenuView = new MainMenuView();
        GameRunningView gameRunningView = new GameRunningView();

        mainMenuView.addController(gameController);
        gameRunningView.addController(gameController);

        new GameController().run();
    }
}

/*
 * magic - you're a witch/wizard getting through side-scrolling levels
 * You collect magical items and use them to do cool things and
 * defeat enemies (weapons, potions, power-up things)
 *
 * Game spec
 */
