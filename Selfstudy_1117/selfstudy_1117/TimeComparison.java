package selfstudy_1117;

//import java.text.Simple/DateFormat;
import java.time.LocalDateTime;

public class TimeComparison {
	
	public boolean compareTime(int year, int month, int dayOfMonth, int hour, int minute) {
		
		LocalDateTime a=LocalDateTime.now();
		LocalDateTime b=LocalDateTime.of(year, month, dayOfMonth, hour, minute);
		if (b.isEqual(a)) {
			return true;
		} else {
			return false;
		}
	}
}
