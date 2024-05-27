package asr.setter.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer empId;
	private String empName;
	private Salary empSalary;
	private Departments empDept;

	@Value("1001")
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Value("Anish")
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Value("#{salary}")
	public void setEmpSalary(Salary empSalary) {
		this.empSalary = empSalary;
	}

	@Value("#{departments}")
	public void setEmpDept(Departments empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ "]";
	}

}
