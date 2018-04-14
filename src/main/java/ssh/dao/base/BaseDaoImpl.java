package ssh.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * 1.extends HibernateDaoSupport:注入失败时，配置文件中添加default-autowire="byName"
 * 2.autowired JdbcTemplate
 * @author wsz
 * @date 2018年4月14日
 */
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
