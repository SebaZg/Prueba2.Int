package cl.duoc.msintegraciondb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegraciondb.model.dto.CommonResponseDTO;
import cl.duoc.msintegraciondb.model.dto.UsuarioDTO;
import cl.duoc.msintegraciondb.service.UsuarioService;
import lombok.extern.log4j.Log4j2;


@Log4j2
@RestController
@RequestMapping("/usuarios-db")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping(path = "/health-check", produces = { "application/json" })
    public String healthCheck(){
        return "OK";
    }

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public CommonResponseDTO findAll() {
        return usuarioService.obtenerTodosLosUsuarios();
    }
    
    @PostMapping(path = "/usuario", produces = {"application/json"} , consumes = {"application/json"})
    public ResponseEntity<CommonResponseDTO> createUsuario(@RequestHeader("x-country") String xCountry,
                                                               @RequestHeader("x-channel") String xChannel,
                                                               @RequestBody UsuarioDTO usuarioDTO){
        log.info("x-country: "+xCountry);  
        log.info("x-channel: "+xChannel);                                                      
        log.info("[createUsuario] Request: "+usuarioDTO.toString());
        return usuarioService.crearUsuario(usuarioDTO);
    }