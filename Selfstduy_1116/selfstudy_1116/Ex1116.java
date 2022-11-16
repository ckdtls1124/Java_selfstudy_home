package selfstudy_1116;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class Ex1116 extends ShowTime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Type in your ID: ");
		String logID = input.next();

		System.out.print("Type in your PW: ");
		String logPW = input.next();

		System.out.print("Type in your name: ");
		String logName = input.next();

		input.close();
		System.out.println("Please wait a moment ... ");
		System.out.println(" ");
		
		String rawLog = logID.concat("&").concat(logPW).concat("&").concat(logName);
		String dataComparison = "ckdtls1124&charlieK&changshinkang";

		ShowTime a = new Ex1116();
		a.showLoggedTime();

		RandomEx1 lotto = new RandomEx1();
		int[] b=lotto.lotteryNum();
		
		if (rawLog.equals(dataComparison)) {
			System.out.println("Log in accepted.");
			System.out.print("This is random lottery number: ");
			for (int s : b) {
				if (s==b[5]) {
					System.out.println(s);
				} else {
					System.out.print(s + ",");
				}
			}
			System.out.println("\n");
			System.out.println("Time you logged in: " + a.timeNow);
		} else {
			System.out.println("Log in denied.");
		}

	}
}
