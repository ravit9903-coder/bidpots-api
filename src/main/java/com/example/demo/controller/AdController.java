package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.repository.AdRepository;

import com.example.demo.entity.model.Ad;
import com.example.demo.service.AdService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdController {

    @Autowired
    private AdRepository adRepository;

    @PostMapping("/post-ad")
    public String postAd(@RequestBody Ad ad) {

        adRepository.save(ad);

        return "Ad Posted Successfully";
    }

    @GetMapping("/ads")
    public List<Ad> getAds() {
        return adRepository.findAll();
    }
}