package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IPropiedades {

    List<Propiedad> getPropiedades();
    Propiedad getPropiedad(Long id);
    void deletePropiedad(Long id);
    void putPropiedad(Propiedad propiedad, Long id);
    void postPropiedad(Propiedad propiedad);
}
