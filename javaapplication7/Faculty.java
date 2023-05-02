
package javaapplication7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Faculty extends JFrame implements ActionListener{
JComboBox combo;
JTextField field;
    Faculty(){
    
        this.setSize(500,500);
        this.setTitle("FACULTY");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
