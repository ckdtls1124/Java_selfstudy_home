package selfstudy_1115;

public class FindGender implements GetInfos{

	public static String sex;
	
	@Override
	public void executeCal() {
		// TODO Auto-generated method stub
		String a=Selfstudy_1115_ApartingSSN.ssnNum.substring(6);
		if (a.equals("1") || a.equals("3")) {
			FindGender.sex="male";
		} else if ((a.equals("2") || a.equals("4"))) {
			FindGender.sex="female";
		}
	}

}
