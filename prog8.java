/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to demonstrate the concept of polymorphism using a Payment System.
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;

//Base class
class Payment {
    public void makePayment() {
        System.out.println("Processing a generic payment...");
    }
}

//Subclass for credit card payment
class CreditCardPayment extends Payment {
    public void makePayment() {
        System.out.println("Processing payment through Credit Card.");
    }
}

//Subclass for debit card payment
class DebitCardPayment extends Payment {
    public void makePayment() {
        System.out.println("Processing payment through Debit Card.");
    }
}

//Subclass for UPI payment
class UPIPayment extends Payment {
    public void makePayment() {
        System.out.println("Processing payment through UPI.");
    }
}
class Razorpay extends Payment{
    public void makePayment(){
        System.out.println("Processing payment through Razorpay.");
    }
}

//Main class to demonstrate polymorphism
public class Exp8 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.makePayment();

        payment = new DebitCardPayment();
        payment.makePayment();

        payment = new UPIPayment();
        payment.makePayment();

        payment = new Razorpay();
        payment.makePayment();
    }
}
