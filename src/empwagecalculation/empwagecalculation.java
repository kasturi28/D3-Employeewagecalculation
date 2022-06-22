package empwagecalculation;

public class empwagecalculation {

	public static final int wagePerHour = 20;
	public static final int empFullTime = 1;
	public static final int empPartTime = 2;
	public static final int totalWorkingDays = 20;
	public static final int totalWorkingHours = 100;
	
	public static void main(String[] args) {

		int employeeWage = 0;
		int workingHours = 0;
		int workingDays = 0;
		int totalEmpWage = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		while (workingHours <= totalWorkingHours && workingDays <= totalWorkingDays ) {
			
			workingDays++;
			

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
			totalEmpWage += employeeWage;
			System.out.println("employee wage = " + employeeWage);
		}
		System.out.println("Total employee wage = " + totalEmpWage);
	}

}
