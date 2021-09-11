package ProFiles;
import java.util.Scanner;
import java.sql.*;

public class Bank{
	static void login() {
		
		Scanner log = new Scanner(System.in);
		String userID = log.nextLine();
		String passwd = log.nextLine();
		int ResCode = (int) Math.random();
		//System.out.println(ResCode);
		if(ResCode==0) {
			System.out.println("Login Success");
			
		}
		System.out.println(userID);
		System.out.println(passwd);
		
	}
	static void fundt() {
		Scanner transfer = new Scanner(System.in);
		//int balance = transfer.nextInt();
		int  FromAcc = transfer.nextInt();
		int ToAcc = transfer.nextInt();
		int amount = transfer.nextInt();
		int pin = (int) Math.random();
		if(pin==1) {
			System.out.println("Transaction Successfull");
			FromAcc = FromAcc - amount;
			ToAcc = amount + ToAcc;
		
			System.out.println("Balance after Transaction");
			System.out.println(FromAcc);
			System.out.println(ToAcc);
		}
		else {
			System.out.println("Transaction Incomplete");
			System.out.println("Your amount will be credited within two days");
		}
	}
	
	static void logout() {
		
		System.out.println("Thank You for using our Services");
		System.out.println("Session Expired");
	}
	
	
	public static void main(String[] args) {
	
		login();
		fundt();
		logout();
	}
	
}