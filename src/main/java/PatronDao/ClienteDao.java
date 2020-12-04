package PatronDao;

import java.util.List;

public interface ClienteDao<T, E> {
	void insertar(T a);

	void modificar(T a);

	void eliminar(T a);

	List<T> obtenerTodos();

	T obtener(E id);
}