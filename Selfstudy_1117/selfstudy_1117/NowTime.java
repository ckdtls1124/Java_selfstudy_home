package selfstudy_1117;

import java.time.LocalDateTime;

public class NowTime {
	public static void main(String[] args) {
		
		LocalDateTime a=LocalDateTime.now();
		System.out.println(a);
		LocalDateTime b=LocalDateTime.of(2022, 11, 17, 23, 15);
		System.out.println(b);
		
	}
}
