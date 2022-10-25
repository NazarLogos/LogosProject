package homework_17.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnivercityServiceImpl implements UnivercityService {

	@Autowired
	private UnivercityRepository univercityRepository;

	@Override
	public Univercity save(Univercity univercity) {

		return univercityRepository.saveAndFlush(univercity);
	}

//	@SuppressWarnings("deprecation")
	@Override
	public Univercity findById(Long id) {
		return univercityRepository.getReferenceById(id);
	}

	@Override
	public Univercity update(Univercity univercity) {
		return univercityRepository.save(univercity);
	}

	@Override
	public void deleteById(Long id) {
		univercityRepository.deleteById(id);
	}

	@Override
	public List<Univercity> findAll() {
		return univercityRepository.findAll();
	}

}
