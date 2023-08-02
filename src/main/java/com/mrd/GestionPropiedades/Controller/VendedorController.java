package com.mrd.GestionPropiedades.Controller;

import com.mrd.GestionPropiedades.Models.IVendedor;
import com.mrd.GestionPropiedades.Models.Propiedad;
import com.mrd.GestionPropiedades.Models.Vendedor;
import com.mrd.GestionPropiedades.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class VendedorController implements IVendedor {
    @Autowired
    VendedorService vendedorService;

    @Override
    @GetMapping("/api/vendedor")
    public List<Vendedor> getVendedores() {

        return vendedorService.getVendedores();
    }

    @Override
    @GetMapping("/api/vendedor/{id}")
    public Vendedor getVendedor(@PathVariable long id) {

       return vendedorService.getVendedor(id);
    }

    @Override
    @DeleteMapping("/api/vendedor/{id}")
    public void deleteVendedor(@PathVariable long id) {
        vendedorService.deleteVendedor(id);
    }

    @Override
    @PutMapping("/api/vendedor/{id}")
    public void putVendedor(@RequestBody Vendedor vendedor,@PathVariable long id) {
        vendedorService.putVendedor(vendedor,id);
    }

    @Override
    @PostMapping("/api/vendedor")
    public void postVendedor(@RequestBody Vendedor vendedor) {
        vendedorService.postVendedor(vendedor);
    }
}
