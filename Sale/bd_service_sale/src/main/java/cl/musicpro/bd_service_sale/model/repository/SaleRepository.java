package cl.musicpro.bd_service_sale.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.musicpro.bd_service_sale.model.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Integer>{
    
}
