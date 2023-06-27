package cl.duoc.msintegracionusuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.msintegracionusuarios.client.UsuariosDbFeingClient;
import cl.duoc.msintegracionusuarios.model.dto.UsuariosDTO;

@Service
public class UserService {
    @Autowired
    UsuariosDbFeingClient usuariosDbFeingClient;

    public List<UsuariosDTO> obtenerTodosLosUsuarios(){
        return usuariosDbFeingClient.findAll();
    } 
}
