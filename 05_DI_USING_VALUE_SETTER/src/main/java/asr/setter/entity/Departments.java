package asr.setter.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Departments {

	private Integer deptId;
	private String deptName;

	@Value("1")
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Value("Account")
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
