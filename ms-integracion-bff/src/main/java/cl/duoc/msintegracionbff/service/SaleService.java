package cl.duoc.msintegracionbff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionbff.client.Service_SaleSvsFeingClient;
import cl.duoc.msintegracionbff.model.dto.CommonResponseDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SaleService {
    @Autowired
    Service_SaleSvsFeingClient service_SaleSvsFeingClient;

    public CommonResponseDTO getSales(){
        log.info("Request cl.musicpro.bff_service_sale[getSales]");
        log.info("[getSales] Response: "+service_SaleSvsFeingClient.getSales().toString());
        return service_SaleSvsFeingClient.getSales();
    }

    public ResponseEntity<CommonResponseDTO>addSale(){
        log.info("Request cl.musicpro.svc_service_sale[addSale]");
        log.info("[addSale] Response: "+service_SaleSvsFeingClient.addSale().toString());
        return service_SaleSvsFeingClient.addSale();
    }
}
