package cl.musicpro.bff_service_sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.musicpro.bff_service_sale.client.SaleBffFeignClient;
import cl.musicpro.bff_service_sale.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SaleService {
    @Autowired
    SaleBffFeignClient saleBffFeignClient;

    public CommonResponseDTO getSales(){
        log.info("Request cl.musicpro.bff_service_sale[getSales]");
        log.info("[getSales] Response: "+saleBffFeignClient.getSales().toString());
        return saleBffFeignClient.getSales();
    }

    public ResponseEntity<CommonResponseDTO>addSale(){
        log.info("Request cl.musicpro.svc_service_sale[addSale]");
        log.info("[addSale] Response: "+saleBffFeignClient.addSale().toString());
        return saleBffFeignClient.addSale();
    }
}
