package com.github.cinnojam.portfolio.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SortNatural;

@Entity
@Table(name = "security")
public class Security implements Comparable<Security>, Serializable {
	private static final long serialVersionUID = -4452037553584092255L;
	@Id
	private String cusip;
	@ManyToOne
	@JoinColumn(name = "issuer", referencedColumnName = "issuer", nullable = false)
	private Issuer issuer;
	private String issue;
	private LocalDate issueDate;
	private LocalDate maturityDate;
	private Double heldPar;
	private String desc;
	@OneToMany(mappedBy = "security")
	@SortNatural
	private final SortedSet<Price> prices = new TreeSet<>();

	public Security() {
		super();
	}

	public Security(String cusip, Issuer issuer, String issue, LocalDate issueDate, LocalDate maturityDate,
			String desc) {
		super();
		this.cusip = cusip;
		this.issuer = issuer;
		this.issue = issue;
		this.issueDate = issueDate;
		this.maturityDate = maturityDate;
		this.desc = desc;
	}

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	public Issuer getIssuer() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getHeldPar() {
		return heldPar;
	}

	public void setHeldPar(Double heldPar) {
		this.heldPar = heldPar;
	}

	public SortedSet<Price> getPrices() {
		return prices;
	}

	@Override
	public int compareTo(Security o) {
		if (o == null) {
			return -1;
		} else {
			return this.cusip.compareTo(o.getCusip());
		}
	}

}
