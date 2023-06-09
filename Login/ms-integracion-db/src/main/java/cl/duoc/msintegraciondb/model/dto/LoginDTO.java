package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTO {
    @JsonProperty("login_id")
    private int id;
    @JsonProperty("login_name")
    private String nombre;  
}