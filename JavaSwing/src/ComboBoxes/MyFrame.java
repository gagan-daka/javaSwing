package ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog","Cat","Bird","Horse","Dragon"};
        Integer [] numbers = {1,2,3}; //here int [] numbers NO! , Integer [] numbers YES!

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Fox");
        //comboBox.insertItemAt("Bear",2);
        //comboBox.setSelectedIndex(4);
        //comboBox.removeItem("Bird");
        //comboBox.removeItemAt(0); // remove the item who are in the specify index
        //comboBox.removeAllItems(); // remove all items :V

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex()); // index of the item selected
        }
    }
}
