package cl.duoc.msintegracionproductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionproductos.client.IntrumentosDbFeingClient;
import cl.duoc.msintegracionproductos.model.dto.InstrumentoDTO;

@Service
public class InstrumentoService {
    
    @Autowired
    IntrumentosDbFeingClient instrumentosDbFeignClient;

    public List<InstrumentoDTO> obtenerTodosLosInstrumentos(){
        return instrumentosDbFeignClient.findAll();
    }
}
 