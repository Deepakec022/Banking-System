package dee;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
             BankAccount obj = new BankAccount(" Dee ","l00001");
             obj.showMenu();

	}

}
class BankAccount{
	int balance;
	int previousTransaction;
	String CustomerName;
	String CustomerId;
	
	 BankAccount(String cname , String cid){
		 CustomerName = cname;
		 CustomerId = cid;
	 }
	 void  deposit(int amount) {
		 if(amount!=0)
		 {
			 balance = balance+amount;
			 previousTransaction = amount;
		 }
	 }
	 void withdraw(int amount) {
		 if(amount!=0) {
			 balance = balance - amount;
			 previousTransaction = -amount;
		 }
		 
	 }
	 void getPreviousTranscation() {
		 if(previousTransaction>0) {
			 System.out.println("Deposited :" + previousTransaction);
		 }
		 else if (previousTransaction < 0) {
			 System.out.println("Withdraw :" +Math.abs(previousTransaction));
		 }
		 else
		 {
			 System.out.println("No transcation occured");
		 }
		 
	 }
	 void showMenu() {
		 char option ='\0';
		 Scanner sc = new  Scanner(System.in);
		 System.out.println("Welcome" +CustomerName);
		 System.out.println("Your Id" +CustomerId);
		 System.out.println("\n");
		 
		 System.out.println("A : check Your Balance");
		 System.out.println("B : Deposit");
		 System.out.println("c : Withdraw");
		 System.out.println("D : previous Transcation");
		 System.out.println("E: Exit the System");
		 
		 do {
			 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			 System.out.println("Enter your option");
			 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			 option = sc.next().charAt(0);
			 System.out.println("\n");
		 
		 switch (option) {
		 case 'A':
			 System.out.println("-------------------------------------------");
			 System.out.println("Balance ="+balance);
			 System.out.println("--------------------------------------------");
			 System.out.println("\n");
			 break;
		 case 'B':
			 System.out.println("--------------------------------------------");
			 System.out.println("Enter an amount to deposit");
			 System.out.println("---------------------------------------------");
			 System.out.println("\n");
			 
			 int amount = sc.nextInt();
			 deposit(amount);
			 System.out.println("\n");
			 break;
		 case 'C':
			 System.out.println("---------------------------------------------");
			 System.out.println("Enter an amount to withdraw");
			 System.out.println("----------------------------------------------");
			 
			 int amount2 = sc.nextInt();
			 withdraw(amount2);
			 System.out.println("\n");
			 break;
		 case 'D':
			 System.out.println("------------------------------------------");
			 getPreviousTranscation();
			 System.out.println("----------------------------------------------");
			 System.out.println("\n");
			 break;
		 case'E':
			 System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*"); 
			 break;
		default:
			System.out.println("Invalid option !! please enter correct opton");
			break;
		 }
		 }
	 
	 while(option!='E');
	System.out.println("Thank you for using our services....!!");
	 }
}

	 

			 

			 
			 

