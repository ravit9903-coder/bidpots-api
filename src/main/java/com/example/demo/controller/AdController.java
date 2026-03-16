package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.model.Ad;
import com.example.demo.service.AdService;

@RestController
@RequestMapping("/api")
public class AdController {

    @Autowired
    private AdService adService;

    @PostMapping("/post-ad")
    public Ad postAd(@RequestBody Ad ad) {
        return adService.postAd(ad);
    }

    @GetMapping("/ads")
    public List<Ad> getAds() {
        return adService.getAds();
    }

    @DeleteMapping("/delete-ad/{id}")
    public String deleteAd(@PathVariable Long id) {
        return adService.deleteAd(id);
    }
}