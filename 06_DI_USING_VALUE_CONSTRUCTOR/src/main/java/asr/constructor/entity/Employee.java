package asr.constructor.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer empId;
	private String empName;
	private Salary empSalary;
	private Departments empDept;

	public Employee(@Value("1001") Integer empId, @Value("Anish") String empName, @Value("#{salary}") Salary empSalary,
			@Value("#{departments}") Departments empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ "]";
	}

}
