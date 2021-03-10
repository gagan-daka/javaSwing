package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,25,25);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // ivoked when a key is a typed
        if (e.getKeyChar() == 'a') {
            label.setLocation(label.getX() - 1, label.getY());
        }else if (e.getKeyChar() == 'w'){
            label.setLocation(label.getX(), label.getY()-1);
        }else if (e.getKeyChar() == 's'){
            label.setLocation(label.getX(), label.getY()+1);
        }else if (e.getKeyChar() == 'd'){
            label.setLocation(label.getX()+1, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // invoked when a physical key is pressed down

        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX()-10, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY()-10);
            case 39 -> label.setLocation(label.getX()+10, label.getY());
            case 40 -> label.setLocation(label.getX(), label.getY()+10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // called whenever a button is released
        //System.out.println("Key Char released: "+e.getKeyChar());
        System.out.println("Key Char released: "+e.getKeyCode());
    }
}
