package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IVendedor {
    List<Vendedor> getVendedores();
    Vendedor getVendedor(Long id);
    void deleteVendedor(Long id);
    void putVendedor(Vendedor vendedor, Long id);
    void postVendedor(Vendedor vendedor);
}
