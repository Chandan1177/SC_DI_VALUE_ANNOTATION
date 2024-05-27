package asr.setter.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	private Integer billNumber;
	private Double salaryAmount;
	private String month;

	@Value("101")
	public void setBillNumber(Integer billNumber) {
		this.billNumber = billNumber;
	}

	@Value("#{10000+50}")
	public void setSalaryAmount(Double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}

	@Value("March")
	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Salary [billNumber=" + billNumber + ", salaryAmount=" + salaryAmount + ", month=" + month + "]";
	}

}
