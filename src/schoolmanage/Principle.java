/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author SOHAIB ALI
 */
public class Principle {
    private String name;
    private int password;
    private String father_name;
    private String adress;
    private int age;
    private int phone_no;
    int flag=0;
    //................................................getter and setters...............
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
    public void setfather_name(String father_name){
        this.father_name=father_name;
    }
    public String getfather_name(){
        return father_name;
    }
    public void setadress(String adress){
        this.adress=adress;
    }
    public String getadress(){
        return adress;
    }
    public void setphone_no(int phone_no){
        this.phone_no=phone_no;
    }
    public int getphone_no(){
        return phone_no;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    Login login=new Login();
    Connection connection;
    Statement statement;
    //....................................................principle frame....................
   public void principleAccess(){
       Principle princ=new Principle();
       Admin ad=new Admin();
       JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL  ");
       frame.setSize(600,400);
       frame.setLocationRelativeTo(null);
       frame.setBackground(Color.ORANGE);
       frame.setVisible(true);
       JPanel panel=new JPanel();
       panel.setLayout(null);
       panel.setBackground(Color.getHSBColor(56, 389, 76));
       panel.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(290, 378, 103),10));
       frame.add(panel);
       JLabel label=new JLabel("PRINCIPLE");
       label.setBounds(210,30,200,30);
       label.setFont(new Font("Ariel",Font.TYPE1_FONT,25));
       panel.add(label);
       JButton b1=new JButton("ALL TEACHERS");
       b1.setBounds(100,100,200,30);
       b1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
       b1.setBackground(Color.getHSBColor(342, 125, 101));
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   princ.showalltr();
               } catch (SQLException ex) {
                   Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
               }
              
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
       });
       panel.add(b1);
        JButton b2=new JButton("ALL STUDENTS");
        b2.setBounds(100,150,200,30);
        b2.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b2.setBackground(Color.getHSBColor(199, 342, 207));
        b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   //show all students
                   princ.showallst();
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
               } catch (SQLException ex) {
                   Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
               }
        
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
        });
        panel.add(b2);
        JButton b3=new JButton("SEARCH TEACHER");
        b3.setBounds(100,200,200,30);
        b3.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b3.setBackground(Color.getHSBColor(386, 175, 201));
        b3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               princ.searchtr();
               frame.setVisible(false);
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
        });
        panel.add(b3);
        JButton b4=new JButton("SEARCH STUDENT");
        b4.setBounds(100,250,200,30);
        b4.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b4.setBackground(Color.getHSBColor(15591, 2289, 108));
        b4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           princ.searchstudent();
               frame.setVisible(false);
             

               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
        });
        panel.add(b4);
       JButton b=new JButton("CLOSE");
       b.setBounds(400,300,100,30);
       b.setBackground(Color.GREEN);
       b.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
       b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               frame.setVisible(false);
               
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
       });
       panel.add(b);
       JButton b5=new JButton("BACK");
       b5.setBounds(100,300,200,30);
       b5.setBackground(Color.green);
       b5.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
       b5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               frame.setVisible(false);
               login.lin();
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
       });
       panel.add(b5);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
