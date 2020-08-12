package pe.edu.upeu.Prueba_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.Prueba_2.Entity.Users;
import pe.edu.upeu.Prueba_2.Service.UsersService;

@RestController
public class UsersController {
	 @Autowired
	 private UsersService userService;
	 @GetMapping("/usersall")
	 public List<Users> readList(){
		 return userService.readAll();
	 }
	 @GetMapping("/user/{id}")
	 public Users read(@PathVariable int id) {
		 return userService.read(id);
	 }
	 @PostMapping("/newuser")
	 public int create(@RequestBody Users users) {
		 return userService.create(users);
	 }
	 @DeleteMapping("/delete/{id}")
	 public int del(@PathVariable int id) {
		 return userService.delete(id);
	 }
	 @PutMapping("edit/{id}")
	 public int edit(@RequestBody Users users,@PathVariable int id) {
		 return userService.edit(users);
	 }
}
