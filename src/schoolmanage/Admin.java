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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//...........................................start....................................
public class Admin {
    private String name;
    private String father_name;
 private String adress;
    private int age;
    private int password;
//    ......................................getter and setters..........................
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    int flag=0;
    Login login=new Login();
    Student std=new Student();
    Connection connection;
   Statement statement;
   //.................................................admin frame........................
    public void add(){
        Teacher teach=new Teacher();
        Principle princ=new Principle();
        Admin ad=new Admin();
        Student std=new Student();
        Teacher t=new Teacher();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(600,500);
        frame.setBackground(Color.cyan);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        frame.setLayout(null);
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createSoftBevelBorder(30));
        panel.setBackground(Color.getHSBColor(110, 37,69));
        panel.setBorder(BorderFactory.createLineBorder(Color.yellow,10));
        frame.add(panel);
        JLabel label=new JLabel("ADMIN");
        label.setFont(new Font("Ariel",Font.LAYOUT_LEFT_TO_RIGHT,40));
        label.setBounds(230,35,200,40);
        panel.add(label);
        JButton b1=new JButton("ADD STUDENT");
        b1.setFont(new Font("Ariel",Font.TYPE1_FONT,20));
        b1.setBackground(Color.ORANGE);
        b1.setBounds(200,100,200,40);
        panel.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                std.admissionform();
                frame.setVisible(false);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        
        });
        JButton b2=new JButton("ADD TEACHER");
        b2.setFont(new Font("Ariel",Font.TYPE1_FONT,20));
        b2.setBackground(Color.getHSBColor(121, 134, 101));
        b2.setBounds(200,160,200,40);
        panel.add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t.addt();
                frame.setVisible(false);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
       JButton b4=new JButton("EDIT STUDENT");
        b4.setBounds(200, 220, 200, 40);
        b4.setBackground(Color.getHSBColor(342, 123, 3489));
        b4.setFont(new Font("Ariel",Font.TYPE1_FONT,20));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 frame.setVisible(false);
                 ad.deletest();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(b4);
        JButton b5=new JButton("BACK");
        b5.setBounds(200,340,200,40);
        b5.setBackground(Color.getHSBColor(342, 453, 107));
        b5.setFont(new Font("Ariel",Font.TYPE1_FONT,20));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                login.lin();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
          panel.add(b5);
        
                JButton b3=new JButton("EDIT TEACHER");
        b3.setFont(new Font("Ariel",Font.TYPE1_FONT,20));
       b3.setBackground(Color.getHSBColor(231, 223, 108));
       b3.setBounds(200,280,200,40);
       panel.add(b3);
       b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                ad.deletetr();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
       });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void deletest(){
        Admin ad=new Admin();
            JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(56, 45, 134));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(234, 453, 2345));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER NAME");
    label1.setBounds(80,30,150,20);
    panel.add(label1);
    JTextField tfd=new JTextField();
    tfd.setBounds(250,30,150,20);
    panel.add(tfd);
   JButton b22=new JButton("Clear");
   b22.setBounds(310,95,90,30);
   b22.setBackground(Color.ORANGE);
   b22.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfd.setText("");
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b22);
   JButton b33=new JButton("Back");
   b33.setBounds(310,135,90,30);
   b33.setBackground(Color.orange);
   b33.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            ad.add();
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b33);
    JButton b11=new JButton("Delete");
    b11.setBounds(310,55,90,30);
    b11.setBackground(Color.orange);
    panel.add(b11);
    String urlst="jdbc:mysql://localhost:3306/schoolms";
    String usernamest="root";
    String passwordst="Sohaib125?";
    b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stnam=tfd.getText();
                 try{
                     Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection11=DriverManager.getConnection(urlst,usernamest,passwordst);
       
        String Query="delete from student_admission_form where student_name='"+stnam+"'";
           Statement statement11=connection11.createStatement();
          statement11.executeUpdate(Query);
          JOptionPane.showMessageDialog(null, "record of student '"+stnam+"' delete from system");
          String nameeq="select student_name from student_admission_form";
//       
    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        JOptionPane.showMessageDialog(null,"error occured");}
               catch (ClassNotFoundException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                 finally{
                     try {
                         try {
                             connection.close();
                         } catch (SQLException ex) {
                             Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         statement.close();
                     } catch (SQLException ex) {
                         Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
    });
    }
    public void deletetr(){
        Admin ad=new Admin();
            JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(3456, 2345, 21234));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(24, 353, 105));
    panel.setBorder(BorderFactory.createLineBorder(Color.green, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER NAME");
    label1.setBounds(80,30,150,20);
    panel.add(label1);
    JTextField tft=new JTextField();
    tft.setBounds(250,30,150,20);
    panel.add(tft);
   JButton b22=new JButton("Clear");
   b22.setBounds(310,95,90,30);
   b22.setBackground(Color.ORANGE);
   b22.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tft.setText("");
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b22);
   JButton b33=new JButton("Back");
   b33.setBounds(310,135,90,30);
   b33.setBackground(Color.orange);
   b33.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            ad.add();
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b33);
    JButton b11=new JButton("Delete");
    b11.setBounds(310,55,90,30);
    b11.setBackground(Color.orange);
    panel.add(b11);
    b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String urlt="jdbc:mysql://localhost:3306/schoolms";
    String usernamet="root";
    String passwordt="Sohaib125?";
    try{
        connection=DriverManager.getConnection(urlt,usernamet,passwordt);
        statement=connection.createStatement();
        String Query="delete from add_teacher where teacher_name='"+tft.getText()+"'";
        statement.executeUpdate(Query);
        JOptionPane.showMessageDialog(null, "record of '"+tft.getText()+"' successfully deleted");
        
    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
        JOptionPane.showMessageDialog(null,"error occured");
    }
    finally{
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
    });
    
    }
    
}
