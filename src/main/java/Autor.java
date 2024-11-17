
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Libro> libros = new ArrayList<>();

	// Constructor vacío (requerido por JPA)
	public Autor() {
	}

	// Constructor con parámetros
	public Autor(String nombre) {
		this.nombre = nombre;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	// Métodos adicionales

	// Agregar un libro al autor
	public void agregarLibro(Libro libro) {
		libros.add(libro);
		libro.setAutor(this); // Vincula el libro con el autor
	}

	// Eliminar un libro del autor
	public void eliminarLibro(Libro libro) {
		libros.remove(libro);
		libro.setAutor(null); // Desvincula el libro del autor
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Autor{" + "id=" + id + ", nombre='" + nombre + '\'' + ", libros=" + libros.size() + '}';
	}
}
