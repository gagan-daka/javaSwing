package TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,25)); //text font
        textField.setForeground(Color.BLACK); // textcolor
        textField.setBackground(Color.GREEN);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");

        this.add(button);
        this.add(textField);
        this.pack(); // resize frame
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"When you click in 'Submit' you cannot rectify!","IMPORTANT WARNING",JOptionPane.WARNING_MESSAGE);
        if (e.getSource() == button ){
            System.out.println("Welcome "+textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);

        }
    }
}
