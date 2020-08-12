package pe.edu.upeu.Prueba_2.Daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.Prueba_2.Dao.ProdDao;
import pe.edu.upeu.Prueba_2.Entity.Producto;

@RestController
public class ProdDaoImp implements ProdDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override 
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM PRODUCTO", BeanPropertyRowMapper.newInstance(Producto.class));
	}

	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO PRODUCTO ( codprod, nomProducto,precio,familia) values(?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {producto.getCodprod(),producto.getNomProducto(),producto.getPrecio(),producto.getFamilia()});
	}

	@Override
	public int edit(Producto producto) {
		// TODO Auto-generated method stub
		String sql="UPDATE PRODUCTO SET codprod=?, nomProducto=?,precio=?,familia=? WHERE(idProd=?)";
		return jdbcTemplate.update(sql,producto.getCodprod(),producto.getNomProducto(),producto.getPrecio(),producto.getFamilia(),producto.getIdProd());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql= "DELETE FROM PRODUCTO WHERE(idProd=?)";
		return jdbcTemplate.update(sql,new Object[] {id});
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		String sql="SELECT FROM PRODUCTO WHERE(idProd=?)";
		return jdbcTemplate.queryForObject(sql,new Object[] {id},BeanPropertyRowMapper.newInstance(Producto.class));
	}
	

}
