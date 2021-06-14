package com.springaop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Transaction {

	//execution(public void startPayment()) this is point cut expression
	//@Before,@After are advice
	@Before(value = "execution(public void startPayment())") 
	public void startTransaction() {
		System.out.println("Transaction start");
	}
	@After(value = "execution(public void startPayment())")
	public void completeransaction() {
		System.out.println("Transaction complete");
	}
	
	@Pointcut ("execution(public void stopPayment())")
	private void throughPointCut() {
		
	}
	@After ("throughPointCut()")
	public void multiplePointCut() {
		System.out.println("Transition stop");
	}

	@AfterThrowing(pointcut = "execution(public void exceptionHandling())",throwing = "ex")
	public void exceptionHanding(Exception ex) {
		System.out.println("this is my throw exception-->"+ex.getMessage());
	}
	
	@Around("execution(public int multiply(int,int))")
	public Object multiply(ProceedingJoinPoint point) {
		Object[] args=point.getArgs();
		System.out.println("First param-->"+args[0]);
		System.out.println("Second param-->"+args[1]);
		args[0]=5;
		Object res=null;
		try {
			res=point.proceed(args);
			System.out.println(res);
		
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
}



