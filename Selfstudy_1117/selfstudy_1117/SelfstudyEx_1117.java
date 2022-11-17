package selfstudy_1117;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfstudyEx_1117 {
	
	public static void main(String[] args) {
		System.out.println("Date and Time comparison machine");
		Scanner input=new Scanner(System.in);
		
		RuntimeCal time=new RuntimeCal();
		double a1=time.runtimeCal();

		try {
			System.out.print("Type in year: ");
			int year=input.nextInt();
			System.out.print("Type in month: ");
			int month=input.nextInt();
			System.out.print("Type in day: ");
			int dayOfMonth=input.nextInt();
			System.out.print("Type in hour: ");
			int hour=input.nextInt();
			System.out.print("Type in minute: ");
			int minute=input.nextInt();
			
			TimeComparison timeComapre=new TimeComparison();
			boolean result=timeComapre.compareTime(year, month, dayOfMonth, hour, minute);
			if (result) {
				System.out.println("The time and date is equal");			
			} else {
				System.out.println("No it's not the same");
			}
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("You typed wrong");
		}
		
		input.close();
		
//		runtime check point
		double a2=time.runtimeCal();
		System.out.println("Time it took: "+(a2-a1)+"s");
		
		
		
		

	}
}
