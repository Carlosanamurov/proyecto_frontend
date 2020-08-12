package pe.edu.upeu.Prueba_2.Dao;

import java.util.List;

import pe.edu.upeu.Prueba_2.Entity.Users;

public interface UsersDao {
	List<Users> readAll();
	int create (Users user);
	int edit(Users user);
	int delete(int id);
	Users read(int id);

}
