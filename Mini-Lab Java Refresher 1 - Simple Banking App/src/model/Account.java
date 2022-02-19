package model;
import java.util.Date;

public class Account {
	
	String accountNumber;
	String usernameOfAccountHolder;
	String accountType;
	Date accountOpeningDate;
	
	public Account(String accountNumber, String usernameOfAccountHolder, String accountType, Date accountOpeningDate) {
		super();
		this.accountNumber = accountNumber;
		this.usernameOfAccountHolder = usernameOfAccountHolder;
		this.accountType = accountType;
		this.accountOpeningDate = accountOpeningDate;
	}
	
	public String toString() {
		return accountNumber + ", " + usernameOfAccountHolder + ", " + accountType + ", " + accountOpeningDate;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsernameOfAccountHolder() {
		return usernameOfAccountHolder;
	}
	public void setUsernameOfAccountHolder(String usernameOfAccountHolder) {
		this.usernameOfAccountHolder = usernameOfAccountHolder;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

}
