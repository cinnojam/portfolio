package com.github.cinnojam.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio {
	@Id
	private String cusip;
	private Double par;

	public Portfolio() {
		super();
	}

	public Portfolio(String cusip, Double par) {
		super();
		this.cusip = cusip;
		this.par = par;
	}

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	public Double getPar() {
		return par;
	}

	public void setPar(Double par) {
		this.par = par;
	}

}
