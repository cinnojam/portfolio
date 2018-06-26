package com.github.cinnojam.portfolio.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.github.cinnojam.portfolio.model.Issuer;
import com.github.cinnojam.portfolio.model.Price;
import com.github.cinnojam.portfolio.model.Security;

@Configuration
public class PortfolioRepositoryRestConfigurerAdapter extends RepositoryRestConfigurerAdapter {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Issuer.class,Security.class,Price.class);
	}
}
