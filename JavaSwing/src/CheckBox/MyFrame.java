package CheckBox;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon, checkIcon;

    MyFrame() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon(ImageIO.read(new File("not-good.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));
        checkIcon = new ImageIcon(ImageIO.read(new File("good.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFont(new Font("Consolas", Font.PLAIN,15));
        checkBox.setFocusable(false); // focus - > false
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}
