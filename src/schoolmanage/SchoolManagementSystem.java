/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package schoolmanage;

/**
 *
 * @author SOHAIB ALI
 */
import java.sql.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SchoolManagementSystem{
    
    private String cun;
    private String cp;
    public void setcun(String cun){
        cun=this.cun;
    }
    public String getcun(){
    return cun;
    }
    public void setcp(String cp){
        cp=this.cp;
    }
    public String getcp(){
        return cp;
    }
    public void background(){
        JFrame frame=new JFrame("SCHOOL  MANAGEMENT  SYSTEM ");
        frame.setSize(1366,768);
        frame.setBackground(Color.getHSBColor(138, 432, 103));
        frame.setVisible(true);
        JPanel panel=new JPanel();
//        panel.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(543, 234,345),40));
        panel.setBackground(Color.getHSBColor(374,3456,523));
        frame.add(panel);
        panel.setLayout(null);
        JButton b=new JButton("CLOSE");
        b.setBounds(560,335,256,68);
        b.setBackground(Color.getHSBColor(67, 425, 100));
        b.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(45, 34, 123), 2));
        b.setFont(new Font("Ariel",Font.TYPE1_FONT,40));
        b.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(90, 243, 154), 5));
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(b);
    }
    
//public void main(){
//    
//    SchoolManagementSystem id=new SchoolManagementSystem();
//    id.background();
//    JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL ");
//    frame.setSize(600,400);
//    frame.setVisible(true);
//    frame.setLocationRelativeTo(null);
//    JPanel panel=new JPanel();
//    frame.add(panel);
//    panel.setLayout(null);
//    panel.setBackground(Color.orange);
//    panel.setBorder(BorderFactory.createLineBorder(Color.yellow,10));
//    JLabel label=new JLabel("SIGN UP");
//    label.setFont(new Font("Ariel",Font.TYPE1_FONT,35));
//    label.setBounds(200,50,200,40);
//    panel.add(label);
//    JLabel label1=new JLabel("create username");
//    label1.setBounds(150,130,130,20);
//    panel.add(label1);
//    JTextField tf1=new JTextField();
//    tf1.setBounds(310,130,170,20);
//    panel.add(tf1);
//    JLabel label2=new JLabel("create password");
//    label2.setBounds(150,180,130,20);
//    panel.add(label2);
//    JTextField tf2=new JTextField();
//    tf2.setBounds(310,180,170,20);
//    panel.add(tf2);
//    JButton b1=new JButton("Signup");
//    b1.setBounds(380,230,100,30);
//    b1.setBackground(Color.green);
//    panel.add(b1);
//                    Login login=new Login();
//                    String u1=tf1.getText();
//                    String p1=tf2.getText();
//    b1.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
////            if(tf1.getText().equals("Sohaib ali")&& tf2.getText().equals("0122"))
////            {
////             login.lin();
////            frame.setVisible(false);
////            }tf1.getText()
//                    
////          id.setcun(u1);
////           id.setcp(p1);
//            id.setcun(tf1.getText());
//            id.setcp(tf2.getText());
////           try{
////               String url="jdbc:mysql://localhost:3306/schoolms";
////               String username="root";
////               String password="Sohaib125?";
////               Connection  connection=DriverManager.getConnection(url,username,password);
////               Statement statement=connection.createStatement();
////               String Query="INSERT INTO signup(user_name,password) VALUES ('"+tf1.getText()+"','"+tf2.getText()+"')";
////               statement.execute(Query);
////                frame.setVisible(false);
////             login.lin();
////           }
////           catch(SQLException ex){
////               JOptionPane.showMessageDialog(null, ex.toString());
////               JOptionPane.showMessageDialog(null, "error occured");
////               
////           }
//          
////if(tf1.getText().equals("Sohaib ali") && tf2.getText().equals("0122")){
//                          frame.setVisible(false);
//                          login.lin();
////                      }
////                      else{
////                          JOptionPane.showMessageDialog(null,"username or password are incorrect");
////                      }
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        }
//    });
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    
//
//}

   
}