package homework_16.mainApp;

import java.util.List;

public interface StudentDao<T> {

	T create();

	T read(Integer id);

	T update(T t);

	void delete(Integer id);
	
	List<T> readAll();
}
