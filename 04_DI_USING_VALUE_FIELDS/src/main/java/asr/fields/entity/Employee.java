package asr.fields.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1001")
	private Integer empId;
	@Value("Anish")
	private String empName;
	
	@Value("#{salary}")
	private Salary empSalary;
	
	@Value("#{departments}")
	private Departments empDept;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ "]";
	}
	
	

}
