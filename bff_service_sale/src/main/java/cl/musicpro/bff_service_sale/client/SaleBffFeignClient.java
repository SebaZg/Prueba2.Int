package cl.musicpro.bff_service_sale.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cl.musicpro.bff_service_sale.model.dto.CommonResponseDTO;

@FeignClient(name="bff-sale-svc",url="http://localhost:8585/sale-svc")
public interface SaleBffFeignClient {

    @GetMapping(path="/sales", produces=MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getSales();

    @PostMapping(path="/sale", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>addSale();
    
}
