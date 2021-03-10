package DrawAndDrop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;

public class DragPanel extends JPanel {

    ImageIcon smile = new ImageIcon(ImageIO.read(new File("smile.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));

    final int WIDTH = smile.getIconWidth();
    final int HEIGHT = smile.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel() throws IOException {

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener(); // instance ok class ClickListener
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        smile.paintIcon(this,g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent e){

            prevPt = e.getPoint();
        }

    }


    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())
            );

            prevPt = currentPt;
            repaint();

        }

    }

}
