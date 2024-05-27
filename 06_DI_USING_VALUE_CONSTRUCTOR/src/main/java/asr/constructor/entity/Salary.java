package asr.constructor.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	private Integer billNumber;
	private Double salaryAmount;
	private String month;

	public Salary(@Value("101") Integer billNumber, @Value("#{10000+50}") Double salaryAmount,
			@Value("March") String month) {
		super();
		this.billNumber = billNumber;
		this.salaryAmount = salaryAmount;
		this.month = month;
	}

	@Override
	public String toString() {
		return "Salary [billNumber=" + billNumber + ", salaryAmount=" + salaryAmount + ", month=" + month + "]";
	}

}
