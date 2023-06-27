package cl.duoc.msintegracionbff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.msintegracionbff.model.dto.CommonResponseDTO;
import cl.duoc.msintegracionbff.model.dto.SaleDTO;
import cl.duoc.msintegracionbff.service.SaleService;

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
