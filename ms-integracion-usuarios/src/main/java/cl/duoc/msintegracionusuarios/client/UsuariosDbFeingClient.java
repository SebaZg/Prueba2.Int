package cl.duoc.msintegracionusuarios.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.msintegracionusuarios.model.dto.UsuariosDTO;

@FeignClient(name = "svc-Usuarios-db", url = "http://localhost:8282/usuarios-db")
public interface UsuariosDbFeingClient {
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<UsuariosDTO> findAll();
}
    