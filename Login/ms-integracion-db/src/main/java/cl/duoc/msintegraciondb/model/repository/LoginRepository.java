package cl.duoc.msintegraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msintegraciondb.model.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
    
}
