package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
    
    private static Connection conn;
    private static Conexion instancia;
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    /*private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbcarr";*/
    
    private static final String user = "uerifbjajo0y2znn";
    private static final String password = "x7f0rvDOrHtnoSPVeNpf";
    private static final String url = "jdbc:mysql://uerifbjajo0y2znn:x7f0rvDOrHtnoSPVeNpf@bwxhcjdk36v9wmbsnvpv-mysql.services.clever-cloud.com:3306/bwxhcjdk36v9wmbsnvpv";
    
    private Conexion(){
    
    }

    public static Connection Conectar() {
        
        if(conn == null){
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,password);
                /* if(conn != null){
                    System.out.println("Conexion establecida");    
                } */
            }
            catch(Exception e){
                System.out.println("Error al conectar: " + e);
            }
        }
        return conn;
    }

    /**
     * @return
     */
    public static Conexion getInstance(){
        
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    /**
     * @throws SQLException
     */
    public void desconectar() throws SQLException{
        try{
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            conn.close();
        }finally{
            conn.close();    
        }
    }
}
