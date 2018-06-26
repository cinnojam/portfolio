package com.github.cinnojam.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cinnojam.portfolio.model.Security;

public interface SecurityJpaRepository extends JpaRepository<Security, String> {

}
