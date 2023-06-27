package cl.duoc.msintegracionbff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionbff.model.dto.UsuariosDTO;
import cl.duoc.msintegracionbff.client.UsuariosSvcFeignClient;

@Service
public class UsuariosService {
	@Autowired
    UsuariosSvcFeignClient usuariosSvcFeignClient;

    public List<UsuariosDTO> obtenerTodosLosUsuariosD(){
        return usuariosSvcFeignClient.findAll();
    }
}