package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbcarr";


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
    
    public Connection getConnection(){
        
        
        return conn;
    }
    
    public void desconectar() throws SQLException{
        /* conn = null; */
        if(conn != null){
            if(!conn.isClosed()){
                conn.close();
            }
        } 
    }
}
