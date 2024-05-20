/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class koneksi {
    static Connection con;
    
    public static Connection connection(){
        if(con==null){
            MysqlDataSource data=new MysqlDataSource();
            data.setDatabaseName("zoo");
            data.setUser("sofwan");
            data.setPassword("12345");
            try{
                con =data.getConnection();
                System.out.println("Koneksi berhasil");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Koneksi gagal");
            }
            }
            return con;
        }
    }
    

