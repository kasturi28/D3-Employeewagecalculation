package empwagecalculation;

public class empwagecalculation {

	public static final int WAGE_PER_HOUR = 20;
	public static final int EMP_FULL_TIME = 1;
	public static final int EMP_PART_TIME = 2;
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int TOTAL_WORKING_HOURS_IN_MONTH = 100;

	public  int EmpWageCompany(String Company, int WagePerHour, int NumberOfWorkingDays, int TotalHoursinMonth) {
		/*
		this.Company = Company;
		this.WagePerHour = WagePerHour;
		this.NumberOfWorkingDays = NumberOfWorkingDays;
		this.TotalHoursinMonth = TotalHoursinMonth;
		*/
		 int numberOfHours = 0;
		 int empWagePerDay = 0;
		 int nHours=0;
	     int totalWorkDays = 0;
	     int totalWorkHours = 0;
		 int totalEmployeeWage =0;
		 
		while (totalWorkHours< TotalHoursinMonth && totalWorkDays <= NumberOfWorkingDays) {
			int isPresent = (int) Math.floor(Math.random()*10) %3;
			switch (isPresent) {
				case EMP_FULL_TIME :
					numberOfHours =8;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
				case EMP_PART_TIME :
					numberOfHours =4;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;

				default :
					numberOfHours = 0;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
					}

			}
			totalEmployeeWage= totalWorkHours * WagePerHour;
			System.out.println("Total Employee Wage for company : "+Company+" is "+ totalEmployeeWage);
		    return totalEmployeeWage;
	}
	
	 
	//Welcome Message
		public void  Welcome() {
		System.out.println("Welcome to Employee Wage Computation program");
		}

}