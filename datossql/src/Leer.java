import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Leer {
    public static void leer() {
        // crear la conexion con la base de datos
        Connection conn = Conexion.conectar();

        try {
            // preparar la consulta sql parametrizada
            String sql = "SELECT * FROM alumnos";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Ejecutar la consulta y obtener el resultado
            ResultSet rs = stmt.executeQuery();

            // recorrer el resultado e imprimir los datos
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                System.out.println(id + " - " + nombre + " - " + curso);
            }
        } catch (SQLException ex) {
            System.out.println("Error al leer los registros: " + ex.getMessage());
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