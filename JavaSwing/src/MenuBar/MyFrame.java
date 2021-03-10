package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        //defines menuItems
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F  for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // s for exit

        // add items in fileMenu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        this.setJMenuBar(menuBar);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    /*******- https://www.youtube.com/watch?v=Kmgo00avvEw&ab_channel=BroCode -______3:03:32_______*****/

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem){
            System.out.println("Loading...");
        }
        if (e.getSource() == saveItem){
            System.out.println("Saving...");
        }
        if (e.getSource() == exitItem){
            System.exit(0);
        }
    }
}
