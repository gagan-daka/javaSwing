package JOptionPane;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //JOptionPane = pop up a standard dialog box that prompts users for a value
                        // or informs them of something

        //JOptionPane.showMessageDialog(null,"Hello World","Reborn",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"You coding in java","Reborn",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Do you like programming?","Reborn",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"If you play 'OK' you exit from this frame","Reborn",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"ERROR 404","Reborn",JOptionPane.ERROR_MESSAGE);

        /*
        while (true){
            JOptionPane.showMessageDialog(null,"VIRUSSSS :V","Reborn",JOptionPane.WARNING_MESSAGE);
        }
        */

        //JOptionPane.showConfirmDialog(null,"Do you even code?","Coding",JOptionPane.YES_NO_CANCEL_OPTION);

        // System.out.println(JOptionPane.showConfirmDialog(null,"Do you even code?","Coding",JOptionPane.YES_NO_CANCEL_OPTION)); // 0 1 2 -1

        /*
        String answer = JOptionPane.showInputDialog("How are you?: ");
        if (answer.equalsIgnoreCase("fine")){
            //System.out.println(":D");
            JOptionPane.showMessageDialog(null,":) | ^_^","Message",JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,":(","Message",JOptionPane.PLAIN_MESSAGE);
            //System.out.println(":(");
        }
        */

        String[] responses = {"No, you're awesome!","Thank you","*blush*"};
        ImageIcon icon = new ImageIcon(ImageIO.read(new File("emoji.png")).getScaledInstance(50,50, Image.SCALE_SMOOTH));
        JOptionPane.showOptionDialog(null,"You are awesome","Mesaje Coded",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);


    }
}
