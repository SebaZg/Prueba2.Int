package cl.musicpro.bd_service_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.bd_service_sale.model.dto.CommonResponseDTO;
import cl.musicpro.bd_service_sale.model.dto.SaleDTO;
import cl.musicpro.bd_service_sale.service.SaleService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/sale-db")
public class SaleController {
    @Autowired
    SaleService saleService;

    @GetMapping(path="/sales", produces= MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getAll(){
        log.info("cl.musicpro.bd_service_sale.controller Request:[getAll]");
        return saleService.getSales();
    }

    @PostMapping(path="/sale", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>addSale(@RequestBody SaleDTO saleDTO){
        log.info("[addSale]Request: "+saleDTO.toString());
        return saleService.addSale(saleDTO);
    }

    
}
