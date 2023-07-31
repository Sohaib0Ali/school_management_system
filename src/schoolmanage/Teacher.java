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
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Teacher {
    private String name;
    private String father_name;
    private String adress;
    private String s_subject;
    private int age;
    private int phone_no;
    private int salary;
    private int password;
    Connection connection;
    Statement statement;
    
    //................................Getter and setters.......................
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
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
    public void s_subject(String s_subject){
        this.s_subject=s_subject;
    }
    public String gets_subject(){
        return s_subject;
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
    public void setpassword(int password){
        this.password=password;
    }
    public int getpassword(){
        return password;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
    
    
    //......................Functions...........................
    public void login(){
        System.out.println("LOGIN");
    }
    public void atendense(){
        System.out.println("mark atendense of students");
    }
    public void papers(){
        System.out.println("paper marking");
    }
    public void result(){
        System.out.println("create result card");
    }
    public void classes(){
        System.out.println("classes per day ");
    }
    int flag=0;
//    ..........................................shedule test frame for teacher ...................
   
   
    
   
    public void shtest(){
        Teacher teach=new Teacher();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL ");
        frame.setSize(600,450);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.GREEN);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        panel.setBackground(Color.getHSBColor(456, 675, 210));
        panel.setBorder(BorderFactory.createLineBorder(Color.cyan,5));
        frame.add(panel);
        panel.setLayout(null);
        JLabel label=new JLabel("SHEDULE TEST");
        label.setBounds(200,30,200,30);
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,25));
        panel.add(label);
        JLabel label1=new JLabel("BOOK NAME");
        label1.setBounds(150,100,155,25);
        label1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(label1);
        JTextField tf11=new JTextField();
        tf11.setBounds(350,100,155,25);
        panel.add(tf11);
        JLabel label2=new JLabel("TEST DATE");
        label2.setBounds(150,150,155,25);
        label2.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(label2);
        JTextField tf12=new JTextField();
        tf12.setBounds(350,150,155,25);
        panel.add(tf12);
         JLabel label3=new JLabel("TOTAL MARKS");
        label3.setBounds(150,200,155,25);
        label3.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(label3);
       JTextField tf13=new JTextField();
        tf13.setBounds(350,200,155,25);
        panel.add(tf13);
         JLabel label4=new JLabel("STARTING TIME");
        label4.setBounds(150,250,155,25);
        label4.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        panel.add(label4);
         JTextField tf14=new JTextField();
        tf14.setBounds(350,250,155,25);
        panel.add(tf14);
        JButton b1=new JButton("BACK");
        b1.setBounds(430,310,120,30);
        b1.setBackground(Color.GREEN);
        b1.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teach.work();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(b1);
        JButton b2=new JButton("SET");
        b2.setBounds(240,310,100,30);
        b2.setBackground(Color.GREEN);
        b2.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String url="jdbc:mysql://localhost:3306/schoolms";
                    String username="root";
                    String password="Sohaib125?";
                     connection=DriverManager.getConnection(url,username,password);
                     statement= connection.createStatement();
                    String Query="INSERT INTO test_shedule(book_name,test_date,total_marks,starting_time)VALUES('"+tf11.getText()+"', '"+tf12.getText()+"', '"+tf13.getText()+"' ,'"+tf14.getText()+"')";
                    statement.execute(Query);
                    JOptionPane.showMessageDialog(null, "your test shedule set successfully");
                    tf11.setText(null);
                    tf12.setText(null);
                    tf13.setText(null);
                    tf14.setText(null);
                    connection.close();
                    statement.close();
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, ex.toString());
                    JOptionPane.showMessageDialog(null, "error occured");
                    
                }
           
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        panel.add(b2);
        JButton b3=new JButton("Search for update");
        b3.setBounds(240,360,180,30);
        b3.setBackground(Color.getHSBColor(342, 122, 114));
        b3.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(56, 45, 134));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(94, 53, 134));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER NAME");
    label1.setBounds(100,30,150,20);
    panel.add(label1);
    JTextField tfs=new JTextField();
    tfs.setBounds(250,30,150,20);
    panel.add(tfs);
   JButton b2=new JButton("Clear");
   b2.setBounds(310,95,90,30);
   b2.setBackground(Color.ORANGE);
   b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            tfs.setText("");
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
            
            String Query="SELECT * FROM test_shedule WHERE book_name='"+tfs.getText()+"'";
            Statement stmup=connectionup.createStatement();
