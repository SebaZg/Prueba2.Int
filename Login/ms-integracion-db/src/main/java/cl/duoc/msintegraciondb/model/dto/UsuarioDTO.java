package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {

    private int idUsuario;
    private String nombre;
    private String rut;
    @JsonProperty("login_usuario")
    private LoginDTO login;
    
}