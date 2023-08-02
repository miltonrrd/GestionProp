package com.mrd.GestionPropiedades.Repository;

import com.mrd.GestionPropiedades.Models.IVendedor;
import com.mrd.GestionPropiedades.Models.Propiedad;
import com.mrd.GestionPropiedades.Models.Vendedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class VendedorRepository implements IVendedor {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public List<Vendedor> getVendedores() {
        String consulta = "SELECT * FROM vendedor ";
        return entityManager.createNativeQuery(consulta).getResultList();
    }

    @Override
    @Transactional
    public Vendedor getVendedor(long id) {
        String consulta = "FROM Vendedor v WHERE v.id = :paramId";
        return entityManager.createQuery(consulta, Vendedor.class).setParameter("paramId", id).getSingleResult();
    }

    @Override
    @Transactional
    public void deleteVendedor(long id) {
        String consulta = "DELETE FROM `vendedor` WHERE `vendedor`.`id` = :paramId";
        entityManager.createNativeQuery(consulta).setParameter("paramId",id).executeUpdate();
    }

    @Override
    @Transactional
    public void putVendedor(Vendedor vendedor, long id) {
        String consulta ="UPDATE Vendedor v\n" +
                "SET v.apellido = :paramApellido, v.dni = :paramDNI,\n" +
                "    v.email = :paramEmail, v.fechaAlta = :paramAlta,\n" +
                "    v.fechaBaja = :paramBaja, v.nombre = :paramNombre,\n" +
                "    v.telefono = :paramTel\n" +
                "WHERE v.id = :paramId";
        entityManager.createQuery(consulta).setParameter("paramApellido",
                vendedor.getApellido()).setParameter("paramDNI", vendedor.getDni()).setParameter("param" +
                "Email",vendedor.getEmail()).setParameter("param" +
                "Alta",vendedor.getFechaAlta()).setParameter("paramBaja",vendedor.getFechaBaja()).setParameter("paramNombr" +
                "e",vendedor.getNombre()).setParameter("paramTel",vendedor.getTelefono()).setParameter("par" +
                "amId",id).executeUpdate();
    }

    @Override
    @Transactional
    public void postVendedor(Vendedor vendedor) {
        String consulta = "INSERT INTO Vendedor (apellido, dni, email, fechaAlta, fechaBaja, nombre, telefono)\n" +
                "VALUES (:paramApellido, :paramDNI, :paramEmail, :paramAlta, :paramBaja, :paramNombre, :paramTel)";
        entityManager.createQuery(consulta).setParameter("paramApellido",
                vendedor.getApellido()).setParameter("paramDNI", vendedor.getDni()).setParameter("param" +
                "Email",vendedor.getEmail()).setParameter("param" +
                "Alta",vendedor.getFechaAlta()).setParameter("paramBaja",vendedor.getFechaBaja()).setParameter("paramNombr" +
                "e",vendedor.getNombre()).setParameter("paramTel",vendedor.getTelefono()).executeUpdate();
    }
}
