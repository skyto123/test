import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class add extends JFrame {
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   String []strr = null;
   public add() {
      getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("이름");
      lblNewLabel.setBounds(12, 54, 62, 28);
      getContentPane().add(lblNewLabel);
      
      JLabel label = new JLabel("가격");
      label.setBounds(12, 115, 57, 15);
      getContentPane().add(label);
      
      JLabel lblNewLabel_1 = new JLabel("무게");
      lblNewLabel_1.setBounds(12, 227, 57, 15);
      getContentPane().add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel("위치");
      lblNewLabel_2.setBounds(12, 171, 57, 15);
      getContentPane().add(lblNewLabel_2);
      
      textField = new JTextField();
      textField.setBounds(71, 58, 116, 21);
      getContentPane().add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBounds(71, 112, 116, 21);
      getContentPane().add(textField_1);
      textField_1.setColumns(10);
      
      textField_2 = new JTextField();
      textField_2.setBounds(71, 168, 116, 21);
      getContentPane().add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setBounds(71, 224, 116, 21);
      getContentPane().add(textField_3);
      textField_3.setColumns(10);
      
      JButton btnNewButton = new JButton("\uB4F1\uB85D");
      btnNewButton.setBounds(130, 289, 97, 23);
      getContentPane().add(btnNewButton);
      
      
      btnNewButton.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
             if(e.getSource() == btnNewButton){
            	 strr[0] = textField.getText();
                 strr[1] = textField_1.getText();
                 strr[2] = textField_2.getText();
                 strr[3] = textField_3.getText(); 	 
                 
             }
             
          }
       });
   }
   
}