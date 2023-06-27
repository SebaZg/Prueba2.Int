package cl.duoc.msintegracionbff.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class UsuariosDTO {
    private int idUser;
    private String nombre;
    private String email;
    private String contraseña;
    @JsonProperty("Tipo_Usuario")
    private CategoriaDTO categoria;
    
}
