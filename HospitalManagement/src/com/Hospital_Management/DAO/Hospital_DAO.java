
package com.Hospital_Management.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import static jdk.nashorn.internal.runtime.Debug.id;


public class Hospital_DAO {
    Connection connection=ConnectionUtil.getConnection();
    ResultSet rs=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    public static boolean isLogin=false;
    public static int row;
    public void addDoctor(int id,String name,String add,long cinc,String time){
        try {
            String sql1="INSERT INTO DOCTOR (DOCTORID, DOCTORNAME, DOCTORADD, DOCTORSSN, DOCTOR_TIME) VALUES (?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,add);
            pstmt.setLong(4,cinc);
            pstmt.setString(5,time);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addPatient(int id,String name,int age,String add,int room,String gender,int phone,String disease){
        try {
            String sql="INSERT INTO PATIENT(PATIENTID, PATIENTNAME, PATIENTADD, PATIENTPHONE, PATIENTDISE, ROOMNUMBER, PATIENTAGE, GENDER) VALUES (?,?,?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,add);
            pstmt.setInt(4,phone);
            pstmt.setString(5,disease);
            pstmt.setInt(6,room);
            pstmt.setInt(7,age);
            pstmt.setString(8,gender);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addRoom(int rNumber,String type,String ava,int code,int floor){
        try {
            String sql="INSERT INTO ROOM (ROOMNUMBER, ROOMTYPE, AVAILABLE, BLOCKCODE, BLOCKFLOOR) VALUES (?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,rNumber);
            pstmt.setString(2,type);
            pstmt.setString(3,ava);
            pstmt.setInt(4,code);
            pstmt.setInt(5,floor);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addBlock(int code,int floor){
        try {
            String sql="INSERT INTO BLOCK(BLOCKFLOOR, BLOCKCODE) VALUES (?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,code);
            pstmt.setInt(2,floor);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addStaff(int id,String name,long cnic,String pos,String add,String date){
        try {
            String sql="INSERT INTO STAFF (STAFFID, STAFFNAME, STAFFSSN, STAFFPOSITION, STAFFADD, STAFFREGIST) VALUES (?,?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setLong(3,cnic);
            pstmt.setString(4,pos);
            pstmt.setString(5,add);
            pstmt.setString(6,date);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addStay(int id,int patientID,int rNumber,String start,String end){
        try {
            String sql="INSERT INTO STAY(STAYID, PATIENTID, ROOMNUMBER, START_TIME, END_TIME) VALUES (?,?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setInt(2,patientID);
            pstmt.setInt(3,rNumber);
            pstmt.setString(4,start);
            pstmt.setString(5,end);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"ID already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully added");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public ResultSet getDoctor(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM doctor";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet getPatient(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM patient";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet getBlock(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM block";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet getRoom(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM room";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet getStaff(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM staff";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet getStay(){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM stay";
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public void deleteDoctor(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from doctor WHERE doctorid='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong Doctor_id or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    public void deletePatient(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from patient WHERE patientid='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong Patient_id or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    public void deleteStaff(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from staff WHERE staffid='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong Staff_id or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    public void deleteRoom(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from room WHERE roomnumber='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong Room Number or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    public void deleteBlock(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from block WHERE blockfloor='"+id+"' OR blockcode='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong block code and block floor or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    public void deleteStay(int id){
        try{
            stmt=connection.createStatement();
            String sql="delete from stay WHERE stayid='"+id+"'";
            row=stmt.executeUpdate(sql);
            if(row<1){
                JOptionPane.showMessageDialog(null,"wrong Stay ID or doesnot exist","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
            }
            
        }catch(SQLException d){
            JOptionPane.showMessageDialog(null,d,"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(d);
          }
    }
    
    public void updateDoctor(int id,String name,String add,long cinc,String time){
        try {
            String sql1="UPDATE DOCTOR SET DOCTORNAME=?, DOCTORADD=?, DOCTORSSN=?, DOCTOR_TIME=? WHERE doctorid='"+id+"'";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setString(1,name);
            pstmt.setString(2,add);
            pstmt.setLong(3,cinc);
            pstmt.setString(4,time);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updatePatient(int id,String name,int age,String add,int room,String gender,int phone,String disease){
        try {
            String sql="UPDATE PATIENT SET PATIENTNAME=?, PATIENTADD=?, PATIENTPHONE=?, PATIENTDISE=?, ROOMNUMBER=?, PATIENTAGE=?, GENDER=? WHERE patientid='"+id+"'";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,add);
            pstmt.setInt(3,phone);
            pstmt.setString(4,disease);
            pstmt.setInt(5,room);
            pstmt.setInt(6,age);
            pstmt.setString(7,gender);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateRoom(int rNumber,String type,String ava,int code,int floor){
        try {
            String sql="UPDATE ROOM SET ROOMTYPE=?, AVAILABLE=?, BLOCKCODE=?, BLOCKFLOOR=? WHERE roomumber'"+rNumber+"'";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,type);
            pstmt.setString(2,ava);
            pstmt.setInt(3,code);
            pstmt.setInt(4,floor);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateBlock(int floor,int code){
        try {
            String sql="UPDATE BLOCK SET BLOCKFLOOR=?, BLOCKCODE=? WHERE blockfloor='"+floor+"' OR blockcode='"+code+"' ";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,floor);
            pstmt.setInt(2,code);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateStaff(int id,String name,long cnic,String pos,String add,String date){
        try {
            String sql="UPDATE STAFF SET STAFFNAME=?, STAFFSSN=?, STAFFPOSITION=?, STAFFADD=?, STAFFREGIST=? WHERE staffid='"+id+"'";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setLong(2,cnic);
            pstmt.setString(3,pos);
            pstmt.setString(4,add);
            pstmt.setString(5,date);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateStay(int id,int patientID,int rNumber,String start,String end){
        try {
            String sql="UPDATE STAY SET PATIENTID=?, ROOMNUMBER=?, START_TIME=?, END_TIME=? WHERE stayid='"+id+"'";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,patientID);
            pstmt.setInt(2,rNumber);
            pstmt.setString(3,start);
            pstmt.setString(4,end);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"doesnot exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully updated");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public void signUp(String name,String password){
        try {
            String sql="INSERT INTO LOGIN (USERNAME, PASSWORD) VALUES (?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            row=pstmt.executeUpdate();
            if(row<1){
                JOptionPane.showConfirmDialog(null,"Username and password already exist", "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Successfully Sign Up");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
    }
    public boolean login(String name,String password){
        try {
            stmt=connection.createStatement();
            String sql="SELECT * FROM login WHERE username='"+name+"' AND password='"+password+"'";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                if(name.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                    isLogin=true;
                    return true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex, "Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        isLogin=false;
        return false;
    }
}