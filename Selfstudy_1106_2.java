package org.selfstudy_1106.java;

public class Selfstudy_1106_2 {
	public static void main(String[] args) {
		System.out.println("Lottery number");
		
//		initialize the array of numbers
		int number_table[]=new int[45];
		
//		get the number range from 1 to 45;
		for(int i=0; i<45; i++) {
			number_table[i]=i+1;
		}
		
		
//		Math.random() method randomly selects double type including 0 to under 1.
		
//		double a = Math.random();
//		System.out.println(a);
		
//		System.out.println(random_num);
		
//		mix number table
//		when number was randomly selected, index 0's number goes to that number's index, and the selected index's number goes to index0
//		iterate it for 1000 times
		
		int carrier; // number carrier of randomly selected number
		for (int i = 0; i < 1000; i++) {
			
			int random_num = (int)(45*Math.random());
			carrier=number_table[random_num];
			number_table[random_num]=number_table[0];
			number_table[0]=carrier;
			
		}
			
		System.out.println("로또 번호는 하기와 같습니다.");
		for(int i=0; i<6; i++) {
			if (i==5) {
				System.out.print(number_table[i]);				
			} else {
				System.out.print(number_table[i]+",");
			}
		}
		
		
	}
}
