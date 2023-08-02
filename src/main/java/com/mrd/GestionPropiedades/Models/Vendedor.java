package com.mrd.GestionPropiedades.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Data
@Table(name ="vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "dni")
    private String dni;

    @Column(columnDefinition = "DATETIME", name = "fecha_alta", updatable = false, nullable = false)
    private LocalDate fechaAlta;

    @Column(columnDefinition = "DATETIME", name = "fecha_baja", updatable = false, nullable = false)
    private Date fechaBaja;
}
