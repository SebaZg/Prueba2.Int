package cl.duoc.msintegraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msintegraciondb.model.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
