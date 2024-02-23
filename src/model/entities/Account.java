package model.entities;

public class Account {
	private Integer numberAccount;
	private String holderAccount;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer numberAccount, String holderAccount, Double balance, Double withdrawLimit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(Integer numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New Balance:  $" + String.format("%.2f", balance);
	}
}
