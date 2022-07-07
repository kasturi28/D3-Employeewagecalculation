package empwagecalculation;

public class empwagecalculation {

	public static final int WAGE_PER_HOUR = 20;
	public static final int EMP_FULL_TIME = 1;
	public static final int EMP_PART_TIME = 2;
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HOURS_IN_MONTH = 100;

	static int numberOfHours = 0;
	static int employeeWagePerDay = 0;
	static int nHours = 0;
	static int totalWorkingDays = 0;
	static int totalWorkingHours = 0;
	static int totalEmployeeWage = 0;

	public static void welcomeMessage() {

		System.out.println("welcome to the employee wage calculation program..");

	}

	public static void empwagecalc() {

		while (totalWorkingHours < TOTAL_WORKING_HOURS_IN_MONTH && totalWorkingDays <= TOTAL_WORKING_DAYS) {

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {

			case EMP_FULL_TIME:
				System.out.println("Employee is present for full time...");
				numberOfHours = 8;
				totalWorkingHours = totalWorkingHours + numberOfHours;
				nHours += numberOfHours;
				break;
			case EMP_PART_TIME:
				System.out.println("Employee is present for part time...");
				numberOfHours = 4;
				totalWorkingHours = totalWorkingHours + numberOfHours;
				nHours += numberOfHours;
				break;
			default:
				System.out.println("Employee is absent...");
				numberOfHours = 0;
				totalWorkingHours = totalWorkingHours + numberOfHours;
			}
		}

		System.out.println("Maximum days in a month = " + totalWorkingDays);
		System.out.println("Number of hours reached = " + nHours);
		System.out.println("Maximum days in a month = " + totalWorkingDays);
		System.out
				.println("Employee If Worked Monthly Earn = " + ((numberOfHours) * WAGE_PER_HOUR) * TOTAL_WORKING_DAYS);
		totalEmployeeWage = totalWorkingHours * WAGE_PER_HOUR;
		System.out.println("Total Employee Wage for Max Hours or Days reached is " + totalEmployeeWage);

	}

}