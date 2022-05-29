/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.JDBCUtil;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class TestConnect {
    public static void main(String[] args) {
        try{
            Connection con = JDBCUtil.getConnection();
            JDBCUtil.showInfo(con);
            JDBCUtil.closeConnection(con);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        System.out.println("");
    }
}
