package RadioButtons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton,hamburgerButton, hotdogButton;
    ImageIcon pizza, hamburger, hotdog;

    MyFrame() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new ImageIcon(ImageIO.read(new File("pizza.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));
        hamburger = new ImageIcon(ImageIO.read(new File("hamburger.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));
        hotdog = new ImageIcon(ImageIO.read(new File("hotdog.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        // only select 1 item
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        // add acrionlistener to bottons!!!!
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizza);
        hamburgerButton.setIcon(hamburger);
        hotdogButton.setIcon(hotdog);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton){
            System.out.println("You ordered pizza!");
        }else if (e.getSource() == hamburgerButton){
            System.out.println("You ordered Hamburger!");
        }else if (e.getSource() == hotdogButton){
            System.out.println("You ordered Hot-Dog!");
        }
    }
}
