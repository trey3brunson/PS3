package Main;
import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	

	public int getId() {
		return id;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;	
	}
	
	public Account( int id, double balance, double annualIntrestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualIntrestRate;
		
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public double withdraw(double amount){
		return balance-=amount;
	}
	
	public double deposit(double amount){
		return balance+=amount;
	}
	
}


