package com.mrd.GestionPropiedades.Service;

import com.mrd.GestionPropiedades.Models.IPropiedades;
import com.mrd.GestionPropiedades.Models.Propiedad;
import com.mrd.GestionPropiedades.Repository.IPropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropiedadService implements IPropiedades {
    @Autowired
    IPropiedadRepository propiedadRepository;
    @Override
    public List<Propiedad> getPropiedades() {
        return (List) propiedadRepository.findAll();
    }

    @Override
    public Propiedad getPropiedad(Long id) {

        return propiedadRepository.findById(id).get();
    }

    @Override
    public void deletePropiedad(Long id) {
        propiedadRepository.deleteById(id);
    }

    @Override
    public void putPropiedad(Propiedad propiedad, Long id){
        propiedadRepository.save(propiedad);
    }

    @Override
    public void postPropiedad(Propiedad propiedad) {
        propiedadRepository.save(propiedad);
    }
}
