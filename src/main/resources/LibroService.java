
package service;

import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LibroRepository;

import java.util.List;

@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;

	// Crear un libro
	public Libro guardarLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	// Obtener todos los libros
	public List<Libro> obtenerTodos() {
		return libroRepository.findAll();
	}

	// Obtener un libro por ID
	public Libro obtenerPorId(Long id) {
		return libroRepository.findById(id).orElse(null);
	}

	// Eliminar un libro
	public void eliminarLibro(Long id) {
		libroRepository.deleteById(id);
	}
}
