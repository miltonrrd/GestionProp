package com.mrd.GestionPropiedades.Service;

import com.mrd.GestionPropiedades.Models.IVendedor;
import com.mrd.GestionPropiedades.Models.Vendedor;
import com.mrd.GestionPropiedades.Repository.IVendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendedorService implements IVendedor {
    @Autowired
    IVendedorRepository vendedorRepository;
    @Override
    public List<Vendedor> getVendedores() {
        return (List) vendedorRepository.findAll();
    }

    @Override
    public Vendedor getVendedor(Long id) {
        return vendedorRepository.findById(id).get();
    }

    @Override
    public void deleteVendedor(Long id) {
        vendedorRepository.deleteById(id);
    }

    @Override
    public void putVendedor(Vendedor vendedor, Long id) {
        vendedor.setId(id);
        vendedorRepository.save(vendedor);
    }

    @Override
    public void postVendedor(Vendedor vendedor) {
        vendedorRepository.save(vendedor);
    }
}
