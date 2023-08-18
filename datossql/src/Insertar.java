import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar {
    public static void insertar(String nombre, String curso) {
        // crear la conexion con la base de datos
        Connection conn = Conexion.conectar();

        try {
            // preparar la consulta sql parametrizada
            String sql = "INSERT INTO alumnos (nombre, curso) VALUES(?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // establecer los valores de los parametros
            stmt.setString(1, nombre);
            stmt.setString(2, curso);

            // ejecutar la consulta
            stmt.executeUpdate();
            System.out.println("Registro insertado correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al insertar el registro" + ex.getMessage());
        } finally {
            try {
                // cerrar la conexion
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion" + ex.getMessage());
            }
        }
    }

}
