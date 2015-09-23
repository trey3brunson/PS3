package Main;
import java.util.Date;

public class Test_Class {
	
public static void main(String args[]){
	Account Account1 = new Account(1122, 20000, 0.045);
	Account1.deposit(3000);
	Account1.withdraw(2500);
	Date dateCreated = new Date();
	
	System.out.println("The total balance of your account is " + Account1.getBalance());
	System.out.println("This account was created on " + dateCreated.toString());
	System.out.println("Your monthly interest rate is " + Account1.getMonthlyInterestRate());
	
	
	
	
	
}


}
