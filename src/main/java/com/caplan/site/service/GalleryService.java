package com.caplan.site.service;

import com.caplan.site.model.Gallery;
import com.caplan.site.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class GalleryService {
    @Autowired
    private GalleryRepository galleryRepository;

    public Gallery update(Gallery gallery, Long id) {

        Gallery gallery1;
        Optional<Gallery> gallery3 = galleryRepository.findById(id);
        if (gallery3.isPresent()) {
            gallery1 = gallery3.get();
        } else {
            return null;
        }
        if (gallery.getDescription()!=null){
            gallery1.setDescription(gallery.getDescription());
        }
        if (gallery.getId()!=0){
            gallery1.setId(gallery.getId());
        }



    }
}