public void searchstudent(){

    Principle princ=new Principle();
    JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(3456, 2345, 234));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(234, 453, 2345));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER NAME");
    label1.setBounds(80,30,150,20);
    panel.add(label1);
    JTextField tf1=new JTextField();
    tf1.setBounds(250,30,150,20);
    panel.add(tf1);
   JButton b2=new JButton("Clear");
   b2.setBounds(310,95,90,30);
   b2.setBackground(Color.ORANGE);
   b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tf1.setText("");
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b2);
   JButton b3=new JButton("Back");
   b3.setBounds(310,135,90,30);
   b3.setBackground(Color.orange);
   b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            princ.principleAccess();
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b3);
    JButton b1=new JButton("Search");
    b1.setBounds(310,55,90,30);
    b1.setBackground(Color.orange);
    panel.add(b1);
    String urlsr="jdbc:mysql://localhost:3306/schoolms";
    String usernamesr="root";
    String passwordsr="Sohaib125?";
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         String username=tf1.getText().toString();
         JFrame frame1=new JFrame("STUDENT RECORD");
    frame1.setSize(1000,400);
    frame1.setLocationRelativeTo(null);
    
     DefaultTableModel dtb=new DefaultTableModel();
     JTable tb=new JTable(dtb);
     tb.setPreferredScrollableViewportSize(new Dimension(600,200));
     tb.setFillsViewportHeight(true);
     frame1.add(new JScrollPane(tb));
     dtb.addColumn("Student name");
     dtb.addColumn("Father name");
     dtb.addColumn("adress");
     dtb.addColumn("phone no");
     dtb.addColumn("date of birth");
     dtb.addColumn("gender");
     dtb.addColumn("city");
     dtb.addColumn("class");
     try{
          connection=DriverManager.getConnection(urlsr,usernamesr,passwordsr);
          statement=connection.createStatement();
         String Query="select * from student_admission_form where student_name = '"+username+"'";
         ResultSet rs=statement.executeQuery(Query);
         while(rs.next()){
             String sname=rs.getString("student_name");
             String sfathern=rs.getString("father_name");
             String sadress=rs.getString("adress");
             String sphonen=rs.getString("phone_no");
             String sdob=rs.getString("date_of_birth");
             String sg=rs.getString("gender");
             String scity=rs.getString("city");
             String sclass=rs.getString("class");
             if(username.equalsIgnoreCase(sname)){
                  flag=1;
                 dtb.addRow(new Object[]{sname,sfathern,sadress,sphonen,sdob,sg,scity,sclass});
                 frame1.setVisible(true);
                 frame1.validate();
                break;
             }
         }
         if(flag==0){
             JOptionPane.showMessageDialog(null,"no record found related to this name");
         }
         connection.close();
         statement.close();
     }
     catch(SQLException throwables){
         throwables.printStackTrace();
     }

//         frame.setVisible(false);
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });
}
 public void showallst() throws ClassNotFoundException, SQLException{
     JFrame frame=new JFrame("ALL STUDENTS");
     frame.setSize(1000,400);
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
     String urlsa="jdbc:mysql://localhost:3306/schoolms";
    String usernamesa="root";
    String passwordsa="Sohaib125?";
     DefaultTableModel dtb=new DefaultTableModel();
    JTable tb=new JTable(dtb);
    frame.add(new JScrollPane(tb));
    dtb.addColumn("Student name");
    dtb.addColumn("father name");
    dtb.addColumn("adress");
    dtb.addColumn("phone no");
    dtb.addColumn("date of birth");
    dtb.addColumn("gender");
    dtb.addColumn("city");
    dtb.addColumn("class");
   try{
       connection=DriverManager.getConnection(urlsa,usernamesa,passwordsa);
       statement=connection.createStatement();
       String Query="select * from student_admission_form";
       ResultSet rs=statement.executeQuery(Query);
       while(rs.next())
       {
           String sname=rs.getString("student_name");
             String sfathern=rs.getString("father_name");
             String sadress=rs.getString("adress");
             String sphonen=rs.getString("phone_no");
             String sdob=rs.getString("date_of_birth");
             String sg=rs.getString("gender");
             String scity=rs.getString("city");
             String sclass=rs.getString("class");
              dtb.addRow(new Object[]{sname,sfathern,sadress,sphonen,sdob,sg,scity,sclass});
       }
       
   }
   catch(SQLException ex){
       JOptionPane.showMessageDialog(null,ex.toString());
       JOptionPane.showMessageDialog(null,"error occured");
   }
   finally{
       connection.close();
       statement.close();
   }
    
 }
