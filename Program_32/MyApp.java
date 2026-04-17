package Program_32;
// Using and learning about abstract window toolkit, swings. Objects (JDK) --> AWT-Components --> (Swings) JComponent - JButton, JTextfield, JLabel --> Container

import javax.swing.*;
/* import java.awt.*; */

public class MyApp extends JFrame{
    public MyApp(){
        setTitle("My First Swing App");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Hello Swing!");
        panel.add(lbl);
        add(panel);
        setVisible(true);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(MyApp::new);
    }
}
