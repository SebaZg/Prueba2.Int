package cl.duoc.msintegraciondb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegraciondb.model.dto.LoginDTO;
import cl.duoc.msintegraciondb.model.entities.Login;
import cl.duoc.msintegraciondb.model.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public LoginDTO getLoginById(int idLogin){      
        Login login = loginRepository.getReferenceById(idLogin);

        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setId(login.getId());
        loginDTO.setNombre(login.getNombre());
        
        return loginDTO;
    }
    
}