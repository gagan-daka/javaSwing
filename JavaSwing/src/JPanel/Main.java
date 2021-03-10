package JPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //JLabel label1 = new JLabel();


        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        Border border2 = BorderFactory.createLineBorder(Color.RED,3);

        /*
        JLabel label = new JLabel();
        label.setText("Colors ");
        label.setBackground(Color.BLACK);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("MV Boli",Font.BOLD,15));

         */

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setBounds(50,50,50,50);
        panel.setBorder(border2);


        JPanel color1 = new JPanel();
        color1.setBackground(new Color(131,35,189));
        color1.setBounds(0,0,150,150);
        color1.setBorder(border);

        JPanel color2 = new JPanel();
        color2.setBackground(Color.YELLOW);
        color2.setBounds(150,0,150,90);
        color2.setBorder(border);

        JPanel color3 = new JPanel();
        color3.setBackground(new Color(0,255,185));
        color3.setBounds(150,90,420,60);
        color3.setBorder(border2);

        JPanel color4 = new JPanel();
        color4.setBackground(new Color(155,0,250));
        color4.setBounds(300,0,45,45);
        color4.setBorder(border);

        JPanel color5 = new JPanel();
        color5.setBackground(Color.RED);
        color5.setBounds(345,0,45,45);
        color5.setBorder(border);

        JPanel color6 = new JPanel();
        color6.setBackground(new Color(155,0,250));
        color6.setBounds(390,0,45,45);
        color6.setBorder(border);

        JPanel color7 = new JPanel();
        color7.setBackground(Color.RED);
        color7.setBounds(435,0,45,45);
        color7.setBorder(border);

        JPanel color8 = new JPanel();
        color8.setBackground(new Color(155,0,250));
        color8.setBounds(480,0,45,45);
        color8.setBorder(border);

        JPanel color9 = new JPanel();
        color9.setBackground(Color.RED);
        color9.setBounds(525,0,45,45);
        color9.setBorder(border);

        JPanel color10 = new JPanel();
        color10.setBackground(Color.BLACK);
        color10.setBounds(300,45,270,45);
        color10.setBorder(border);

        JPanel color11 = new JPanel();
        color11.setBackground(new Color(66,0,255));
        color11.setBounds(570,0,60,150);
        color11.setBorder(border);

        JPanel color12 = new JPanel();
        color12.setBackground(new Color(131,35,189));
        color12.setBounds(630,0,120,350);
        color12.setBorder(border);

        JPanel color13 = new JPanel();
        color13.setBackground(new Color(255,0,255));
        color13.setBounds(0,150,630,200);
        color13.setBorder(border);

        JPanel color14 = new JPanel();
        color14.setBackground(Color.RED);
        color14.setBounds(750,0,90,90);
        color14.setBorder(border);

        JPanel color15 = new JPanel();
        color15.setBackground(Color.PINK);
        color15.setBounds(750,90,90,150);
        color15.setBorder(border);

        JPanel color16 = new JPanel();
        color16.setBackground(Color.RED);
        color16.setBounds(750,180,90,170);
        color16.setBorder(border);

        JPanel color17 = new JPanel();
        color17.setBackground(Color.GREEN);
        color17.setBounds(840,0,120,350);
        color17.setBorder(border2);


        frame.setTitle("PanelColors");
        frame.add(panel);
        frame.add(color1);
        frame.add(color2);
        frame.add(color3);
        frame.add(color4);
        frame.add(color5);
        frame.add(color6);
        frame.add(color7);
        frame.add(color8);
        frame.add(color9);
        frame.add(color10);
        frame.add(color11);
        frame.add(color12);
        frame.add(color13);
        frame.add(color14);
        frame.add(color15);
        frame.add(color16);
        frame.add(color17);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(976,389);
        frame.setVisible(true);
    }
}
