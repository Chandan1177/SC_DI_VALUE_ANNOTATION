package asr.constructor.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Departments {

	private Integer deptId;
	private String deptName;

	public Departments(@Value("1") Integer deptId, @Value("Account") String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
