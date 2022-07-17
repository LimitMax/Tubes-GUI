/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ZUP_92
 */
public class koneksi {
     public String user     = "root";
    public String pass     = "";
    public String db       = "provis_sekolah"; 
    public String urlValue = "Jdbc:mysql://localhost:3306/"+db;
    public String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public Connection con = null;
    public Statement stat  = null;
    
    public koneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(urlValue,user,pass);
            stat = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal "+e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }
    
}
