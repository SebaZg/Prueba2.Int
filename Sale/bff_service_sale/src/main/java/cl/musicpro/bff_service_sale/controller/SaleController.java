package cl.musicpro.bff_service_sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.musicpro.bff_service_sale.model.dto.CommonResponseDTO;
import cl.musicpro.bff_service_sale.model.dto.SaleDTO;
import cl.musicpro.bff_service_sale.service.SaleService;

public class SaleController {
    @Autowired
    SaleService saleService;

    @GetMapping(path="/sales", produces= MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getAll(){
        return saleService.getSales();
    }

    @PostMapping(path="/sale", produces= MediaType.APPLICATION_JSON_VALUE, consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>addSale(@RequestBody SaleDTO saleDTO){
        return saleService.addSale();
    }
}
