package cl.duoc.msintegracionproductos.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.msintegracionproductos.model.dto.InstrumentoDTO;

@FeignClient(name = "svc-instruments-db", url = "http://localhost:8282/instrumentos-db")
public interface IntrumentosDbFeingClient {
    
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll();
}  
 