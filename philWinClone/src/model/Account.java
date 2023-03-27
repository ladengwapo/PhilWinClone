package model;

public class Account extends Person {
	
	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private Double balance;
	private String bankAccount;	
	
	public void setUserId(int userId) {
		this.userId = userId;			
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;			
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setEmail(String email) {
		this.email = email;			
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword(String password){
		return this.password;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Double getBalance() {
		return this.balance;
	}
	
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public String getBankAccount() {
		return this.bankAccount;
	}

}
