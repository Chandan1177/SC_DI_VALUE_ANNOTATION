package asr.fields;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import asr.fields.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Employee emp = context.getBean(Employee.class);
    	System.out.println(emp);
    }
}
