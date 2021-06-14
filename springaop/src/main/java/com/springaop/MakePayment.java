package com.springaop;

import org.springframework.stereotype.Component;

@Component
public class MakePayment {

	public void startPayment() {
		System.out.println("Payment Start");
	}
	
	public void stopPayment() {
		System.out.println("Payment Stop");
	}
	
	public int authPayment(int amount) {
		System.out.println("Payment Auth");
		return amount;
	}
	
	
	public void  exceptionHandling() throws Throwable{
		throw new Exception("Exception occured");
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}

	
}
