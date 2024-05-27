package asr.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import asr.constructor.entity.Employee;


@ComponentScan("asr.constructor")
public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
         Employee emp = context.getBean(Employee.class);
         System.out.println(emp);
    }
}
