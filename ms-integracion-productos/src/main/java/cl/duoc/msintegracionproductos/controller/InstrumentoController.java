package cl.duoc.msintegracionproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegracionproductos.model.dto.InstrumentoDTO;
import cl.duoc.msintegracionproductos.service.InstrumentoService;

@RestController
@RequestMapping("/instrumentos-svc")
public class InstrumentoController {
    
    @Autowired
    InstrumentoService instrumentoService;
    
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll(){
        return instrumentoService.obtenerTodosLosInstrumentos();
    }
}

