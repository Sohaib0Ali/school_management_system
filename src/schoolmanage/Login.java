/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanage;

/**
 *
 * @author SOHAIB ALI
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//
public class Login {
//    private String name;
//    private String password;
////    ...................................getter and setters ...........................
//    public void setname(String name){
//        name=this.name;
//    }
//    public String getname(){
//        return name;
//    }
//    public void setpassword(String password){
//        password=this.password;
//    }
//    public String getpassword()
//    {
//        return password;
//    }
//    ...........................................login frame...................................
    public void lin(){
        Student student1=new Student();
        Principle princ=new Principle();
        Login log=new Login();
        SchoolManagementSystem manage=new SchoolManagementSystem();
        Admin ad=new Admin();
        Teacher teach=new Teacher();
        JFrame frame=new JFrame(" QIRAT  PUBLIC  SCHOOL");
        frame.setBackground(Color.yellow);
        frame.setSize(900,700);
        frame.setLocationRelativeTo(null);
        JPanel panel=new JPanel();
         panel.setLayout(null);
        panel.setBackground(Color.getHSBColor(443, 1345, 1574));
        panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
        frame.add(panel);
        
//        panel.setPreferredSize(new Dimension(500, 400));
        JLabel label=new JLabel("LOG IN");
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,30));
        label.setBounds(190,40,200,50);
        label.setForeground(Color.green);
        panel.add(label);
        JLabel label1=new JLabel("USERNAME");
        label1.setBounds(120,118, 100, 30);
        label1.setForeground(Color.RED);
        panel.add(label1);
//       panel.setLocation(2,2);
        JTextField tf1=new JTextField();
//        tf1.setColumns(18);
        tf1.setBounds(220,123,170,20);
        panel.add(tf1);
        JLabel label2=new JLabel("PASSWORD");
        label2.setBounds(120,175,100,30);
        label2.setForeground(Color.RED);
        panel.add(label2);
        JPasswordField tf2=new JPasswordField();
//        tf2.setColumns(18);
        tf2.setBounds(220, 180,170, 20);
        panel.add(tf2);
        JButton b1=new JButton("Login");
        b1.setBounds(285,250,100,30);
        b1.setBackground(Color.getHSBColor(614, 156,1345));
        b1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ad.add();
                      if(tf1.getText().equals("Admin")&&tf2.getText().equals("0122"))
                      {
                      frame.setVisible(false);
                      ad.add();}
                     else if(tf1.getText().equals("Principle") && tf2.getText().equals("0122"))
                      {
                          frame.setVisible(false);
                          princ.principleAccess();
                      }
                     else if(tf1.getText().equals("Teacher")&&tf2.getText().equals("0122")){
                         frame.setVisible(false);
                         teach.work();
                     }
                     else if(tf1.getText().equals("Student")&&tf2.getText().equals("0122")){
                         frame.setVisible(false);
                         student1.studentaccess();
                     }
                       else{
                          JOptionPane.showMessageDialog(null,"username or password are incorect. please run system again");
                      }
//                      Information inf=new Information();
//                      inf.account();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        JButton b2=new JButton("Close");
        b2.setBounds(285,300,100,30);
        b2.setBackground(Color.getHSBColor(2345, 1334, 1259));
        b2.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        JLabel lb3=new JLabel();
        ImageIcon img=new ImageIcon("G:\\second semester\\oop\\project\\icon.jpg");
        lb3.setBounds(05,0,880,680);
        lb3.setIcon(img);
        panel.add(lb3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
    }
}
