package empwagecalculation;

public class empwagecalculation {

	public static final int wagePerHour = 20;
	public static final int empFullTime = 1;
	public static final int empPartTime = 2;

	public static void main(String[] args) {

		System.out.println("WELCOME TO EMPLOYEE WAGE CALCULATION PROGRAM...");
		System.out.println("***********************************************");

		int employeeWage = 0;
		int workingHours = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {

		case empFullTime:
			System.out.println("Employee is present for full time...");
			workingHours = 8;
			break;
		case empPartTime:
			System.out.println("Employee is present for part time...");
			workingHours = 4;
			break;
		default:
			System.out.println("Employee is absent...");
			workingHours = 0;
		}
		employeeWage = wagePerHour * workingHours;
		System.out.println("employee wage = " + employeeWage);
	}

}
