/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanage;

/**
 *
 * @author SOHAIB ALI
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Student{
//    private int password;
//    private String name;
//    private String father_name;
//    private String adress;
//    private String class_level;
//    private int age;
//    private int phone_no;
//    public void add_student(){
//        System.out.println("enter student name ");
//        System.out.println("enter father name ");
//        System.out.println("enter address ");
//        System.out.println("enter phone no ");
//        System.out.println("enter age of student ");
//        System.out.println("enter date ");
//    }
//    //.........................Getter and setters
//     public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setpassword(int password){
//        this.password=password;
//    }
//    public int getpassword(){
//        return password;
//    }
//    public void setfather_name(String father_name){
//        this.father_name=father_name;
//    }
//    public String getfather_name(){
//        return father_name;
//    }
//    public void setadress(String adress){
//        this.adress=adress;
//    }
//    public String getadress(){
//        return adress;
//    }
//    public void setphone_no(int phone_no){
//        this.phone_no=phone_no;
//    }
//    public int getphone_no(){
//        return phone_no;
//    }
//    public void setage(int age){
//        this.age=age;
//    }
//    public int getage(){
//        return age;
//    }
//    public void setclass_level(String class_level){
//        this.class_level=class_level;
//    }
//    public String getclass_level(){
//        return class_level;
//    }
//    //...........................functoins.............................
//    public void login(){
//        
//        System.out.println("student login at system ");
//    }
//    public void admission_history(){
//        System.out.println("Admission details of student ");
//    }
//    .........................................................student admission form............
    Connection connection;
    Statement statement;
        public void admissionform(){
            Student std=new Student();
            Admin ad=new Admin();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL ");
        frame.setSize(650,450);
        frame.setBackground(Color.cyan);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JPanel panel=new JPanel();
        frame.add(panel);
        panel.setBackground(Color.pink);
        panel.setBorder(BorderFactory.createLineBorder(Color.yellow,10));
        JLabel label=new JLabel("ADMISSION FORM ");
        label.setBounds(200,30,300,40);
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,30));
        panel.add(label);
        JLabel label1=new JLabel("Student name");
        label1.setBounds(90,100,100,20);
        panel.setLayout(null);
        panel.add(label1);
        JTextField tf1=new JTextField();
        tf1.setColumns(15);
        tf1.setBounds(200,100, 130, 20);
        panel.add(tf1);
        JLabel label2=new JLabel("Father name");
        label2.setBounds(340,100,100, 20);
        panel.add(label2);
        JTextField tf2=new JTextField();
        tf2.setColumns(15);
        tf2.setBounds(450,100,130,20);
        panel.add(tf2);
        JLabel label3=new JLabel("Address");
        label3.setBounds(90,150,100,20);
        panel.add(label3);
        JTextField tf3=new JTextField();
        tf3.setColumns(15);
        tf3.setBounds(200,150,130,20);
        panel.add(tf3);
        JLabel label4=new JLabel("Phone no") ;
        label4.setBounds(340,150,100,20);
        panel.add(label4);
        JTextField tf4=new JTextField();
        tf4.setColumns(15);
        tf4.setBounds(450,150,130,20);
        panel.add(tf4);
        JLabel label5=new JLabel("Date of birth");
        label5.setBounds(90,200,100,20);
        panel.add(label5);
        JTextField tf5=new JTextField();
        tf5.setColumns(15);
        tf5.setBounds(200,200,130,20);
        panel.add(tf5);
        JLabel labelg=new JLabel("Gender");
        labelg.setBounds(340,200,80,20);
        panel.add(labelg);
        JRadioButton rb1=new JRadioButton("Male",true);
        rb1.setBounds(450,200,80,30);
        ButtonGroup group=new ButtonGroup();
        panel.add(rb1);
        JRadioButton rb2 =new JRadioButton("Female",true);
        rb2.setBounds(450,250,80,30);
        panel.add(rb2);
        rb1.setActionCommand("male");
        rb2.setActionCommand("female");
        group.add(rb1);
        group.add(rb2);
        JLabel label6=new JLabel("City");
        label6.setBounds(90,250,50,20);
        panel.add(label6);
        JComboBox cb1=new JComboBox();
        cb1.setBounds(200,250,90,30);
        cb1.addItem("Sialkot");
        cb1.addItem("Lahore");
        cb1.addItem("Islamabad");
        cb1.addItem("Faisalabad");
        cb1.addItem("Pechawar");
        cb1.addItem("Rawalpindi");
        cb1.addItem("Gujarat");
        cb1.setActionCommand("sialkot");
        panel.add(cb1);
        JLabel label7=new JLabel("class");
        label7.setBounds(90,300,50,20);
        panel.add(label7);
        JComboBox cb2=new JComboBox();
        cb2.setBounds(200,300,70,30);
        cb2.addItem("ONE");
        cb2.addItem("two");
         cb2.addItem("THREE");
        cb2.addItem("FOUR");
         cb2.addItem("FIVE");
        cb2.addItem("SIX");
         cb2.addItem("SEVEN");
        cb2.addItem("EIGHT");
         cb2.addItem("NINE");
        cb2.addItem("TEN");
        cb2.setActionCommand("one");
        panel.add(cb2);
        JButton b2=new JButton("Back");
          b2.setBounds(340,350,100,30);
          b2.setBackground(Color.green);
//          b2.setFont(new Font("Ariel",Font.TYPE1_FONT,25));
          panel.add(b2);
          b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ad.add();
                frame.setVisible(false);
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }});
        JButton b1=new JButton("Save");
        b1.setBounds(340,300,100,30);
        b1.setBackground(Color.green);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String url="jdbc:mysql://localhost:3306/schoolms";
                    String username="root";
                    String password="Sohaib125?";
                    Connection connection= DriverManager.getConnection(url,username,password);
                    
                    String Query="INSERT INTO student_admission_form(student_name,adress,phone_no,date_of_birth,gender,city,class,father_name)"
                            + " VALUES ('"+tf1.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"',"
                            + "'"+group.getSelection().getActionCommand()+"','"+cb1.getSelectedItem()+"','"+cb2.getSelectedItem()+"','"+tf2.getText()+"')";
                  Statement  statement=connection.createStatement();
                   statement.execute(Query);
                              JOptionPane.showMessageDialog(null,"Admission form saved");

                    tf1.setText(null);
                    tf2.setText(null);
                    tf3.setText(null);
                    tf4.setText(null);
                    tf5.setText(null);
                    connection.close();
                    statement.close();
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex.toString());
                    JOptionPane.showMessageDialog(null, "some error occured");
                }
           
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        JButton b3=new JButton("Search for update");
        b3.setBounds(460,350,150,30);
        b3.setBackground(Color.getHSBColor(234, 123, 90));
        panel.add(b3);
        b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    frame.setVisible(false);
                    //                              search for update
                      JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(156, 35, 184));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(134, 153, 134));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER STUDENT NAME");
    label1.setBounds(100,30,190,20);
    panel.add(label1);
    JTextField tf11=new JTextField();
    tf11.setBounds(250,30,150,20);
    panel.add(tf11);
   JButton b2=new JButton("Clear");
   b2.setBounds(310,95,90,30);
   b2.setBackground(Color.ORANGE);
   b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tf11.setText("");
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
   panel.add(b2);
    JButton b1=new JButton("Search");
    b1.setBounds(310,55,90,30);
    b1.setBackground(Color.orange);
    panel.add(b1);
    String urlup="jdbc:mysql://localhost:3306/schoolms";
    String usernameup="root";
    String passwordup="Sohaib125?";
     b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
//            std.admissionform();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectionup=DriverManager.getConnection(urlup,usernameup,passwordup);
            
            String Query="SELECT * FROM student_admission_form WHERE student_name='"+tf11.getText()+"'";
            Statement stmup=connectionup.createStatement();
//            stmup.executeQuery(Query);
             ResultSet rs=stmup.executeQuery(Query);
          
            if(rs.next()){
                 frame.setVisible(false);
            tf1.setText(rs.getString("student_name"));
            tf2.setText(rs.getString("father_name"));
            tf3.setText(rs.getString("adress"));
            tf4.setText(rs.getString("phone_no"));
            tf5.setText(rs.getString("date_of_birth"));
           
            }
            else {
                JOptionPane.showMessageDialog(null, "data does no exist in system related to '"+tf11.getText()+"'");
            }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.toString());
                JOptionPane.showMessageDialog(null, "error occured in access data for update");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   });
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
        });
        JButton b4=new JButton("Update");
        b4.setBounds(460,300,100,30);
        b4.setBackground(Color.getHSBColor(231, 2345, 120));
        b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String urlup="jdbc:mysql://localhost:3306/schoolms";
                    String usernameup="root";
                    String passwordup="Sohaib125?";
                     try{
                Connection connectionst=DriverManager.getConnection(urlup,usernameup,passwordup);
                String querys="UPDATE student_admission_form SET student_name='"+tf1.getText()+"',father_name='"+tf2.getText()+"',adress='"+tf3.getText()+"',phone_no='"+tf4.getText()+"',"
                + "date_of_birth='"+tf5.getText()+"',gender='"+group.getSelection().getActionCommand()+"',city='"+cb1.getSelectedItem()+"',class='"+cb2.getSelectedItem()+"' WHERE student_name='"+tf1.getText()+"'";
                Statement stms=connectionst.createStatement();
                int a= stms.executeUpdate(querys);
                if(a==1){
                   
                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);
                tf4.setText(null);
                tf5.setText(null);
                 JOptionPane.showMessageDialog(null, "data updated successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Student record related to '"+tf1.getText()+"' does not exist in system");
                }
               connectionst.close();
               stms.close();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.toString());
                JOptionPane.showMessageDialog(null,"data related to this name already exist in system you does not update to this data");
            }
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
        });
        panel.add(b4);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
        }
    public void studentaccess(){
        Login log=new Login();
        Student student2=new Student();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.getHSBColor(234, 123, 123));
        panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
        frame.add(panel); 
        JLabel label=new JLabel("STUDENT");
        label.setBounds(200,40,200,30);
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,18));
        panel.add(label);
        JButton b1=new JButton("TEST SHEDULES");
        b1.setBounds(150,100,200,30);
        b1.setBackground(Color.getHSBColor(345, 2134, 1223));
        b1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    student2.showtestrec();
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        JButton b2=new JButton("BACK");
        b2.setBounds(150,150,200,30);
        b2.setBackground(Color.getHSBColor(45, 241, 3134));
        b2.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                log.lin();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(b2);
    }
    public void showtestrec() throws SQLException{
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        DefaultTableModel dtb=new DefaultTableModel();
        JTable tb=new JTable(dtb);
         frame.add(new JScrollPane(tb));
        dtb.addColumn("book_name");
        dtb.addColumn("test_date");
        dtb.addColumn("total_marks");
        dtb.addColumn("starting_time");
        String urlsh="jdbc:mysql://localhost:3306/schoolms";
        String usernamesh="root";
        String passwordsh="Sohaib125?";
        try{
            Connection connection1=DriverManager.getConnection(urlsh,usernamesh,passwordsh);
            Statement statement1=connection1.createStatement();
            String Query="select * from test_shedule";
            ResultSet rs=statement1.executeQuery(Query);
            while(rs.next()){
                String bn=rs.getString("book_name");
                String td=rs.getString("test_date");
                String tm=rs.getString("total_marks");
                String st=rs.getString("starting_time");
                dtb.addRow(new Object[]{bn,td,tm,st});
            }
        }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex.toString());
           JOptionPane.showMessageDialog(null,"error occured");
       }
        finally{
           
            connection.close();
            statement.close();
        }
    }
    public void updatest(){
        
    }
//    JFrame frame1=new JFrame();
    
   
}

