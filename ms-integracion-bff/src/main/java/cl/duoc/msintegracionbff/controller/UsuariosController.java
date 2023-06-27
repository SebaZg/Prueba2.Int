package cl.duoc.msintegracionbff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegracionbff.model.dto.UsuariosDTO;
import cl.duoc.msintegracionbff.service.UsuariosService;

@RestController
@RequestMapping("/Usuarios-bff")
public class UsuariosController {
    @Autowired
    UsuariosService usuariosService;

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<UsuariosDTO> findAll(){
        return usuariosService.obtenerTodosLosUsuariosD();
    }
    
}
