package com.github.cinnojam.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cinnojam.portfolio.model.Price;

public interface PriceJpaRepository extends JpaRepository<Price, Integer> {

}
