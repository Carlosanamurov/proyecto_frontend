package pe.edu.upeu.Prueba_2.Dao;

import java.util.List;

import pe.edu.upeu.Prueba_2.Entity.Producto;

public interface ProdDao {
	List<Producto> readAll();
	int create(Producto producto);
	int edit(Producto producto);
	int delete(int id);
	Producto read(int  id);
	

}
