package pe.edu.upeu.Prueba_2.Service;

import java.util.List;

import pe.edu.upeu.Prueba_2.Entity.Producto;

public interface ProdService {
	List<Producto> readAll();
	int create(Producto producto);
	int edit(Producto producto);
	int delete(int  id);
	Producto read(int  id);

}
