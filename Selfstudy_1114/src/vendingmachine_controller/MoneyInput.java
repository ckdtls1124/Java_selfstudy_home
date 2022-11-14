package vendingmachine_controller;

import vendingmachine_command.ExecuteCalculation;

public class MoneyInput implements ExecuteCalculation{

	@Override
	public void executeCal() {
		// TODO Auto-generated method stub
		if(ShowResult.Money<4500) {
			System.out.println("There's not much of money.\nYou should insert more money.");
		}
		else {
			System.out.println("Please wait a moment.\nProduct will be out shortly.");
		}
	}
	
}
