/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author USER
 */
public class Conexion {
   String ruta = "C:/Users/USER/Documents/BaseDatos_SQLite/EjemploAlumbrado.s3db";
    String strConexionDB = "jdbc:sqlite:"+ this.ruta;
    Connection conn = null;
    
     /*Un constructor para una cponexion de base de datos */
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión");
        }
    }
    //Este metodo es para cuando aprete el metodo de ejecutar sentencia, me modificara
    //una incercion y se actulizara la base de datos.
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
