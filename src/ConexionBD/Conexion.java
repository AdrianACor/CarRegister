package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    /*private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbcarr"; */
    
    private static final String user = "uerifbjajo0y2znn";
    private static final String password = "x7f0rvDOrHtnoSPVeNpf";
    private static final String url = "jdbc:mysql://uerifbjajo0y2znn:x7f0rvDOrHtnoSPVeNpf@bwxhcjdk36v9wmbsnvpv-mysql.services.clever-cloud.com:3306/bwxhcjdk36v9wmbsnvpv";

    public Conexion() {
        conn = null;
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

    /**
     * @return
     */
    public Connection getConnection(){
        
        
        return conn;
    }

    /**
     * @throws SQLException
     */
    public void desconectar() throws SQLException{
        /* conn = null; */
        if(conn != null){
            if(!conn.isClosed()){
                conn.close();
            }
        } 
    }
}
