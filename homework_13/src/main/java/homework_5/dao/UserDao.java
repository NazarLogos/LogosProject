package homework_5.dao;

import homework_5.domain.User;
import homework_5.shared.AbstractCRUD;

public interface UserDao extends AbstractCRUD<User> {
	User getUserByEmail(String email);
}
