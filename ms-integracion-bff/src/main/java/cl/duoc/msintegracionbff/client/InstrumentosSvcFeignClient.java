package cl.duoc.msintegracionbff.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.msintegracionbff.model.dto.InstrumentoDTO;


@FeignClient(name = "svc-instruments-svc", url = "http://localhost:8181/instrumentos-svc")
public interface InstrumentosSvcFeignClient {

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll();

}
