package cl.musicpro.bff_service_sale.model.dto;

import lombok.Data;

@Data
public class CommonResponseDTO {
    private String responseCode;
    private String responseMessage;
    private Object data;
}
