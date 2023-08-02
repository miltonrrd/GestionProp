package com.mrd.GestionPropiedades.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "propiedad")
public class Propiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "precio")
    private double precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "m2")
    private float m2;

    @Column(name = "banos")
    private int banos;

    @Column(name = "habitaciones")
    private int habitaciones;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "estado")
    private String estado;

    @Column(name = "disponible")
    private Boolean disponible;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name ="id_galeria")
    private Galeria galeria;

    @Column(columnDefinition = "DATETIME", name = "fecha_alta", updatable = false, nullable = false)
    private Date fechaAlta;

    @Column(columnDefinition = "DATETIME", name = "fecha_baja", updatable = false, nullable = false)
    private Date fechaBaja;

}
