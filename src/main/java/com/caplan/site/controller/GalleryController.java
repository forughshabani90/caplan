package com.caplan.site.controller;

import com.caplan.site.model.Gallery;
import com.caplan.site.model.Product;
import com.caplan.site.repository.GalleryRepository;
import com.caplan.site.service.GalleryService;
import com.caplan.site.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gallery")
public class GalleryController {
    @Autowired
    private GalleryRepository galleryRepository;
    @Autowired
    private GalleryService galleryService;

    @GetMapping()
    public List<Gallery> getGallery() {
        return galleryRepository.findAll();
    }

    public Gallery save(@RequestBody Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    @DeleteMapping("id")
    public void delet(@PathVariable("id") Long id) {
        galleryRepository.deleteById(id);
    }
    @PutMapping("id")
    public Gallery update(@PathVariable("id") Long id, Gallery gallery){

    }
}
