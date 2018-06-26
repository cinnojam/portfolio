package com.github.cinnojam.portfolio.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "price")
public class Price implements Comparable<Price>, Serializable {
	private static final long serialVersionUID = 2053784864377099422L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "cusip", referencedColumnName = "cusip", nullable = false)
	private Security security;
	private LocalDate date;
	private Double price;

	public Price() {
		super();
	}

	public Price(Integer id, Security security, LocalDate date, Double price) {
		super();
		this.id = id;
		this.security = security;
		this.date = date;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Price o) {
		if (this==o) return 0;
		if (this.security.equals(o.getSecurity())) {
			return this.date.compareTo(o.getDate());
		} else {
			return this.security.getCusip().compareTo(o.getSecurity().getCusip());
		}
	}

}
