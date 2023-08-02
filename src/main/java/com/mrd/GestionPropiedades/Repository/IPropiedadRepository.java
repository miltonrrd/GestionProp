package com.mrd.GestionPropiedades.Repository;

import com.mrd.GestionPropiedades.Models.Propiedad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropiedadRepository extends CrudRepository<Propiedad, Long> {
}
