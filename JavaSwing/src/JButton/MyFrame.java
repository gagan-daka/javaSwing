package JButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyFrame  extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() throws IOException {

        ImageIcon image = new ImageIcon(ImageIO.read(new File("insta.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));

        label = new JLabel();
        label.setIcon(image);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(5,5,150,100);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("Hola")); // same (button.addActionListener(this);)


        //set image in buttons
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-5);
        button.setForeground(new Color(66,0,255));
        //button.setBackground(Color.WHITE);
        //button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);


        //set Text in buttons
        button.setText("Instagram");
        button.setFont(new Font("MV Boli",Font.BOLD,15));
        button.setFocusable(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            //System.out.println("Instagram");
            label.setVisible(true);
        }
    }
}
