package in.shubha.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpData implements CommandLineRunner {

	public EmpData() {
		System.out.println("Emp info");
	}
	@Value("${my.info.emp.id}")
	private int empId;
	@Value("${my.info.emp.name}")
	private String empName;
	@Value("${my.info.emp.salary}")
	private double empSalary;
	
	@Override
	public String toString() {
		return "EmpData [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	

}
