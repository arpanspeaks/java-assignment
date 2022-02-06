package week_2.assignment_3.second;

public class Main {

	public static void main(String[] args) {
		try {
			Emp e = new Emp(100, "Arpan Sardar", Designation.MANAGER, 1000);
			e.printDetails();
		} catch (LowSalException e) {
			System.out.println(e.getMessage());
		}
	}

}
