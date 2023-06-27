package cl.duoc.msintegracionbff.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class UsuarioCategoriaDTO {
    @JsonProperty("id_categoria")
    private int id;
    @JsonProperty("nombre_categoria")
    private String nombre;
}
