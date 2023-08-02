package com.mrd.GestionPropiedades.Service;

import com.mrd.GestionPropiedades.Models.IVendedor;
import com.mrd.GestionPropiedades.Models.Vendedor;
import com.mrd.GestionPropiedades.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendedorService implements IVendedor {
    @Autowired
    VendedorRepository vendedorRepository;
    @Override
    public List<Vendedor> getVendedores() {
        return vendedorRepository.getVendedores();
    }

    @Override
    public Vendedor getVendedor(long id) {
        return vendedorRepository.getVendedor(id);
    }

    @Override
    public void deleteVendedor(long id) {
        vendedorRepository.deleteVendedor(id);
    }

    @Override
    public void putVendedor(Vendedor vendedor, long id) {
        vendedorRepository.putVendedor(vendedor, id);
    }

    @Override
    public void postVendedor(Vendedor vendedor) {
        vendedorRepository.postVendedor(vendedor);
    }
}
