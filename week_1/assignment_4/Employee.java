package week_1.assignment_4;

public class Employee {
	private static int idCounter = 1000;
	
	private int empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	private String empDesignation;

	public Employee(String empName, String empAddress, String empEmail, String empDesignation) {
		this.empId = ++Employee.idCounter;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empDesignation = empDesignation;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee ID: " + empId + "; NAME: " + empName + "; ADDRESS: " + empAddress
				+ "; EMAIL: " + empEmail + "; DESIGNATION: " + empDesignation + ";";
	}

}
