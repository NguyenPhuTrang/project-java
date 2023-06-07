/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st= con.createStatement();   
            //st.executeUpdate("create table users(name varchar(200),email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200) , address varchar(200), status varchar(20))");
            //st.executeUpdate("create table room(roomNumber varchar(10), roomType varchar(200), bed varchar(200) , price int , imgUrl varchar(500) ,  status varchar(20))");
            //st.executeUpdate("create table customer(id int(10) ,name varchar(200),phoneNumber int(10), nationality varchar(200),gender varchar(50), email varchar(200), idProof varchar(200), address varchar(200), checkIn varchar(50), roomNumber varchar(10), bed varchar(200), roomType varchar(200),pricePerDay int(10), numberDaysStay int (10), totalAmount varchar(200), checkout varchar(50))");
            //st.executeUpdate("create table admin(AminID varchar(20), AdminName varchar(20), Password varchar(20),PhoneNumber varchar(10),Email varchar(20),Address varchar(20))");
            
               st.executeUpdate("create table student(Masv varchar(10), hoten varchar(20), TbCS varchar(20), TbCN varchar(20), tinchiNo varchar(20))");      
            
            // Demo database
            // st.executeUpdate("create table users(userID varchar(20),name varchar(200),email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200) , address varchar(200), status varchar(20))");
            //st.executeUpdate("create table admin(adminID varchar(20),name varchar(200),email varchar(200), password varchar(50), address varchar(200))");
            //st.executeUpdate("create table room(roomID varchar(20),roomNumber varchar(10), roomType varchar(200), bed varchar(200) , price int , status varchar(20))");
            //st.executeUpdate("create table customer(customerID varchar(20),roomID varchar(20), userID varchar(20),phoneNumber int(10), nationality varchar(200),gender varchar(50), idProof varchar(200), checkIn varchar(50), checkout varchar(50))");
            //st.executeUpdate("create table bill(billID int(10), adminID varchar(20),customerID varchar(20),roomID varchar(10),numberDaysStay int (10), totalAmount varchar(200))");
            
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
         try {
            con.close();
            st.close();
            
        } catch (Exception e) {
        }
        }
    }
}
