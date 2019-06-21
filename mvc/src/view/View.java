package view;

import javax.swing.*;

public class View extends JFrame {
    public JTextField textField1;
    public JPanel panel1;
    public JTextField textField2;
    public JButton multiplicarButton;
    public JTextField xTextField;

    public View() {
        // TODO: place custom component creation code here

       // super("MCV");
        setContentPane(panel1);
        setSize(400,100);

    }
}
