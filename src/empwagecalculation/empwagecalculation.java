package empwagecalculation;

public class empwagecalculation {

	public static void main(String[] args) {

		System.out.println("WELCOME TO EMPLOYEE WAGE CALCULATION PROGRAM...");
		System.out.println("***********************************************");
		
		int isPresent = 1;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent) {
			System.out.println("Employee is present...");
		} else {
			System.out.println("Employee is absent...");
		}

	}

}
