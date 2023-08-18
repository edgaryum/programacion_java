import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class conection {
    private static Connection conectar;
    public static conection cntar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost.3306.finca";
            String Usuario ="root";
            String contraseña ="";
            conectar=DriverManager.getConnection(url, Usuario, contraseña);
            System.out.println("conexion exitosa");
        } catch(SQLException ex){
            System.out.println("Fallo en conexion" + ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println("Error al cargar controlador" + ex.getMessage());
        }
        return conectar;
        }
    }
