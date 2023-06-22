package cl.musicpro.svc_service_sale.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cl.musicpro.svc_service_sale.model.dto.CommonResponseDTO;

@FeignClient(name="svc-sale-db",url="http://localhost:8686/sale-db")
public interface SaleSvcFeignClient {
    
    @GetMapping(path="/sales", produces=MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getSales();

    @PostMapping(path="/sale", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>addSale();
}
