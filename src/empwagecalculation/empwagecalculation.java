package empwagecalculation;

public class empwagecalculation {

	public static void main(String[] args) {

		System.out.println("WELCOME TO EMPLOYEE WAGE CALCULATION PROGRAM...");
		System.out.println("***********************************************");

		int wagePerHour = 20;
		int empFullTime = 1;
		int empPartTime = 2;
		int employeeWage = 0;
		int workingHours = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == empFullTime) {
			System.out.println("Employee is present for full time...");
			workingHours = 8;
		} else if (empCheck == empPartTime) {
			System.out.println("Employee is present for part time...");
			workingHours = 4;
		} else {
			System.out.println("Employee is absent...");
			workingHours = 0;
		}
		employeeWage = wagePerHour * workingHours;
		System.out.println("employee wage = " + employeeWage);
	}

}
