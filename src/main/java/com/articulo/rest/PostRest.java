package com.articulo.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.articulo.dao.PostDAO;
import com.articulo.model.Post;


@RestController
@RequestMapping("post")
public class PostRest {
	
	@Autowired
	private PostDAO postDAO;
	
	
	// Metodos http servidor
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Post post) {
		
		postDAO.save(post);
	}
	
	@GetMapping("/listar")
	public List<Post> listar () {
		return postDAO.findAll();	
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		postDAO.deleteById(id);
	
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Post post) {
		
		postDAO.save(post);
	}

}
