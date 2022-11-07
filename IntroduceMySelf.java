package selfstudy_1107_2;

public class IntroduceMySelf {
	public static void main(String[] args) {
		System.out.println("I would like to introduce myself.");
		
//		show data in static area
		Hair.iHavaHair();
		
		System.out.println("====================");
		Hair changShinHair=new Hair();
		
//		feature of my hair
		changShinHair.color="black";
		changShinHair.curliness="type2B";
		
//		introduce my hair
		changShinHair.myHairColor();
		changShinHair.myHairStyle();
		
		System.out.println("====================");
//		actions with my hair
		changShinHair.changeColor("pink");
		changShinHair.changeCurliness("type4A");
		
	}
}
