package cl.duoc.msintegracionbff.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class InstrumentoDTO {
    
    @JsonProperty("idInstrumento")
    private int id;
    private String nombre;
    private String marca;
    @JsonProperty("categoria_instrumento")
    private CategoriaDTO categoria;
}
