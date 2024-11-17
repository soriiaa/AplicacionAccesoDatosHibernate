
package repository;

import model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
s
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Puedes agregar métodos personalizados si lo necesitas
}
