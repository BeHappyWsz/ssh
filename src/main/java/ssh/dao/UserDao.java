package ssh.dao;

import ssh.entity.User;

public interface UserDao {
	
	User findById(Long id);
}
