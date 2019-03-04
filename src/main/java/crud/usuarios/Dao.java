package crud.usuarios;

import java.util.List;

import com.manolito.entidades.Usuario;

/**
 * @author Arranque 1
 *
 */
public interface Dao {

	void create(Usuario usuario);
	Usuario read(String nombreUsuario);
	
	void update(Usuario usuario);
	void delete(Usuario usuario);
	
	List<Usuario> readAll();
	
}
