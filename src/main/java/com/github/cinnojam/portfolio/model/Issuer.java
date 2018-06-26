package com.github.cinnojam.portfolio.model;

import java.io.Serializable;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SortNatural;

@Entity
@Table(name = "issuer")
public class Issuer implements Comparable<Issuer>, Serializable {
	private static final long serialVersionUID = 692884008492936784L;
	@Id
	private String issuer;
	private String ticker;
	private String name;
	@OneToMany(mappedBy = "issuer")
	@SortNatural
	private final SortedSet<Security> securities = new TreeSet<>();

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

	public Set<Security> getSecurities() {
		return securities;
	}

	@Override
	public int compareTo(Issuer o) {
		if (o == null) {
			return -1;
		} else {
			return this.issuer.compareTo(o.getIssuer());
		}
	}

}
