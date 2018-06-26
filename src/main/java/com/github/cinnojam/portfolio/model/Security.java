package com.github.cinnojam.portfolio.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security")
public class Security {
	@Id
	private String cusip;
	private String issuer;
	private String issue;
	private LocalDate issueDate;
	private LocalDate maturityDate;
	private String desc;

	public Security() {
		super();
	}

	public Security(String cusip, String issuer, String issue, LocalDate issueDate, LocalDate maturityDate,
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

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
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

}
