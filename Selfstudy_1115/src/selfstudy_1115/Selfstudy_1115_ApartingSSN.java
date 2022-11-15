package selfstudy_1115;

import java.util.Scanner;

public class Selfstudy_1115_ApartingSSN {

	public static String ssnNum;

	public static void main(String[] args) {

		// insert SSN
		// 0 0 0 0 0 0 - 0 0 0 0 0 0 0
		// a | b | c d| e |f|g
		// a=year, b=month, c=date, d=sex, e=region, f=registered order, g=exception
		// checking code
		// e= 0 0 0 0
		// e= e1 | e1=city

		/*
		 * 서울: 00~08 부산: 09~12 인천: 13~15 경기도: 16~25 강원도: 26~34 충청북도: 35~39 대전: 40~41
		 * 충청남도: 42~43, 45~47 세종: 96 전라북도: 48~54 전라남도: 55~64 광주광역시: 65,66 대구: 67~69
		 * 경상북도: 70~81 경상남도: 82~84, 86~91 울산: 85 제주: 92~95
		 * 
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Type in your social security number: ");
		String ssnOrg = input.next();

		if (ssnOrg.charAt(6) == '-') {
			String ssn = ssnOrg.replaceAll("-", "");
		}
		String ssn = ssnOrg;

		Selfstudy_1115_ApartingSSN.ssnNum = ssn;
		

		
		GetInfos birthYear = new FindYearofBIrth();
		System.out.print("Your birth year is ");
		birthYear.executeCal();

		GetInfos birthMonth = new FindMonthofBirth();
		System.out.print("Your birth month is ");
		birthMonth.executeCal();

		GetInfos birthDate = new FindDateofBirth();
		System.out.print("Your birth date is ");
		birthDate.executeCal();

		GetInfos gender = new FindGender();
		gender.executeCal();
		System.out.println("You are "+FindGender.sex);

	}

}
