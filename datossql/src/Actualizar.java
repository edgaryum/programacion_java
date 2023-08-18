import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar {
    public static void actualizar(int id, String nombre, String curso) {
        // crear la conexion con la base de datos
        Connection conn = Conexion.conectar();

        try {
            // preparar la consulta sql parametrizada
            String sql = "UPDATE alumnos SET nombre =?, curso =? WHERE ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // establecer los valores de los parametros
            stmt.setString(1, nombre);
            stmt.setString(2, curso);
            stmt.setInt(3, id);

            int rowsUpdate = stmt.executeUpdate();
            if (rowsUpdate > 0) {
                System.out.println("se actualizo correctamente el registro con ID: " + id);
            } else {
                System.out.println("no se encontro ningun registro con ID: " + id);
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
