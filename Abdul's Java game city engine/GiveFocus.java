package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GiveFocus implements MouseListener {


    private MyView myView;

    public GiveFocus(MyView v){
        this.myView = v;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        myView.requestFocus();
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}