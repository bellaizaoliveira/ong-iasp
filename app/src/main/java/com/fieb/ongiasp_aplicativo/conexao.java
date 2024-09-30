package com.fieb.ongiasp_aplicativo;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public static Connection conectar(){
        Connection conn = null;
        try{
            StrictMode.ThreadPolicy politicas;
            politicas = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politicas);
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc.jtds.sqlserver://172.19.1.221"+"databaseName=INF3FM_2024_0_EQUIPE01;usersa;password=@ITB123456;");


        }catch (SQLException e){
            e.getMessage();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}
