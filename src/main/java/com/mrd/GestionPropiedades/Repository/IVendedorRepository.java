package com.mrd.GestionPropiedades.Repository;

import com.mrd.GestionPropiedades.Models.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVendedorRepository extends CrudRepository<Vendedor, Long> {
}
