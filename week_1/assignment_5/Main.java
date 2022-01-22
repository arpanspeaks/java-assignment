package week_1.assignment_5;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = addEmployee();
		displayEmployeeDetails(emp);
	}
	
	static Employee addEmployee() {
		return new Employee("Employee Name", Department.TECH, Designation.TM.toString(), 45000);
	}
	
	static void displayEmployeeDetails(Employee emp) {
		emp.displayEmployeeDetails();
	}
	
}
