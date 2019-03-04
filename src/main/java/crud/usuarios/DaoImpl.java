package crud.usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.manolito.entidades.Usuario;


public class DaoImpl implements Dao {

	public DaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void create(Usuario usuario) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("El driver no se encuentra");
			System.exit(-1);
		}

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ALVARO", "alvaro123");
			String sqlDas= "SELECT MAX(DAS) FROM PROYECTO.USUARIOS";
			//int das = Integer.parseInt(sqlDas);
			
			String insert = "INSERT INTO USUARIOS (DAS, NOMBRE, APELLIDOS, PASSWORD, ROL, PASSCAMBIADA VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sqlDas);
			PreparedStatement ps1 = conn.prepareStatement(insert);
			
			ResultSet rs = ps.executeQuery(sqlDas);
			int das = rs.getInt(1);
			das++;
			ps1.setInt(1, das);
			ps1.setString(2, usuario.getNombre());
			ps1.setString(3, usuario.getApellido());
			ps1.setString(4, usuario.getPassword());
			ps1.setString(5, usuario.getRol());
			ps1.setString(6, usuario.getPasscambiada());
			
			rs.close();
			ps1.executeQuery();
			
		}  catch (SQLException e) {
			System.err.println("Fallo al insertar en bbdd");
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.err.println("Fallo al cerrar la conexion");
				}
			}
		}

	}

	public Usuario read(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
