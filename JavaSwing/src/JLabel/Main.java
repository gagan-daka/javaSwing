package JLabel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //JLabel = GUI display area for a string of text , ans image or both


        ImageIcon image = new ImageIcon(ImageIO.read(new File("insta.png")).getScaledInstance(250,250, Image.SCALE_SMOOTH));
        Border border = BorderFactory.createLineBorder(new Color(123,50,250),3);

        JLabel label = new JLabel();
        label.setText("Instagram");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(123,50,250)); // set font color
        label.setFont(new Font("MV Boli",Font.BOLD,20));// set font style
        label.setIconTextGap(-20); // set gap of text to image
        label.setBackground(Color.BLACK);// set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); //set border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(50,0,250,250); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        //frame.setLayout(null); // doesn't display anithing in my frame (trick: null after size!)
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // The pack method sizes the frame so that all its contents are at or above their preferred sizes.
        //frame.add(label); // doesn't work because first go components
    }
}
