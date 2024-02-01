package demo.entity;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Aop {
	
    @Before("execution(* demo.entity.ShoppingCard.chekout(..))")
	public void BefourFun(){
		System.out.println("Befour");
	}
    
    
    @After("execution(* *.*.*.chekout(..))")
	public void AfterFun(){
		System.out.println("After");
	}
}
