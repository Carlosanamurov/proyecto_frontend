package pe.edu.upeu.Prueba_2.Daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Prueba_2.Dao.UsersDao;
import pe.edu.upeu.Prueba_2.Entity.Users;
@Repository
public class UsersDaoimp implements  UsersDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Users> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM USUARIO", BeanPropertyRowMapper.newInstance(Users.class));
	}

	@Override
	public int create(Users user) {
		// TODO Auto-generated method stub
		String sql= "INSERT INTO USUARIO (nomuser,clave) VALUES (?,?)";
		return jdbcTemplate.update(sql, new Object[] {user.getNomuser(),user.getClave()});
	}

	@Override
	public int edit(Users user) {
		// TODO Auto-generated method stub
		String  sql= "UPDATE USUARIO SET nomuser= ?,clave =? WHERE (idusuario=?);";
		return jdbcTemplate.update(sql,user.getNomuser(),user.getClave(),user.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM USUARIO WHERE (idusuario=?)";
		return jdbcTemplate.update(sql,new Object[] {id});
	}

	@Override
	public Users read(int id) {
		// TODO Auto-generated method stub
		String sql= "SELECT * FROM USUARIO WHERE idusuario=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id},BeanPropertyRowMapper.newInstance(Users.class));
	}

}
