package homework_17.service;

import java.util.List;

public interface UnivercityService {
	Univercity save(Univercity univercity);

	Univercity findById(Long id);

	Univercity update(Univercity univercity);

	void deleteById(Long id);

	List<Univercity> findAll();

}
