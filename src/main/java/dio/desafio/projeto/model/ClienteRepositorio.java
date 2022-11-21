package dio.desafio.projeto.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepositorio extends CrudRepository <Cliente, Long> {

    Optional<Cliente> findByEmail(String email);
}
