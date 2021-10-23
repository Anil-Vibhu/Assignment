package com.sonata.q2;

import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Bank{

	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
