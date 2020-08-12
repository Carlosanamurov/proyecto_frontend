package pe.edu.upeu.Prueba_2.Service;

import java.util.List;

import pe.edu.upeu.Prueba_2.Entity.Users;

public interface UsersService {
	List<Users> readAll();
	int create (Users users);
	int edit(Users users);
	int delete(int id);
	Users read(int id);

}
