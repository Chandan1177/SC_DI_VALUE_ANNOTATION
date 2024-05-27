package asr.fields.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Departments {
	
	@Value("1")
	private Integer deptId;
	
	@Value("Account")
	private String deptName;

	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	

}
