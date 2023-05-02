
package pkgcase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Student extends JFrame implements ActionListener{
  JComboBox combo;
  JTextField text1,convertedCur;
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
        
        convertedCur = new JTextField();
        convertedCur.setPreferredSize(new Dimension(250,40));

        text1= new JTextField(10);
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
        this.add(convertedCur);
        this.setSize(500,500);
        this.setTitle("STUDENT");
        this.setVisible(true);
        //this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String selectedOption = (String) combo.getSelectedItem();
      if(text1.getText().isEmpty()){
  
        JOptionPane.showMessageDialog(null,"ENTER AMMOUNT!!!!!" );
}
         else if (selectedOption.equals("USD")){
        double convertedDol = toDouble(text1.getText())*exchangeRates[0];
        convertedCur.setText(toString(convertedDol));
        JOptionPane.showMessageDialog(null,"CONVERTED SUCCESSFULY");
       }else if (selectedOption.equals("EURO")){
        double convertedEuro = toDouble(text1.getText())*exchangeRates[1];
        convertedCur.setText(toString(convertedEuro));
        JOptionPane.showMessageDialog(null,"CONVERTED SUCCESSFULY");
       
       }else if (selectedOption.equals("POUND")){
           double convertedPound = toDouble(text1.getText())*exchangeRates[2];
        convertedCur.setText(toString(convertedPound));
        JOptionPane.showMessageDialog(null,"CONVERTED SUCCESSFULY");
       
       }
       else if(selectedOption.equals("YEN")){
       double convertedYen = toDouble(text1.getText())*exchangeRates[3];
        convertedCur.setText(toString(convertedYen));
        JOptionPane.showMessageDialog(null,"CONVERTED SUCCESSFULY");
       }
    int ch= JOptionPane.showConfirmDialog(null,"DO YOU WANT TO USE AGAIN?", "TITLE", JOptionPane.YES_NO_OPTION);
      if (ch==0){
      new HomePage();
      this.dispose();
      }else if (ch==1){
      JOptionPane.showMessageDialog(null,"THANK YOU FOR USING TARLAC STATE UNIVERSITY CURRENCY CONVERTER SYSTEM");
      }
    } 

}
