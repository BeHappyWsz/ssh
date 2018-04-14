package ssh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssh.dao.UserDao;
import ssh.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findById(Long id) {
		return userDao.findById(id);
	}
}
