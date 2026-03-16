package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Bid;

public interface BidRepository extends JpaRepository<Bid, Long> {
}