package cl.duoc.msintegracionusuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegracionusuarios.model.dto.UsuariosDTO;
import cl.duoc.msintegracionusuarios.service.UserService;

@RestController
@RequestMapping("/usuarios-db")
public class UsuariosController {
    @Autowired
    UserService userService;
    
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<UsuariosDTO> findAll(){
        return userService.obtenerTodosLosUsuarios();
    }
}
