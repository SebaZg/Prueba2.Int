package cl.duoc.msintegraciondb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegraciondb.model.dto.UserDTO;
import cl.duoc.msintegraciondb.model.entities.User;
import cl.duoc.msintegraciondb.model.repository.UserCategoriaRepository;
import cl.duoc.msintegraciondb.model.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserCategoriaRepository userCategoriaRepository;

    public String getSaludo(){
        return "saludo desde ms-integracion-usuario-db";
    }

    public List<UserDTO> obtenertodosLosUsuarios(){
        List<UserDTO> listaUsuarios = new ArrayList<>();

        for(User user : userRepository.findAll()){
            UserDTO userDTO = new UserDTO();
            userDTO.setIdUser(userDTO.getIdUser());
            userDTO.setNombre(userDTO.getNombre());
            userDTO.setEmail(userDTO.getEmail());
            userDTO.setContraseña(userDTO.getContraseña());
            userDTO.setCategoria(userDTO.getCategoria());

            listaUsuarios.add(userDTO);
        }

        return listaUsuarios;
    }
    
}
