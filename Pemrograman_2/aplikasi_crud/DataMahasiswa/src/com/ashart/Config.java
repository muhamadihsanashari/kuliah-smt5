/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashart;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import sun.org.mozilla.javascript.internal.ScriptRuntime;

/**
 *
 * @author Ashart
 */
public class Config {
    private static Connection mysqlconfig;

    /**
     *
     * @return
     */
    public static Connection configDB(){
        try{
            String url="jdbc:mysql://localhost:3306/db_data_mahasiswa";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.err.println("Koneksi gagal "+ e.getMessage());
        }
        return mysqlconfig;
    }

}
