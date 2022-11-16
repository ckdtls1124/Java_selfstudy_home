package selfstudy_1116;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowTime {
	
	public String timeNow="";
	
	
	public void showLoggedTime() {
		Date now=new Date();
		SimpleDateFormat a=new SimpleDateFormat("hh:mm:ss");
		this.timeNow =a.format(now);		
	}
															
	
}
