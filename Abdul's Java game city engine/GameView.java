package game;

import city.cs.engine.DebugViewer;
import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;

public class GameView extends JFrame {
    // public  static final JFrame view = new JFrame()
    public GameView(GameWorld w, int width, int height) {
        super();
        MyView myView = new MyView(w, 600, 600);
        this.add(myView);

        // enable the frame to quit the application
        // when the x button is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationByPlatform(true);
        // don't let the frame be resized
        this.setResizable(false);
        // size the frame to fit the world view
        this.pack();
        // finally, make the frame visible
        this.setVisible(true);


    }
}