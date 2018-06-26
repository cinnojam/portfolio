package com.github.cinnojam.portfolio.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "price")
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String cusip;
	private LocalDate date;
	private Double price;

	public Price() {
		super();
	}

	public Price(Integer id, String cusip, LocalDate date, Double price) {
		super();
		this.id = id;
		this.cusip = cusip;
		this.date = date;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
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

}
