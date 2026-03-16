package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.model.Ad;
import com.example.demo.repository.AdRepository;

@Service
public class AdService {

    @Autowired
    private AdRepository adRepository;

    public Ad postAd(Ad ad) {
        return adRepository.save(ad);
    }

    public List<Ad> getAds() {
        return adRepository.findAll();
    }

    public String deleteAd(Long id) {

        if (adRepository.existsById(id)) {
            adRepository.deleteById(id);
            return "Ad Deleted Successfully";
        } else {
            return "Ad Not Found";
        }

    }
}