package com.mrd.GestionPropiedades.Controller;

import com.mrd.GestionPropiedades.Models.IPropiedades;
import com.mrd.GestionPropiedades.Models.Propiedad;
import com.mrd.GestionPropiedades.Service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropiedadController implements IPropiedades {
    @Autowired
    PropiedadService propiedadService;
    @Override
    @GetMapping("/api/propiedad")
    public List<Propiedad> getPropiedades() {
        return null;
    }

    @Override
    @GetMapping("/api/propiedad/{id}")
    public Propiedad getPropiedad(@PathVariable Long id) {
        return propiedadService.getPropiedad(id);
    }

    @Override
    @DeleteMapping("api/propiedad/{id}")
    public void deletePropiedad(@PathVariable Long id) {
        propiedadService.deletePropiedad(id);
    }

    @Override
    @PutMapping("api/propiedad/{id}")
    public void putPropiedad(@RequestBody Propiedad propiedad,@PathVariable Long id) {
        propiedadService.putPropiedad(propiedad,id);
    }

    @Override
    @PostMapping("api/propiedad")
    public void postPropiedad(@RequestBody Propiedad propiedad) {
        propiedadService.postPropiedad(propiedad);
    }
}
