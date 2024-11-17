
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;

	private int añoPublicacion;

	private String estado;

	@ManyToOne
	@JoinColumn(name = "autor_id", nullable = false)
	private Autor autor;

	// Constructor vacío (requerido por JPA)
	public Libro() {
	}

	// Constructor con parámetros
	public Libro(String titulo, int añoPublicacion, String estado, Autor autor) {
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.estado = estado;
		this.autor = autor;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Libro{" + "id=" + id + ", titulo='" + titulo + '\'' + ", añoPublicacion=" + añoPublicacion
				+ ", estado='" + estado + '\'' + ", autor=" + (autor != null ? autor.getNombre() : "Sin Autor") + '}';
	}
}
