package week_1.assignment_5;

public class Employee {
	private String name;
	private Department dept;
	private String designation;
	private double salary;

	public Employee(String name, Department dept, String designation, double salary) {
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public double computeGrossSalary() {
		double grossSalary = salary;
		switch (designation) {
			case "PL": { grossSalary += Constants.PL; break; }
			case "TM": { grossSalary += Constants.TM; break; }
			case "TL": { grossSalary += Constants.TL; break; }
			case "Admin": { grossSalary += Constants.Admin; break; }
			case "Others": { grossSalary += Constants.Others; break; }
		}
		return grossSalary;
	}
	
	public double computeNetSalary() {
		return computeGrossSalary() - computeTaxPayable();
	}
	
	public double computeTaxPayable() {
		double taxPayable = 0.0;
		if(salary > 7500 && salary < 12500) taxPayable = salary * 0.096;
		else if(salary > 12500 && salary < 15000) taxPayable = salary * 0.1125;
		else if(salary >= 15000 && salary <= 20000) taxPayable = salary * 0.1250;
		else if(salary > 20000) taxPayable = salary * 0.13;
		return taxPayable;
	}
	
	public void displayEmployeeDetails() {
		System.out.println(this);
		System.out.println("Basic salary: Rs. " + getSalary() + "/-");
		System.out.println("Gross salary: Rs. " + computeGrossSalary() + "/-");
		System.out.println("Net salary: Rs. " + computeNetSalary() + "/-");
	}

	@Override
	public String toString() {
		return "Employee Details:\n[Name: " + name + "; Department: " + dept + "; Designation: " + designation + "; Salary: " + salary + ";]";
	}

}