//            stmup.executeQuery(Query);
             ResultSet rs=stmup.executeQuery(Query);
          
            if(rs.next()){
                 frame.setVisible(false);
            tf11.setText(rs.getString("book_name"));
            tf12.setText(rs.getString("test_date"));
            tf13.setText(rs.getString("total_marks"));
            tf14.setText(rs.getString("starting_time"));
            }
            else {
                JOptionPane.showMessageDialog(null, "data does no exist in system related to '"+tfs.getText()+"'");
            }
            connectionup.close();
            stmup.close();
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
        panel.add(b3);
        
        JButton b4=new JButton("UPDATE");
        b4.setBounds(430,360,120,30);
        b4.setBackground(Color.getHSBColor(178, 289, 1231));
        b4.setFont(new Font("Ariel",Font.TYPE1_FONT,16));
         panel.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String urlup1="jdbc:mysql://localhost:3306/schoolms";
                    String usernameup1="root";
                    String passwordup1="Sohaib125?";
                     try{
                Connection connections=DriverManager.getConnection(urlup1,usernameup1,passwordup1);
                String query="UPDATE test_shedule SET book_name='"+tf11.getText()+"',test_date='"+tf12.getText()+"',total_marks='"+tf13.getText()+"',starting_time='"+tf14.getText()+"' WHERE book_name='"+tf11.getText()+"'";
                Statement stms=connections.createStatement();
                int a= stms.executeUpdate(query);
                if(a==1){
                   
                tf11.setText(null);
                tf12.setText(null);
                tf13.setText(null);
                tf14.setText(null);
               
                 JOptionPane.showMessageDialog(null, "data updated successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null,"System does not allow to edit data related to this name '"+tf11.getText()+"'");
                }
               connections.close();
               stms.close();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.toString());
                JOptionPane.showMessageDialog(null,"error occured");
            }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
       
        
    }
