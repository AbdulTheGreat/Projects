package game;

import city.cs.engine.DebugViewer;
import city.cs.engine.UserView;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class MyView extends UserView {

    private static Player player;
    public static final Image background = new ImageIcon("data/MoonBackground.png").getImage();
    public MyView(World w, int width, int height) {
        super(w, width, height);
    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }
    //optional: uncomment this to make a debugging view
   // JFrame debugView = new DebugViewer(new World(), 600, 600);
}
