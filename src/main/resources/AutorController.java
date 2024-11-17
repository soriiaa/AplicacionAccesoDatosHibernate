package controller;

import model.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AutorService;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private AutorService autorService;

	@PostMapping
	public Autor agregarAutor(@RequestBody Autor autor) {
		return autorService.guardarAutor(autor);
	}

	@GetMapping
	public List<Autor> listarAutores() {
		return autorService.obtenerTodos();
	}

	@GetMapping("/{id}")
	public Autor obtenerAutorPorId(@PathVariable Long id) {
		return autorService.obtenerPorId(id);
	}

	@DeleteMapping("/{id}")
	public void eliminarAutor(@PathVariable Long id) {
		autorService.eliminarAutor(id);
	}
}
