import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Borrar {
    public static void eliminar(int id) {
        // conexion a la base de datos
        Connection conn = Conexion.conectar();
        // eliminar
        try {
            // preparar la consulta
            String sql = "DELETE FROM alumnos WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            // establecer lo valores de los parametros
            stmt.setInt(1, id);
            int rowsUpdate = stmt.executeUpdate();
            if (rowsUpdate > 0) {
                System.out.println("se elimino correctamente el registro con ID: " + id);
            } else {
                System.out.println("no se encontro ningun registro con ID: " + id);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
