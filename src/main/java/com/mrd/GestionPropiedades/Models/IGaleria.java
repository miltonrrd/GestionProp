package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IGaleria {
    List<Galeria> getGaleria();
    Media getGaleria(long id);
    void deleteGaleria(long id);
    void putGaleria(Galeria galeria, long id);
    void postGaleria(Galeria galeria);
}
