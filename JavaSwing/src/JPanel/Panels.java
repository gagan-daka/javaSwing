package JPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyListener;
import java.io.File;
import java.io.IOException;

public class Panels {
    public static void main(String[] args) throws IOException {
        // JPanel = GUI component that functions as a container to hold other components
        JFrame frame = new JFrame();

        ImageIcon image = new ImageIcon(ImageIO.read(new File("insta.png")).getScaledInstance(150,150, Image.SCALE_SMOOTH));

        JLabel label = new JLabel();
        label.setText("Instagram");
        label.setIcon(image);
            /* when you use BorderLayout, you can use setVerticalAlignment & setHorizontalAlignment, but when you use
            * null layout in any panel (panel.setLayout(null)) it's recommend use bounds in label (label.setBounds) */
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        //label.setHorizontalAlignment(JLabel.LEFT);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,150,150);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        //redPanel.setLayout(new BorderLayout()); // going to pace any content to the center vertically
        //redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        //bluePanel.setLayout(new BorderLayout()); // going to pace any content to the center vertically
        //bluePanel.add(label);


        JPanel greePanel = new JPanel();
        greePanel.setBackground(Color.GREEN);
        greePanel.setBounds(0,250,500,250);
        //greePanel.setLayout(new BorderLayout()); // going to pace any content to the center vertically
        greePanel.setLayout(null);
        greePanel.add(label);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greePanel);
        frame.setSize(750,750);

    }
}
