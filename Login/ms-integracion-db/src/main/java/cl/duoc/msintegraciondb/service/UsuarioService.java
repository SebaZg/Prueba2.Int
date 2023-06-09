package cl.duoc.msintegraciondb.service;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.duoc.msintegraciondb.model.dto.CommonResponseDTO;
import cl.duoc.msintegraciondb.model.dto.UsuarioDTO;
import cl.duoc.msintegraciondb.model.entities.Usuario;
import cl.duoc.msintegraciondb.model.repository.UsuarioRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;
    
    public String getSaludo(){
        return "saludo desde ms-integracion-db";
    }

    public CommonResponseDTO obtenerTodosLosUsuarios(){
        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();
    
        log.info("Request cl.duoc.msintegraciondb.service.UsuarioService[obtenerTodosLosUsuarios]");
        
        List<UsuarioDTO> listaUsuarios = new ArrayList<>();

        for(Usuario usuario : usuarioRepository.findAll()){
            UsuarioDTO usuarioDTO = new UsuarioDTO();
            UsuarioDTO.setIdUsuario(usuario.getIdUsuario());
            UsuarioDTO.setNombre(usuario.getNombre());
            UsuarioDTO.setRut(usuario.getRut());           
            UsuarioDTO.setLogin(loginService.getLoginById(usuario.getIdLogin()));

            listaUsuarios.add(usuarioDTO);
        }

        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("OK");
        commonResponseDTO.setData(listaUsuarios);

        log.info("[obtenerTodosLosUsuarios] Response: "+commonResponseDTO.toString());
        return commonResponseDTO;
     
    }

    public ResponseEntity<CommonResponseDTO> crearUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setRut(usuarioDTO.getRut());
        usuario.setIdLogin(usuarioDTO.getLogin().getId());

        Usuario newUsuario = usuarioRepository.save(usuario);

        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();
        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("OK");
        commonResponseDTO.setData(newInstrumento);

        return new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);
    }
  
}
