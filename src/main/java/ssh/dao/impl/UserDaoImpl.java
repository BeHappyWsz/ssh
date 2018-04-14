package ssh.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ssh.dao.UserDao;
import ssh.dao.base.BaseDaoImpl;
import ssh.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{
	
	public User findById(Long id) {
		String sql = "select * from t_user u where u.id = ?";
		RowMapper<User> mapper = new BeanPropertyRowMapper<User>(User.class);
		User user = this.getJdbcTemplate().queryForObject(sql, mapper, id);
		return user;
	}

}
