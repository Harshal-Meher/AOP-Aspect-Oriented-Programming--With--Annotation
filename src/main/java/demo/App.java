package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.entity.BeanConfig;
import demo.entity.ShoppingCard;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
    	ShoppingCard cart=context.getBean(ShoppingCard.class);
    	cart.chekout("Cancelled");
    }
}
