package vendingmachine_controller;

import java.util.Scanner;

import vendingmachine_calculate.CalculateMoney;
import vendingmachine_command.ExecuteCalculation;
import vendingmachine_productGiveOut.ProductGiveout;

public class ShowResult { 

	public static int Money;
	public static String Choice;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Put the money in: ");
		int inputMoney=input.nextInt();

		System.out.println("What would you like to drink?"
				+"\n"+"Press the number"
				+"\n"+"1.Coke 2.Dr.Pepper 3.Sprite"
				+"\n"+"1.5000 2.4500 3.4700");
		String choice=input.next();


		ShowResult.Money=inputMoney;
		ShowResult.Choice=choice;

//		check the money
		System.out.println("=====");
		ExecuteCalculation checkInputMoney=new MoneyInput();
		checkInputMoney.executeCal();
		
		System.out.println("=====");
//		Product give out
		ExecuteCalculation giveoutProduct=new ProductGiveout();
		giveoutProduct.executeCal();

		System.out.println("=====");
//		Balance shoe
		ExecuteCalculation balanceShow=new CalculateMoney();
		balanceShow.executeCal();

		
		
		
		
		
		input.close();
	}
}