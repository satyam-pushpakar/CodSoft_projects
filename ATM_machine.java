package ATM_interface;
import java.util.Scanner;


       class BankAccount{
    	   private double balance;
    	   
    	   public BankAccount(double initalBalance) {
    		   this.balance=initalBalance;    	
    		   }
    	   
    	   public double getBalance() {
    		   return balance;
    	   }
    	   
    	   public void deposit(double amount) {
    		   if(amount>0) {
    			   balance +=amount;
    			   System.out.println("Deposit succesful. New balanc: " +balance);
    		   }else {
    			   System.out.println("Invalid amount for deposit.");
    		   }
    	   }
    	   
    	   public void withdraw(double amount) {
    		   if(amount > 0  && amount <= balance) {
    			   balance-=amount;
    			   System.out.println("Withdrawl succesful. New balance: " + balance);
    		   }else {
    			   System.out.println("Insufficient funds or invalid amount for withdrawl.");
    		   }
    	   }
    	   
       }
       
       class ATM{
    	   private  BankAccount account;
    	   private Scanner scanner;
    	   
    	   public ATM(BankAccount account) {
    		   this.account=account;
    		   this.scanner=new Scanner(System.in);
    	   }
    	   
    	   public void showMenu() {
    		   
    		   System.out.println("1  Check Balance");
    		   System.out.println("2  Deposit");
    		   System.out.println("3  Withdraw");
    		   System.out.println("4  Exit");
    		   
    	   }
    	   
    	   public void ram() {
    		   int choice;
    		   do {
    			   showMenu();
    			   System.out.println("Enter your choice: ");
    			   choice=scanner.nextInt();
    			   switch(choice) {
    			   case 1:
    				   checkBalance();
    				   break;
    				   
    			   case 2:
    				   deposit();
    					   break;
    			   case 3:
    				   withdraw();
    				   break;
    				   
    			   case 4:
    				   System.out.println("Thank you for using ATM__!");
    				   break;
    				   
    				   default:
    					   System.out.println("Invalid choice. Please select a valid Option.");
    			   }
    		   } while (choice!=4);
    	   }
    	   
    	   private void checkBalance() {
    		   System.out.println("your current balance is: " + account.getBalance());
    	   }
    	   
    	   private void deposit() {
    		   System.out.println("Enter the amount to deposit: ");
    		   double amount = scanner.nextDouble();
    		   account.deposit(amount);
    	   }
    	   
    	   private void withdraw() {
    		   System.out.println("Enter the amount to withdraw: ");
    		   double amount=scanner.nextDouble();
    		   account.withdraw(amount);
    		   }
       }
       
       
public class ATM_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********************_____Welcome to the ATM_____********************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Four digit Pin : ");
		int enterpin=sc.nextInt();
		
		BankAccount usserAccount=new BankAccount(10000.0);
		ATM atm=new ATM(usserAccount);
		atm.ram();
	}

}
