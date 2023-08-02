package com.mrd.GestionPropiedades.Models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name ="galeria")
public class Galeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;
}
