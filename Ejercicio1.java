/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nolberto Tuberquia
 */
public class Ejercicio1  
{

    public static void main(String[] args) 
    {
     String usuario= "root";
     String password= "";
     String url="jdbc:mysql;//demo.phpmyadmin.net /datos";
     Connection conexion;
     Statement statement;
     ResultSet rs;
     
   
        try
        {
              conexion =DriverManager.getConnection(url, usuario, password);
               statement= conexion.createStatement();
                rs = statement.executeQuery("SELECT * FROM `informacion1`");
                     while (rs.next())
                       
            {
             System.out.println(rs.getString("Nombres"));
           
            }
            statement.execute("INSERT INTO `Informacion1` (`ID`, `DOCUMENTO`, `NOMBRES`) VALUES ('1', '1046955204', 'Luz');");
            System.out.println();
               rs = statement.executeQuery("SELECT * FROM `Sena`");
             while (rs.next())
                 System.out.println(rs.getString("Nombres"));
        }
              catch (SQLException ex)
                  
           {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
}
