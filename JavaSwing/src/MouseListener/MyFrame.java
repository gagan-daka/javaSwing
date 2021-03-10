package MouseListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile, nervous, pain, dizzy;


    MyFrame() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon(ImageIO.read(new File("smile.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));
        nervous = new ImageIcon(ImageIO.read(new File("nervous.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));
        pain = new ImageIcon(ImageIO.read(new File("pain.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));
        dizzy = new ImageIcon(ImageIO.read(new File("dizzy.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));


        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when the mouse button has been clicked on a component
        //System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when a mouse button has been pressed on a component
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //invoked when a mouse button has been released on a component
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when the mouse enters a component area
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // incoked when the mouse exits a component area
        label.setIcon(smile);
    }
}
