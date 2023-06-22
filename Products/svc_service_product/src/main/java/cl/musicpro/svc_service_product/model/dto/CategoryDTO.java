package cl.musicpro.svc_service_product.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class CategoryDTO {
    @JsonProperty("category_id")
    private int category_id;
    @JsonProperty("category_name")
    private String name;
}
