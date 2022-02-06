package week_2.assignment_3.second;

enum Designation {
	MANAGER, OFFICER, CLERK
}

class Constants {
	static double getHraPercent(Designation designation) {
		if(designation == Designation.MANAGER) return 10;
		else if(designation == Designation.OFFICER) return 12;
		else return 5;
	}
}

class LowSalException extends Exception {
	private static final long serialVersionUID = 1L;
	public LowSalException(String str) { super(str); }
}

class CheckForException {
	static void checkIfLowSalary(double amt) throws LowSalException {
		if(amt < 500) throw new LowSalException("Basic salary can't be less than 500!");
	}
}

public class Emp {
	private int empId;
	private String empName;
	private Designation designation; // using enum instead of string
	private double basic;
	private double hra;
	
	public Emp(int empId, String empName, Designation designation, double basic) throws LowSalException {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		CheckForException.checkIfLowSalary(basic);
		hra = Constants.getHraPercent(designation);
		System.out.println("Employee created successfully!");
	}
		
	public void printDetails() {
		System.out.println("Employee Details:");
		System.out.println("ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Designation: " + designation);
		System.out.println("Basic salary" + basic);
		System.out.println("HRA: " + calculateHRA());
	}
	
	public double calculateHRA() {
		return basic * hra / 100;
	}
	
}
