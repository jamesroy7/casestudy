
package javaapplication7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Student extends JFrame implements ActionListener{
  JComboBox combo;
  JTextField text1,dolAns;
  JLabel label1,label2;
  JButton convertButton;
   String[] currency = {"USD","EURO","POUND","YEN"};
     double[] exchangeRates={55.37,60.83,69.20,.40};
 public static double toDouble(String str){
 double val =0;
 val=Double.parseDouble(str);
 return val;
 }
 
 public static String toString(double val){
 String str;
 str=Double.toString(val);
 return str;
 }
  
  
  
  
  Student(){
         
        convertButton = new JButton("CONVERT");
        convertButton.addActionListener(this);
       
        label1 = new JLabel();
        label1.setText("ENTER THE CURRENCY YOU WANT TO CONVERT");
        label2 = new JLabel();
        label2.setText("ENTER AMMOUNT");
        dolAns = new JTextField();
        dolAns.setPreferredSize(new Dimension(250,40));
        
        text1= new JTextField();
        text1.setPreferredSize(new Dimension(250,40));
        String[] currency = {"USD","EURO","POUND","YEN"}; 
        double[] exchangeRates={55.37,60.83,69.20,.40};
        combo = new JComboBox(currency);
        combo.addActionListener(this);
        
        this.setLayout(new FlowLayout());
        this.add(label1);
        this.add(combo);
        this.add(label2);
        this.add(text1);
        this.add(convertButton);
        this.add(dolAns);
        this.setSize(500,500);
        this.setTitle("STUDENT");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String selectedOption = (String) combo.getSelectedItem();
       if (selectedOption.equals("USD")){
        double convertedDol = toDouble(text1.getText())*exchangeRates[0];
        dolAns.setText(toString(convertedDol));
       }
    }
    
}
