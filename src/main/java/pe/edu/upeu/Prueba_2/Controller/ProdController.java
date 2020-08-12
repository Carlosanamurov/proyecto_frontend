package pe.edu.upeu.Prueba_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.Prueba_2.Entity.Producto;
import pe.edu.upeu.Prueba_2.Service.ProdService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/productos")
public class ProdController {
	@Autowired
	private ProdService prodService;
	@GetMapping({"/productoall"})
	public List<Producto> readList(){
		return  prodService.readAll();
	}
	@GetMapping("/productos{id}")
	public Producto read(@PathVariable int id) {
		return prodService.read(id);
	}
	@PostMapping("/newproducto")
	public int create(@RequestBody Producto producto) {
		return prodService.create(producto);
	}
	@DeleteMapping("/delete{id}")
	public int del(@PathVariable int id) {
		return prodService.delete(id);
	}
	@PutMapping("/editproducto/{id}")
	public int edit(@RequestBody Producto producto, @PathVariable int id) {
		return prodService.edit(producto);
	}

}
