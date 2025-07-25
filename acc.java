package RcoeExp;

import java.lang.*;
import java.io.*;

class Account{
	String custName;
	int accno;
	Account(String a, int b){
		custName = a;
		accno = b;
	}
	void display(){
		System.out.println("Customer Name: "+custName);
		System.out.println("Account Number: "+ accno);
		
	}
}
class Saving extends Account{
	int minbal;
	int savingbal;
	//super (String a, int b);
	Saving (int c, int d){
		minbal = c;
		savingbal = d;
		//super(a, b);		
	}
	void display() {
		System.out.println("Minimum balance: "+minbal);
		System.out.println("Saving balance: "+ savingbal);
	
	}
}
class Online extends Account{
	Online(){
		
	}
	void display() {
}

class Accdetails extends Saving{
	int deposits;
	int withdrawals;
	//super (c,d);
	Accdetails(int e, int f){
		deposits = e;
		withdrawals = f;
	}
	void display() {
		
	}
	
}
public class multiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accdet ad = new Accdet("Sia", 24130, )

	}

}
