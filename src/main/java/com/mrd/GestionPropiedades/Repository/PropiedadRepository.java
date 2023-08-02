package com.mrd.GestionPropiedades.Repository;

import com.mrd.GestionPropiedades.Models.IPropiedades;
import com.mrd.GestionPropiedades.Models.Propiedad;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PropiedadRepository implements IPropiedades {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public List<Propiedad> getPropiedades() {
        String consulta = "SELECT * FROM propiedad ";
        return entityManager.createNativeQuery(consulta).getResultList();
    }

    @Override
    @Transactional
    public Propiedad getPropiedad(long id_propiedad) {
        String consulta = " FROM Propiedad p WHERE p.id = :paramId";
        return  entityManager.createQuery(consulta, Propiedad.class).setParameter("paramId",id_propiedad).getSingleResult();
    }

    @Override
    @Transactional
    public void deletePropiedad(long id) {
        String consulta = "DELETE * FROM `propiedad` WHERE `propiedad`.`id` = :paramId";
        entityManager.createNativeQuery(consulta).setParameter("paramId",id).executeUpdate();
    }

    @Override
    public void putPropiedad(Propiedad propiedad, long id) {
        String consulta ="UPDATE Vendedor v\n" +
                "SET p.titulo = :paramTitulo, p.precio = :paramPrecio,\n" +
                "    p.descripcion = :paramDescripcion, p.m2 = :paramM2,\n" +
                "    p.banos = :paramBanos, p.habitaciones = :paramHab,\n" +
                "    p.zipcode = :paramZipcode, p.longitud = :paramLongitud\n" +
                "    p.latitud = :paramLatitud, p.estado = :paramEstado\n" +
                "    p.disponible = :paramDisponible, p.vendedor = :paramVendedor\n" +
                "    p.galeria = :paramGaleria, p.fechaAlta = :paramAlta\n" +
                "    p.fechaBaja = :paramBaja WHERE v.id = :paramId";
        entityManager.createQuery(consulta).setParameter("paramTitulo",
                propiedad.getTitulo()).setParameter("paramPrecio", propiedad.getPrecio()).setParameter("param" +
                "Descripcion",propiedad.getDescripcion()).setParameter("paramM2",propiedad.getM2())
                .setParameter("paramBanos",propiedad.getBanos()).setParameter("paramHab",propiedad.getHabitaciones())
                .setParameter("paramZipcode",propiedad.getZipcode()).setParameter("paramLongitud",propiedad.getLongitud())
                .setParameter("paramLatitud",propiedad.getLatitud()).setParameter("paramEstado",propiedad.getEstado())
                .setParameter("paramDisponible",propiedad.getDisponible()).setParameter("paramVendedor",propiedad.getVendedor().getId())
                .setParameter("paramGaleria",propiedad.getGaleria().getId()).setParameter("paramAlta",propiedad.getFechaAlta())
                .setParameter("paramBaja",propiedad.getFechaBaja()).setParameter("paramId",id).executeUpdate();
    }

    @Override
    public void postPropiedad(Propiedad propiedad) {
        String consulta ="INSERT INTO Propiedad (titulo, precio, descripcion, m2, banos, habitaciones, zipcode," +
                " longitud, latitud, estado, disponible, vendedor, galeria, fechaAlta, fechaBaja)\n" +
                "VALUES (:paramTitulo, :paramPrecio, :paramDescripcion, :paramM2, :paramBanos, :paramHab, " +
                ":paramZipcode, :paramLongitud, :paramLatitud, :paramEstado, :paramDisponible, :paramVendedor," +
                " :paramGaleria, :paramAlta, :paramBaja)";
        entityManager.createQuery(consulta).setParameter("paramTitulo",
                        propiedad.getTitulo()).setParameter("paramPrecio", propiedad.getPrecio()).setParameter("param" +
                        "Descripcion",propiedad.getDescripcion()).setParameter("paramM2",propiedad.getM2())
                .setParameter("paramBanos",propiedad.getBanos()).setParameter("paramHab",propiedad.getHabitaciones())
                .setParameter("paramZipcode",propiedad.getZipcode()).setParameter("paramLongitud",propiedad.getLongitud())
                .setParameter("paramLatitud",propiedad.getLatitud()).setParameter("paramEstado",propiedad.getEstado())
                .setParameter("paramDisponible",propiedad.getDisponible()).setParameter("paramVendedor",propiedad.getVendedor().getId())
                .setParameter("paramGaleria",propiedad.getGaleria().getId()).setParameter("paramAlta",propiedad.getFechaAlta())
                .setParameter("paramBaja",propiedad.getFechaBaja()).executeUpdate();

    }
}
