package cl.musicpro.svc_service_sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.musicpro.svc_service_sale.client.SaleSvcFeignClient;
import cl.musicpro.svc_service_sale.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SaleService {
    @Autowired
    SaleSvcFeignClient saleSvcFeignClient;

    public CommonResponseDTO getSales(){
        log.info("Request cl.musicpro.svc_service_sale[getSales]");
        log.info("[getSales] Response: "+saleSvcFeignClient.getSales().toString());
        return saleSvcFeignClient.getSales();
    }

    public ResponseEntity<CommonResponseDTO>addSale(){
        log.info("Request cl.musicpro.svc_service_sale[addSale]");
        log.info("[addSale] Response: "+saleSvcFeignClient.addSale().toString());
        return saleSvcFeignClient.addSale();
    }
}
