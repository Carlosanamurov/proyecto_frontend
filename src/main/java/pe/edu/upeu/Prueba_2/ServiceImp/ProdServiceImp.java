package pe.edu.upeu.Prueba_2.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Prueba_2.Dao.ProdDao;
import pe.edu.upeu.Prueba_2.Entity.Producto;
import pe.edu.upeu.Prueba_2.Service.ProdService;

@Service
public class ProdServiceImp implements ProdService {
	@Autowired
	private ProdDao prodDao;
	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return prodDao.readAll();
	}

	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		return prodDao.create(producto);
	}

	@Override
	public int edit(Producto producto) {
		// TODO Auto-generated method stub
		return prodDao.edit(producto);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prodDao.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return prodDao.read(id);
	}

}
