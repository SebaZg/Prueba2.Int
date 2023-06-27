package cl.duoc.msintegraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msintegraciondb.model.entities.Usercategoria;
public interface UserCategoriaRepository extends JpaRepository<Usercategoria, Integer>  { 
    
}
