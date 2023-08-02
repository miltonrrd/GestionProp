package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IVendedor {
    List<Vendedor> getVendedores();
    Vendedor getVendedor(long id);
    void deleteVendedor(long id);
    void putVendedor(Vendedor vendedor, long id);
    void postVendedor(Vendedor vendedor);
}
