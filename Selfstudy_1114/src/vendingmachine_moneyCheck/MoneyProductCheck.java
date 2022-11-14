package vendingmachine_moneyCheck;

import vendingmachine_command.ExecuteCalculation;
import vendingmachine_controller.ShowResult;

public class MoneyProductCheck implements ExecuteCalculation{

	@Override
	public void executeCal() {
		// TODO Auto-generated method stub
		if(0<ShowResult.Money) {
			
		}
		else {
			System.out.println("Wrong input\nType in again please");
		}
	}
	
}
