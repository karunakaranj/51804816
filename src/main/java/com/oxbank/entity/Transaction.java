package com.oxbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Transactionid;
	private String FromAccountToAccount;
	private String Amount;
	private String Transactiontype;
	public int getTransactionid() {
		return Transactionid;
	}
	
	public void setTransactionid(int transactionid) {
		Transactionid = transactionid;
	}
	public String getFromAccountToAccount() {
		return FromAccountToAccount;
	}
	public void setFromAccountToAccount(String fromAccountToAccount) {
		FromAccountToAccount = fromAccountToAccount;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getTransactiontype() {
		return Transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		Transactiontype = transactiontype;
	}
	
	

}