//    ............................................teacher add form...............................
    public void addt(){
        Admin ad=new Admin();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(800,390);
//        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(Color.yellow);
        JPanel panel=new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setBorder(BorderFactory.createLineBorder(Color.yellow,10));
        panel.setLayout(null);
        frame.add(panel);
        JLabel label=new JLabel("Teacher form");
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,30));
        label.setBounds(300,40,200,30);
        panel.add(label);
        JLabel label1=new JLabel("Teacher name ");
        label1.setBounds(100,90,100,20);
        panel.add(label1);
        JTextField tf1=new JTextField();
        tf1.setColumns(18);
        tf1.setBounds(190,90,160,20);
        panel.add(tf1);
        JLabel label2=new JLabel("Father name");
        label2.setBounds(390, 90, 100, 20);
        panel.add(label2);
        JTextField tf2=new JTextField();
        tf2.setColumns(18);
        tf2.setBounds(480, 90, 160, 20);
        panel.add(tf2);
        JLabel label3=new JLabel("Date of birth ");
        label3.setBounds(100,120,100,20);
        panel.add(label3);
        JTextField tf3=new JTextField();
        tf3.setColumns(18);
        tf3.setBounds(190,120,160,20);
        panel.add(tf3);
        JLabel label4=new JLabel("Adress");
        label4.setBounds(390,120,100,20);
        panel.add(label4);
        JTextField tf4=new JTextField();
        tf4.setColumns(18);
        tf4.setBounds(480,120,160,20);
        panel.add(tf4);
        JLabel label5=new JLabel("Phone no");
        label5.setBounds(100,150,100,20);
        panel.add(label5);
        JTextField tf5=new JTextField();
        tf5.setColumns(18);
        tf5.setBounds(190,150,160,20);
        panel.add(tf5);
        JLabel label6=new JLabel("Specification");
        label6.setBounds(390,150,100,20);
        panel.add(label6);
        JTextField tf6=new JTextField();
        tf6.setColumns(18);
        tf6.setBounds(480,150,160,20);
        panel.add(tf6);
        JLabel labelg=new JLabel("Gender");
        labelg.setBounds(100,180,80,20);
        panel.add(labelg);
        JRadioButton rb1=new JRadioButton("Male");
        rb1.setBounds(200,180,70,20);
        rb1.setActionCommand("male");
        panel.add(rb1);
        JRadioButton rb2=new JRadioButton("Female");
        rb2.setBounds(200,210,70,20);
        rb2.setActionCommand("female");
        panel.add(rb2);
        ButtonGroup group=new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        JLabel label7=new JLabel("City");
        label7.setBounds(390,180,100,20);
        panel.add(label7);
        JComboBox cb1=new JComboBox();
        cb1.setBounds(480,180,100,20);
        cb1.addItem("Sialkot");
        cb1.addItem("Rawalpindi");
        cb1.addItem("Islamabad");
        cb1.addItem("Faisalabad");
        cb1.addItem("Lahore");
        cb1.addItem("Peshawar");
        cb1.addItem("Karachi");
        cb1.addItem("Queta");
        cb1.setActionCommand("sialkot");
        panel.add(cb1);
      JButton b2=new JButton("SAVE");
      b2.setBounds(480,210,80,30);
      b2.setBackground(Color.green);
      panel.add(b2);
      b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String url="jdbc:mysql://localhost:3306/schoolms";
                    String username="root";
                    String password="Sohaib125?";
                     connection=DriverManager.getConnection(url,username,password);
                     statement=connection.createStatement();
                    String Query="INSERT INTO add_teacher(teacher_name,father_name,date_of_birth,adress,phone_no,specification,gender,city)"
                            + "VALUES ('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"',"
                            + "'"+tf6.getText()+"','"+group.getSelection().getActionCommand()+"','"+cb1.getSelectedItem()+"')";
                  
                    statement.execute(Query);
                    JOptionPane.showMessageDialog(null,"Teacher form successfully save");
                    tf1.setText(null);
                    tf2.setText(null);
                    tf3.setText(null);
                    tf4.setText(null);
                    tf5.setText(null);
                    tf6.setText(null);
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex.toString());
                    JOptionPane.showMessageDialog(null,"error occured");
                }
                finally{
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
      });
       
        JButton b1=new JButton("BACK");
        b1.setBounds(480,250,80,30);
        b1.setBackground(Color.green);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ad.add();
                frame.setVisible(false);
                
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        
        
        });
        JButton b3=new JButton("UPDATE");
        b3.setBounds(580,210,80,30);
        b3.setBackground(Color.getHSBColor(123, 234, 523));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        String urlup="jdbc:mysql://localhost:3306/schoolms";
                    String usernameup="root";
                    String passwordup="Sohaib125?";
                     try{
                Connection connectionst=DriverManager.getConnection(urlup,usernameup,passwordup);
                String querys="UPDATE add_teacher SET teacher_name='"+tf1.getText()+"',father_name='"+tf2.getText()+"',date_of_birth='"+tf3.getText()+"',adress='"+tf4.getText()+"',"
                + "phone_no='"+tf5.getText()+"',specification='"+tf6.getText()+"',gender='"+group.getSelection().getActionCommand()+"',city='"+cb1.getSelectedItem()+"' WHERE teacher_name='"+tf1.getText()+"'";
                Statement stms=connectionst.createStatement();
                int a= stms.executeUpdate(querys);
                if(a==1){
                   
                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);
                tf4.setText(null);
                tf5.setText(null);
                tf6.setText(null);
                 JOptionPane.showMessageDialog(null, "data updated successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Teacher record related to '"+tf1.getText()+"' does not exist in system");
                }
               connectionst.close();
               stms.close();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.toString());
                JOptionPane.showMessageDialog(null,"error occured in update to store data");
            }
                
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        panel.add(b3);
        
        JButton b4=new JButton("SEARCH FOR UPDATE");
        b4.setBounds(580,250,170,30);
        b4.setBackground(Color.getHSBColor(198, 187, 390));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
    frame.setSize(480,220);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setBackground(Color.getHSBColor(156, 35, 184));
    JPanel panel=new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.getHSBColor(94, 53, 434));
    panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel("ENTER TEACHER NAME");
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
            
            String Query="SELECT * FROM add_teacher WHERE teacher_name='"+tf11.getText()+"'";
            Statement stmup=connectionup.createStatement();
