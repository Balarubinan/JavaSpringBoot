package com.example.FirstSpringProject;

import java.sql.*;

public class DatabaseConnect {
    static String dbURL = "jdbc:sqlite:Store.db";
    static Connection conn=null;
    public void EstablishConnnect() {
        try {
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the database");
//                Statement s=conn.createStatement();
//                ResultSet rs=s.executeQuery("select * from TaskList");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        add_task("Thsisis");
        System.out.print(get_task());
    }
    public void add_task(String taskName){
        try{
            Statement s=conn.createStatement();
            String ss="insert into TaskList values ('"+taskName+"')";
            s.executeUpdate(ss);
            conn.commit();
        }
        catch (Exception e){
            System.out.print("JHHJ"+e);
        }
    }
    public  String get_task() {
        StringBuilder ans=null;
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from TaskList");
            ans = new StringBuilder();
            while (rs.next()) {
                ans.append(rs.getString(1)).append("\n"); // row index starts from 1
            }
//            return ans.toString();
        } catch (Exception e) {
            System.out.print("EERR"+e);
        }
        return ans.toString();
    }
}
