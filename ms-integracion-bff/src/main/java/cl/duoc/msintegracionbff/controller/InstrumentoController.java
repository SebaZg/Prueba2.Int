package cl.duoc.msintegracionbff.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegracionbff.model.dto.InstrumentoDTO;
import cl.duoc.msintegracionbff.service.InstrumentoService;

@RestController
@RequestMapping("/instrumentos-bff")
public class InstrumentoController {
    @Autowired
    InstrumentoService instrumentoService;

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll(){
        return instrumentoService.obtenerTodosLosInstrumentos();
    }
    
}
