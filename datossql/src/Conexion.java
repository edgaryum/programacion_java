import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conn;

    public static Connection conectar() {
        try {
            // cargar el controlador JDBC de mySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // cargar la conexion con la base de datos
            String url = "jdbc:mysql://localhost:3306/bd_ins";
            String usuario = "root";
            String contraseña = "";
            conn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("conexion exitosa a la BD");
        } catch (SQLException ex) {
            System.out.println("conexion erronea a la BD" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el controlador" + ex.getMessage());
        }
        return conn;
    }
}
