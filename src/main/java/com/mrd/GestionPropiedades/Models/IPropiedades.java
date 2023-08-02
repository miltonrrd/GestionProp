package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IPropiedades {

    List<Propiedad> getPropiedades();
    Propiedad getPropiedad(long id);
    void deletePropiedad(long id);
    void putPropiedad(Propiedad propiedad, long id);
    void postPropiedad(Propiedad propiedad);
}
