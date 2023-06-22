package cl.musicpro.bd_service_sale.model.entities;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(schema= "musicpro2023", name="sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "saleId")
    private int saleId;

    @Basic
    @Column(name= "amount")
    private int amount;

    @Basic
    @Column(name= "saleDate")
    private String saleDate;




}
