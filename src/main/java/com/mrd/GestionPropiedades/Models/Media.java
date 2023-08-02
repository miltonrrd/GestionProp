package com.mrd.GestionPropiedades.Models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url_final")
    private String url_final;

    @Column(name = "url_local")
    private String url_local;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;
}
