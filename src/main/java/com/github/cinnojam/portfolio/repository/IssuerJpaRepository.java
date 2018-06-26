package com.github.cinnojam.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cinnojam.portfolio.model.Issuer;

public interface IssuerJpaRepository extends JpaRepository<Issuer, String> {

}
