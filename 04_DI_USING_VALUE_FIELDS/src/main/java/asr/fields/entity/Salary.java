package asr.fields.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
	
	@Value("101")
	private Integer billNumber;
	
	@Value("#{10000+50}")
	private Double salaryAmount;
	
	@Value("March")
	private String  month;

	@Override
	public String toString() {
		return "Salary [billNumber=" + billNumber + ", salaryAmount=" + salaryAmount + ", month=" + month + "]";
	}
	
	

}
