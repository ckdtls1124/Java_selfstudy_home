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
		 * ����: 00~08 �λ�: 09~12 ��õ: 13~15 ��⵵: 16~25 ������: 26~34 ��û�ϵ�: 35~39 ����: 40~41
		 * ��û����: 42~43, 45~47 ����: 96 ����ϵ�: 48~54 ���󳲵�: 55~64 ���ֱ�����: 65,66 �뱸: 67~69
		 * ���ϵ�: 70~81 ��󳲵�: 82~84, 86~91 ���: 85 ����: 92~95
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
