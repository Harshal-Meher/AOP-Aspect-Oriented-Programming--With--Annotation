/*package demo.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticateAspect {
	
	@Pointcut("within(demo..*)")
	public void AuthenticatePointCut(){
		
	}
	@Pointcut("within(demo.entity.ShoppingCard.*)")
	public void AuthezationPointCut(){
		
	}
	
	@Before("authenticatingPointCut()  && authorizationPointCut()")
	public void Authenticate(){
		System.out.println("Authetication Request..!");
	}

}
*/