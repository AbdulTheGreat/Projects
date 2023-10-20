package game;

import javax.swing.*;

// Create a class Game
public class Game {

    private KeyHandler input;
    // initialize a new Game
    public Game() {
        GameWorld world = new GameWorld();
        GameView myView = new GameView(world, 600, 600);
        MyView view = new MyView(world, 600, 600);
        GiveFocus focus = new GiveFocus(view);
        view.addMouseListener(focus);
        KeyHandler keyHandler = new KeyHandler(world.getPlayer());
        view.addKeyListener(keyHandler);
        myView.addKeyListener(keyHandler);



        world.start();


    }

    public static void main(String[] args) {
        new Game();

    }
}