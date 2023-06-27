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
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    private int    idUser;

    @Basic
    @Column (name = "nombre")
    private String nombre;

    @Basic
    @Column (name = "email")
    private String email;

    @Basic
    @Column (name = "contraseña")
    private String contraseña;

    @Basic
    @Column(name = "id_categoria")
    private int idCategoria;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_categoria", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Categoria categoriaByCategoriaIdFk;
    
}
