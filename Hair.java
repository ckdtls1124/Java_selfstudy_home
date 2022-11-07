package selfstudy_1107_2;

public class Hair {
	
	
	public static void iHavaHair() {
		System.out.println("in case you didn't know, I have hair");
	}
	
	
//	initialize variables
	
	public String color;
//	black, brown, yellow, white, pink, blue
	
	public String curliness;
//	type2: wavy, (type2A~2c) type3:curly, (type3A~3C) type4:coily (type4A~type4C)
	
//	instance's methods
	
	
//	introduce my hair
	public void myHairColor() {
		System.out.println("My hair color is "+color);
	}

	public void myHairStyle() {
		System.out.println("My hair style is "+curliness);
	}
	
	
	
	
	
//	actions with my hair
	
	public void changeCurliness(String curliness) {	
		System.out.println("I will change my hair style to "+curliness);
	}

	public void changeColor(String color) {	
		System.out.println("I will change my hair color to "+color);
	}
	
	
	
	
}
