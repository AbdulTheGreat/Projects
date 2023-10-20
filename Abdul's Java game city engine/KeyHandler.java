package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public static final int KEYBOARD1_ID = -2; // Arrow keys


    private volatile boolean left, right, up, down, fire;


    private final Player player;


        public KeyHandler(Player player) {
            super();
            this.player = player;

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT -> player.startWalking(-6);
                case KeyEvent.VK_RIGHT -> player.startWalking(6);
                case KeyEvent.VK_UP -> player.jump(10);
                case KeyEvent.VK_SPACE -> player.fire();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

