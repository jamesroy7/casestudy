
package pkgcase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;
public class HomePage extends JFrame implements ActionListener{
    JButton CButton,FButton,SButton;
    HomePage(){


     SButton = new JButton("STUDENT");
     SButton.setFocusable(false);
     SButton.addActionListener(this);
     FButton = new JButton("FACULTY");
     FButton.setFocusable(false);
     FButton.addActionListener(this);
     CButton = new JButton("CUSTOMER");
     CButton.setFocusable(false);
     CButton.addActionListener(this);

     this.setLayout(new FlowLayout());
     this.add(SButton);
     this.add(FButton);
     this.add(CButton);
     this.setTitle("TSU CURRENCY CONVERTER SYSTEM");
     this.setSize(500,500);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setVisible(true);
     this.setResizable(false);
     this.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==SButton){
       String name= JOptionPane.showInputDialog("FULL NAME:");
       String age = JOptionPane.showInputDialog("AGE:");
       String id =JOptionPane.showInputDialog("STUDENT ID:");







       new Student();
       this.setVisible(false);
       }
       else if(e.getSource()==FButton){
       new Faculty();
       this.setVisible(false);
       }
       else{
           new Customer();
            this.setVisible(false);


    }

    }


}