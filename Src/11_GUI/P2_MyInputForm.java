
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu11;

/**
 *
 * @author w33.haa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class P2_MyInputForm extends JFrame{
    private static final int FRAME_WIDTH=600;
    private static final int FRAME_HEIGHT=200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton bbutton;
    private JPanel panel;
    
    public P2_MyInputForm(){
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH,FRAME_WIDTH);
    }

    private void createTextField() {
        aLabel=new JLabel("Nilai A: ");
        bLabel=new JLabel("Nilai B: ");
        dLabel=new JLabel("Jumlah");
        cLabel=new JLabel("Nilai C: ");
        
        
        final int FIELD_WIDTH=10;
        aField =new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField =new JTextField(FIELD_WIDTH);
        bField.setText("0");
        
    }

   private void createButton() {
       button=new JButton("Calculate");
     class AddInterestListener implements ActionListener{

            @Override
           
          
         public void actionPerformed(ActionEvent event){
               int a=Integer.valueOf(aField.getText());
               int b=Integer.valueOf(bField.getText());
               int c=a*b;
               cLabel.setText("Hasil :" +c);
               
           }
         
       }
       ActionListener listener =new AddInterestListener();
       button.addActionListener(listener);
       
      bbutton=new JButton("tambah");
     class AddInterestListener2 implements ActionListener{

            @Override
           
          
         public void actionPerformed(ActionEvent event){
               int a=Integer.valueOf(aField.getText());
               int b=Integer.valueOf(bField.getText());
               int c=a+b;
               dLabel.setText("Hasil :" +c);
               
           }
   
    }
       
      
       ActionListener listener2 =new AddInterestListener2();
       bbutton.addActionListener(listener2);
   }

    private void createPanel() {
        panel=new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(bbutton);
        panel.add(button);
        panel.add(cLabel);
        panel.add(dLabel);
        
        add(panel);
        
    }
        public static void main(String[] args){
        JFrame frame = new P2_MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }  
    
}