//            stmup.executeQuery(Query);
             ResultSet rs=stmup.executeQuery(Query);
          
            if(rs.next()){
                 frame.setVisible(false);
            tf1.setText(rs.getString("teacher_name"));
            tf2.setText(rs.getString("father_name"));
            tf3.setText(rs.getString("date_of_birth"));
            tf4.setText(rs.getString("adress"));
            tf5.setText(rs.getString("phone_no"));
            tf6.setText(rs.getString("specification"));
           
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
        panel.add(b4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
//    ................................................teacher word form...............................
    public void work(){
        Teacher teach=new Teacher();
        Admin ad=new Admin();
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        frame.add(panel);
        panel.setBackground(Color.getHSBColor(134, 143, 109));
        panel.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(237,354,111),10));
        panel.setLayout(null);
        JLabel label=new JLabel("TEACHER WORK");
        label.setBounds(180,30,240,30);
        label.setBackground(Color.getHSBColor(342, 123, 120));
        label.setFont(new Font("Ariel",Font.TYPE1_FONT,25));
        panel.add(label);
        JButton b1=new JButton("SHEDULE TEST");
        b1.setBounds(105,100,180,30);
        b1.setFont(new Font("Ariel",Font.TYPE1_FONT,18));
        b1.setBackground(Color.getHSBColor(321, 123, 109));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teach.shtest();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
      panel.add(b1);
         JButton b3=new JButton("BACK");
        b3.setBounds(480,290,80,30);
        b3.setBackground(Color.green);
//        b3.setFont(new Font("Arie",Font.TYPE1_FONT,25));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Login login1=new Login();
                 login1.lin();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         panel.add(b3);
         JButton b2=new JButton("DELETE");
         b2.setBounds(105,150,180,30);
          b2.setFont(new Font("Ariel",Font.TYPE1_FONT,18));
          b2.setBackground(Color.getHSBColor(234, 1123, 2101));
          b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teach.deletrec();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
          });
          panel.add(b2);
          JButton b4=new JButton("SHEDULES");
          b4.setBounds(105,200,180,30);
          b4.setBackground(Color.getHSBColor(567, 453, 2234));
           b4.setFont(new Font("Ariel",Font.TYPE1_FONT,18));
           b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    teach.showtestrec();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
           });
           panel.add(b4);
          JButton b5=new JButton("SEARCH");
          b5.setBounds(105,250,180,30);
          b5.setBackground(Color.getHSBColor(90, 178, 570));
          b5.setFont(new Font("Ariel",Font.TYPE1_FONT,18));
         b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                teach.searchtestrec();
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
         });
          panel.add(b5);
    }
        
    public void deletrec(){
        Teacher teach=new Teacher();
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
    JLabel label1=new JLabel("BOOK NAME");
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
            teach.work();
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
         connection=DriverManager.getConnection(urlst,usernamest,passwordst);
       
        String Query="delete from test_shedule where book_name='"+stnam+"'";
           statement=connection.createStatement();
          statement.executeUpdate(Query);
          JOptionPane.showMessageDialog(null,"teste shedule of book '"+stnam+"' deleted from system");
          String nameeq="select book_name from student_admission_form";
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
     public void showtestrec() throws SQLException{
        JFrame frame=new JFrame("QIRAT  PUBLIC  SCHOOL");
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        DefaultTableModel dtb=new DefaultTableModel();
        JTable tb=new JTable(dtb);
         frame.add(new JScrollPane(tb));
        dtb.addColumn("BOOD NAME");
        dtb.addColumn("TEST DATE");
        dtb.addColumn("TOTAL MARKS");
        dtb.addColumn("STARTING TIME");
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
     public void searchtestrec(){

    Teacher teach=new Teacher();
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
    JLabel label1=new JLabel("ENTER BOOK NAME");
    label1.setBounds(80,30,190,20);
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
            teach.work();
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
         String username=tf1.getText();
         JFrame frame1=new JFrame("STUDENT RECORD");
    frame1.setSize(500,300);
    frame1.setLocationRelativeTo(null);
    
     DefaultTableModel dtb=new DefaultTableModel();
     JTable tb=new JTable(dtb);
     tb.setPreferredScrollableViewportSize(new Dimension(420,200));
     tb.setFillsViewportHeight(true);
     frame1.add(new JScrollPane(tb));
     dtb.addColumn("BOOK NAME");
     dtb.addColumn("TEST DATE");
     dtb.addColumn("TOTAL MARKS");
     dtb.addColumn("STARTING TIME");
  
     try{
          connection=DriverManager.getConnection(urlsr,usernamesr,passwordsr);
          statement=connection.createStatement();
         String Query="select * from test_shedule where book_name = '"+username+"'";
         ResultSet rs=statement.executeQuery(Query);
         while(rs.next()){
             String sname=rs.getString("book_name");
             String sfathern=rs.getString("test_date");
             String sadress=rs.getString("total_marks");
             String sphonen=rs.getString("starting_time");
            
             if(username.equalsIgnoreCase(sname)){
                  flag=1;
                 dtb.addRow(new Object[]{sname,sfathern,sadress,sphonen});
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
}
