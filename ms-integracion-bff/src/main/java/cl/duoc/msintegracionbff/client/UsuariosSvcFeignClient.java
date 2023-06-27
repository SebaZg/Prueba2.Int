package cl.duoc.msintegracionbff.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.msintegracionbff.model.dto.InstrumentoDTO;


@FeignClient(name = "svc-Usuarios-svc", url = "http://localhost:8282/usuarios-db")
public interface UsuariosSvcFeignClient {

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll();

}