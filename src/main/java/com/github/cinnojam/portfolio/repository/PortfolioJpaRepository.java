package com.github.cinnojam.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cinnojam.portfolio.model.Portfolio;

public interface PortfolioJpaRepository extends JpaRepository<Portfolio, String> {

}
