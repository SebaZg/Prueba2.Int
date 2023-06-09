package cl.duoc.msintegraciondb.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private int    idUsuario;

    @Basic
    @Column (name = "nombre")
    private String nombre;

    @Basic
    @Column (name = "rut")
    private String rut;

    @Basic
    @Column(name = "id_login")
    private int idUsuario;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_login", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Login loginByLoginIdFk;
    
}