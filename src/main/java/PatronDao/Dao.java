package PatronDao;

import java.util.List;

public interface Dao<T> {
	void insertar(T a);

	void modificar(T a);

	void eliminar(T a);

	List<T> obtenerTodos();

	T obtener(int id);
}