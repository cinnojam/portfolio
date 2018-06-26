package com.github.cinnojam.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issuer")
public class Issuer {
	@Id
	private String issuer;
	private String ticker;
	private String name;

	public Issuer() {
		super();
	}

	public Issuer(String issuer, String ticker, String name) {
		super();
		this.issuer = issuer;
		this.ticker = ticker;
		this.name = name;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
