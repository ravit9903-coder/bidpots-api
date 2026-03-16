package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Bid;
import com.example.demo.service.BidService;

@RestController
@RequestMapping("/api")
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping("/bid")
    public String placeBid(@RequestBody Bid bid){

        bidService.placeBid(bid);

        return "Bid Placed Successfully";
    }
}