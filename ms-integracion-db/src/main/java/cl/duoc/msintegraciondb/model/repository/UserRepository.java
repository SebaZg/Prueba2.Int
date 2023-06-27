package cl.duoc.msintegraciondb.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msintegraciondb.model.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
}