public void searchtr(){
    
    Principle princ=new Principle();
    JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(3456, 2345, 234));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(234, 453, 2345));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER NAME");
    label1.setBounds(80,30,150,20);
    panel.add(label1);
    JTextField tf1=new JTextField();
    tf1.setBounds(250,30,150,20);
    panel.add(tf1);
   JButton b2=new JButton("Clear");
   b2.setBounds(310,95,90,30);
   b2.setBackground(Color.ORANGE);
   b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tf1.setText("");
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b2);
   JButton b3=new JButton("Back");
   b3.setBounds(310,135,90,30);
   b3.setBackground(Color.orange);
   b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            princ.principleAccess();
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b3);
    JButton b1=new JButton("Search");
    b1.setBounds(310,55,90,30);
    b1.setBackground(Color.orange);
    panel.add(b1);
    String urlsr="jdbc:mysql://localhost:3306/schoolms";
    String usernamesr="root";
    String passwordsr="Sohaib125?";
    b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         String username=tf1.getText().toString();
         JFrame frame1=new JFrame("TEACHER RECORD");
    frame1.setSize(1000,400);
    frame1.setLocationRelativeTo(null);
    
     DefaultTableModel dtb=new DefaultTableModel();
     JTable tb=new JTable(dtb);
     tb.setPreferredScrollableViewportSize(new Dimension(600,200));
     tb.setFillsViewportHeight(true);
     frame1.add(new JScrollPane(tb));
     dtb.addColumn("Teacher name");
     dtb.addColumn("Father name");
     dtb.addColumn("adress");
     dtb.addColumn("phone no");
     dtb.addColumn("date of birth");
     dtb.addColumn("gender");
     dtb.addColumn("city");
     dtb.addColumn("specification");
     try{
          connection=DriverManager.getConnection(urlsr,usernamesr,passwordsr);
          statement=connection.createStatement();
         String Query="select * from add_teacher where teacher_name = '"+username+"'";
         ResultSet rs=statement.executeQuery(Query);
         while(rs.next()){
             String sname=rs.getString("teacher_name");
             String sfathern=rs.getString("father_name");
             String sadress=rs.getString("adress");
             String sphonen=rs.getString("phone_no");
             String sdob=rs.getString("date_of_birth");
             String sg=rs.getString("gender");
             String scity=rs.getString("city");
             String sclass=rs.getString("specification");
             if(username.equalsIgnoreCase(sname)){
                  flag=1;
                 dtb.addRow(new Object[]{sname,sfathern,sadress,sphonen,sdob,sg,scity,sclass});
                 frame1.setVisible(true);
                 frame1.validate();
                break;
             }
         }
         if(flag==0){
             JOptionPane.showMessageDialog(null,"no record found related to this name");
         }
     }
     catch(SQLException throwables){
         throwables.printStackTrace();
     }
   finally{
             try {
                 connection.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 statement.close();
             } catch (SQLException ex) {
                 Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
             }
     }
//         frame.setVisible(false);
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    });
}
public void showalltr() throws SQLException{
     JFrame frame=new JFrame("ALL TEACHERS");
     frame.setSize(1000,400);
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
     String urlsa="jdbc:mysql://localhost:3306/schoolms";
    String usernamesa="root";
    String passwordsa="Sohaib125?";
     DefaultTableModel dtb=new DefaultTableModel();
    JTable tb=new JTable(dtb);
    frame.add(new JScrollPane(tb));
    dtb.addColumn("Teacher name");
    dtb.addColumn("father name");
    dtb.addColumn("adress");
    dtb.addColumn("phone no");
    dtb.addColumn("date of birth");
    dtb.addColumn("gender");
    dtb.addColumn("city");
    dtb.addColumn("specification");
   try{
       connection=DriverManager.getConnection(urlsa,usernamesa,passwordsa);
       statement=connection.createStatement();
       String Query="select * from add_teacher";
       ResultSet rs=statement.executeQuery(Query);
       while(rs.next())
       {
           String sname=rs.getString("teacher_name");
             String sfathern=rs.getString("father_name");
             String sadress=rs.getString("adress");
             String sphonen=rs.getString("phone_no");
             String sdob=rs.getString("date_of_birth");
             String sg=rs.getString("gender");
             String scity=rs.getString("city");
             String sclass=rs.getString("specification");
              dtb.addRow(new Object[]{sname,sfathern,sadress,sphonen,sdob,sg,scity,sclass});
       }
       
   }
   catch(SQLException ex){
       JOptionPane.showMessageDialog(null,ex.toString());
       JOptionPane.showMessageDialog(null,"error occured");
   }
   finally{
       connection.close();
       statement.close();
   }
    
}
}
   