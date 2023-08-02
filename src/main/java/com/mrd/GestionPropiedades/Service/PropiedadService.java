package com.mrd.GestionPropiedades.Service;

import com.mrd.GestionPropiedades.Models.IPropiedades;
import com.mrd.GestionPropiedades.Models.Propiedad;
import com.mrd.GestionPropiedades.Repository.PropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropiedadService implements IPropiedades {
    @Autowired
    PropiedadRepository propiedadRepository;
    @Override
    public List<Propiedad> getPropiedades() {
        return propiedadRepository.getPropiedades();
    }

    @Override
    public Propiedad getPropiedad(long id) {
        return propiedadRepository.getPropiedad(id);
    }

    @Override
    public void deletePropiedad(long id) {
        propiedadRepository.deletePropiedad(id);
    }

    @Override
    public void putPropiedad(Propiedad propiedad, long id) {
        propiedadRepository.putPropiedad(propiedad, id);
    }

    @Override
    public void postPropiedad(Propiedad propiedad) {

        propiedadRepository.postPropiedad(propiedad);
    }
}
