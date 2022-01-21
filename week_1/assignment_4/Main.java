package week_1.assignment_4;

import java.util.ArrayList;
import java.util.List;

/*
	Create an Employee class with Empid, Empname, Empaddress, Empemail, Empdesignation. 
	Write a function to add, view, modify (except empid and empname) the employee details 
	Write a function to add an employee without email 
	The employee can be added without any designation. If not given “Trainee” should be the designation.
*/

public class Main {

	static List<Employee> employees = new ArrayList<>();

	public static void main(String[] args) {
		addEmployee("Employee With No Address", "", "", "");
		addEmployee("", "employee_with@no.name", "", "");
		addEmployee("Employee One", "Address 1", "emp@one.com", "");
		addEmployee("Employee Two", "Address 2", "emp@two.com", "SDE1");
		addEmployee("Employee Three", "Address 3", "emp@three.com", "SDE3");
		addEmployee("Employee Four", "Address 4", "emp@four.com", "Java Architect");
		addEmployee("Employee Five", "Address 5", "", "");
		viewEmployee();
		modifyEmployee(1005, "Employee Four", "", "new@email.com", "New Designation");
		modifyEmployee(1005, "Employee Five", "New Address", "new@email.com", "New Designation");
		viewEmployee();
		// todo: add menu and take user input
	}

	static void addEmployee(String name, String address, String email, String designation) {
		if(name.equals("") || address.equals("")) {
			System.out.println("Add Employee: Name and address field cant be empty! Employee not added.");
			System.out.println("=============");
			return;
		}
		
		if(email.equals("") && designation.equals("")) employees.add(new Employee(name, address, "", "Trainee"));
		else if(email.equals("")) employees.add(new Employee(name, address, "", designation));
		else if(designation.equals("")) employees.add(new Employee(name, address, email, "Trainee"));
		else employees.add(new Employee(name, address, email, designation));
		
		System.out.println("Add Employee: Employee added successfully!");
		System.out.println("=============");
	}

	static void viewEmployee() {
		if (employees.isEmpty())
			System.out.println("View Employee: No employee found!");
		else {
			System.out.println("View Employee:");
			employees.forEach(System.out::println);
		}
		System.out.println("=============");
	}

	static void modifyEmployee(int id, String name, String newAddress, String newEmail, String newDesignation) {
//		System.out.println(employees.stream().filter(e -> (e.getEmpId() == id && e.getEmpName().equals(name))).count());
		
		boolean found = false;
		for(Employee e: employees) {
			if(e.getEmpId() == id && e.getEmpName().equals(name)) {
				found = true;
				e.setEmpAddress(newAddress);
				e.setEmpEmail(newEmail);
				e.setEmpDesignation(newDesignation);
			}
		}
		if(found) System.out.println("Modify Employee: Employee details modified successfully!");
		else System.out.println("Modify Employee: No such employee found!");
		System.out.println("=============");
	}

}