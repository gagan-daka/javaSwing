package DrawAndDrop;

import javax.swing.*;
import java.io.IOException;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();


    //constructor
    MyFrame() throws IOException {

        this.add(dragPanel);
        this.setTitle("Drag & Drop Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
