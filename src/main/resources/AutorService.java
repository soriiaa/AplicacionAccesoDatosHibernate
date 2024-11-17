
package service;

import model.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AutorRepository;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    // Crear un autor
    public Autor guardarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    // Obtener todos los autores
    public List<Autor> obtenerTodos() {
        return autorRepository.findAll();
    }

    // Obtener un autor por ID
    public Autor obtenerPorId(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    // Eliminar un autor
    public void eliminarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
