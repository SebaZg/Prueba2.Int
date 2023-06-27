package cl.duoc.msintegraciondb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegraciondb.model.dto.UserDTO;
import cl.duoc.msintegraciondb.service.UserService;

@RestController
@RequestMapping("/usuarios-db")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/health-check", produces = { "application/json" })
    public String healthCheck(){
        return "OK";
    }

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<UserDTO> findAll() {
        return userService.obtenertodosLosUsuarios();
    }
     
}
