package empwagecalculation;

public class empwagecalculation {

	public static void main(String[] args) {

		System.out.println("WELCOME TO EMPLOYEE WAGE CALCULATION PROGRAM...");
		System.out.println("***********************************************");

		int isPresent = 1;
		int wagePerHour = 20;
		int workingHours = 8;
		int employeeWage = wagePerHour * workingHours;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent) {
			System.out.println("Employee is present...");
			System.out.println("Employee wage = " + employeeWage);
		} else {
			System.out.println("Employee is absent...");
		}

	}

}
