package homework_5.service;

import homework_5.domain.User;
import homework_5.shared.AbstractCRUD;

public interface UserService extends   AbstractCRUD<User> {
	User getUserByEmail(String email);
}
