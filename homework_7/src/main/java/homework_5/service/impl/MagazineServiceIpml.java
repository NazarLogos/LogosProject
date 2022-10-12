package homework_5.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import homework_5.dao.MagazineDao;
import homework_5.dao.impl.MagazineDaoImpl;
import homework_5.domain.Magazine;
import homework_5.service.MagazineService;

public class MagazineServiceIpml implements MagazineService {
	
	private static Logger LOGGER = Logger.getLogger(MagazineServiceIpml.class);
	private static MagazineService magazineServiceIpml;
	private MagazineDao magazineDao;

	public void MagazineServiceImpl() {

		try {
			magazineDao = new MagazineDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			LOGGER.error(e);
		}

	}
	public static MagazineService getMagazineService() {
		if (magazineServiceIpml == null) {
			magazineServiceIpml = new MagazineServiceIpml();
		}

		return magazineServiceIpml ;
	}

	@Override
	public Magazine create(Magazine t) {
		return magazineDao.create(t);
	}

	@Override
	public Magazine read(Integer id) {
		return magazineDao.read(id);
	}

	@Override
	public Magazine update(Magazine t) {
		return magazineDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		magazineDao.delete(id);

	}

	@Override
	public List<Magazine> readAll() {
		return magazineDao.readAll();
	}

}
