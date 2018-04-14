package ssh.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * 1.extends HibernateDaoSupport:ע��ʧ��ʱ�������ļ������default-autowire="byName"
 * 2.autowired JdbcTemplate
 * @author wsz
 * @date 2018��4��14��
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
