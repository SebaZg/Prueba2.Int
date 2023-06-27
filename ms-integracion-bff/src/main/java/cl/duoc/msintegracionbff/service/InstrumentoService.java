package cl.duoc.msintegracionbff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionbff.client.InstrumentosSvcFeignClient;
import cl.duoc.msintegracionbff.model.dto.InstrumentoDTO;


@Service

public class InstrumentoService {
    @Autowired
    InstrumentosSvcFeignClient instrumentosSvcFeignClient;

    public List<InstrumentoDTO> obtenerTodosLosInstrumentos(){
        return instrumentosSvcFeignClient.findAll();
    } 
}

