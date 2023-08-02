package com.mrd.GestionPropiedades.Models;

import java.util.List;

public interface IMedia {
    List<Media> getMedia();
    Media getMedia(long id);
    void deleteMedia(long id);
    void putMedia(Media media, long id);
    void postMedia(Media media);
}
