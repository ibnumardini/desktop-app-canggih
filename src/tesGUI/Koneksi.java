/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesGUI;

import java.sql.*;

/**
 *
 * @author ibnumardini
 */
public class Koneksi {

    private static Connection con = null;
    private final static String jdbcDriver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:8025/university_pbo";
    private final static String user = "root";
    private final static String pass = "root";

    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName(jdbcDriver);
                System.out.println("Mencoba membangun koneksi...");
                con = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (con != null) {
            System.out.println("Koneksi berhasil !");
        }
        
        
        return con;
    }

    public static void closeConnection() {
        try {
            System.out.println("Menutup koneksi...");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
