package cl.duoc.msintegraciondb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegraciondb.model.dto.UserCategoriaDTO;
import cl.duoc.msintegraciondb.model.entities.Usercategoria;
import cl.duoc.msintegraciondb.model.repository.UserCategoriaRepository;

@Service
public class UserCategoriaService {

    @Autowired
    UserCategoriaRepository userCategoriaRepository;

    public UserCategoriaDTO getUserCategoriaById(int idCategoria){
        Usercategoria usercategoria = userCategoriaRepository.getReferenceById(idCategoria);

        UserCategoriaDTO userCategoriaDTO = new UserCategoriaDTO();
        userCategoriaDTO.setId(userCategoriaDTO.getId());
        userCategoriaDTO.setNombre(userCategoriaDTO.getNombre());

        return userCategoriaDTO;
    }


    
}


 