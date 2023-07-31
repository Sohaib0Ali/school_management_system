/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author SOHAIB ALI
 */

public class Accountant {
   private String name;
   private int password;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setpassword(int password){
        this.password=password;
    }
    public int getpassword(){
        return password;
    }
    public void login(){
        System.out.println("LOGIN");
}
    public void check(){
        System.out.println("check the fee status of any student");
        System.out.println("check the payment status of any teacher");
    }
    public void condition(){
        System.out.println("check the financial condition of school ");
    }
    public void generate(){
        System.out.println("generate fee slip of student ");
        System.out.println("teacher salary slip ");
    }
        public void splash(){
         JFrame frame=new JFrame();
         frame.getContentPane().setLayout(null);
            frame.setUndecorated(true);
           frame.setSize(600,400);
           frame.setLocationRelativeTo(null);
           frame.getContentPane().setBackground(Color.getHSBColor(98, 103, 511));
        frame.setVisible(true);
        JLabel label2=new JLabel("QIRAT");
        label2.setBounds(120,70,150,50);
        label2.setFont(new Font("Ariel",Font.BOLD,40));
        label2.setForeground(Color.PINK);
        frame.add(label2);
        JLabel label3=new JLabel("PUBLIC");
        label3.setBounds(200,120,150,50);
        label3.setFont(new Font("Ariel",Font.HANGING_BASELINE,40));
        label3.setForeground(Color.cyan);
        frame.add(label3);
         JLabel label4=new JLabel("SCHOOL");
        label4.setBounds(320,170,180,50);
        label4.setFont(new Font("Ariel",Font.TYPE1_FONT,40));
        label4.setForeground(Color.green);
        frame.add(label4);
           JProgressBar prbr=new JProgressBar();
            prbr.setBounds(100,300,400,20);
           prbr.setForeground(Color.getHSBColor(108, 390, 1800));
          prbr.setBackground(Color.LIGHT_GRAY);
          prbr.setBorderPainted(true);
          prbr.setStringPainted(true);
          prbr.setValue(0);
          frame.add(prbr);
          JLabel label1=new JLabel();
          label1.setBounds(250,340,200,30);
          label1.setForeground(Color.white);
          label1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
          frame.add(label1);
          int i=0;
          while(i<=100)
          {
              try{
                  Thread.sleep(80);
                  prbr.setValue(i);
                  label1.setText("LOADING"+Integer.toString(i)+"%");
                  i++;
                  if(i==100)
                  {
                      frame.dispose();
                        Login log=new Login();
                         log.lin();
       
                  }
              }
              catch(Exception e){
                  e.printStackTrace();
              }
          }
           
    }
}
