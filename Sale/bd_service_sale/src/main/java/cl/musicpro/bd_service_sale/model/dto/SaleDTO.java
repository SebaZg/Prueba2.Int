package cl.musicpro.bd_service_sale.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleDTO {
    @JsonProperty("id_venta")
    private int saleId;
    @JsonProperty("monto")
    private int amount;
    @JsonProperty("fecha_venta")
    private String saleDate;
}
