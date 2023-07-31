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
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Information {
    
    String name;
    String father_name;
     int age;
     String adress;
    
     
     public void account(){
         JFrame frame=new JFrame();
         frame.setSize(500,400);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
         DefaultTableModel dtb=new DefaultTableModel();
         JTable tb=new JTable(dtb);
         frame.add(new JScrollPane(tb));
         dtb.addColumn("Name");
         dtb.addColumn("contact no");
         dtb.addColumn("e mail");
         dtb.addColumn("address");
         String url="jdbc:mysql://localhost:3306/Bms";
         String username="root";
         String password="Sohaib125?";
         try{
         Connection connection1=DriverManager.getConnection(url,username,password);
         Statement st=connection1.createStatement();
         String Query="SELECT * FROM Addaccountant";
         ResultSet rs=st.executeQuery(Query);
         while(rs.next()){
             
             String n=rs.getString("Name");
             String cno=rs.getString("Contact_Number");
             String em=rs.getString("E_mail");
             String ad=rs.getString("Address");
             dtb.addRow(new Object[]{n,cno,em,ad});
         }
         connection1.close();
         st.close();
         
         }
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null,ex.toString());
             JOptionPane.showMessageDialog(null,"error occured");
         }
         
                 
     }
     
     
}
