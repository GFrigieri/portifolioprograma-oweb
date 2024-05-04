package br.com.programacaoweb.crud.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.programacaoweb.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
