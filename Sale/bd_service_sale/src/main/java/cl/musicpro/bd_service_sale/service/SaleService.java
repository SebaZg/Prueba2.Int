package cl.musicpro.bd_service_sale.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cl.musicpro.bd_service_sale.model.dto.CommonResponseDTO;
import cl.musicpro.bd_service_sale.model.dto.SaleDTO;
import cl.musicpro.bd_service_sale.model.entities.Sale;
import cl.musicpro.bd_service_sale.model.repository.SaleRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public CommonResponseDTO getSales(){
        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();
        log.info("Request cl.musicpro.bd_service_sale.service.SaleService[getSales]");

        List<SaleDTO> listaVenta = new ArrayList<>();

        for (Sale sale: saleRepository.findAll()){
            SaleDTO saleDTO = new SaleDTO();

            saleDTO.setSaleId(sale.getSaleId());
            saleDTO.setAmount(sale.getAmount());
            saleDTO.setSaleDate(sale.getSaleDate());

            listaVenta.add(saleDTO);
        }
        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("OK");
        commonResponseDTO.setData(listaVenta);
        log.info("[getSales] Response: "+commonResponseDTO.toString());
        return commonResponseDTO; 
    }

    public ResponseEntity<CommonResponseDTO> addSale(SaleDTO saleDTO){
        Sale sale = new Sale();

        saleDTO.setAmount(sale.getAmount());
        saleDTO.setSaleDate(sale.getSaleDate());

        Sale newSale = saleRepository.save(sale);

        CommonResponseDTO commonResponseDTO = new CommonResponseDTO();
        commonResponseDTO.setResponseCode("200");
        commonResponseDTO.setResponseMessage("OK");
        commonResponseDTO.setData(newSale);

        return new ResponseEntity<CommonResponseDTO>(commonResponseDTO, HttpStatus.OK);


    }


        

}
