package pw.entrance.seed.dao;

import pw.entrance.seed.domain.Users;

public interface UsersDao {
	public Users findByName(String name);
}
