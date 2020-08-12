package pe.edu.upeu.Prueba_2.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Prueba_2.Dao.UsersDao;
import pe.edu.upeu.Prueba_2.Entity.Users;
import pe.edu.upeu.Prueba_2.Service.UsersService;

@Service
public class UsersServiceImp implements UsersService {
	@Autowired
	private  UsersDao usuariodao;
	@Override
	public List<Users> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}

	@Override
	public int create(Users user) {
		// TODO Auto-generated method stub
		return usuariodao.create(user);
	}

	@Override
	public int edit(Users user) {
		// TODO Auto-generated method stub
		return usuariodao.edit(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Users read(int id) {
		// TODO Auto-generated method stub
		return usuariodao.read(id);
	}

	
	

}
