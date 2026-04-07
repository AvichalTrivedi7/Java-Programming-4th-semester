// A simpler demo code, using swing
// We will work on adding more things along (like buttons, labels, etc)

import javax.swing.*;

public class Program_33 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing Window");

        // Now we will add button here below
        JButton button = new JButton("Click me!");
        frame.add(button);

        // Now we will add label here below
        JLabel label = new JLabel("Hello I am a label");
        label.setBounds(50,30,100,30); 
        button.setBounds(50,80,100,30); 
        frame.add(label);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
