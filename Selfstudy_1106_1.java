package org.selfstudy_1106.java;

public class Selfstudy_1106_1 {
	public static void main(String[]args) {
		// Show a chart in such a form: <kor math science total average>
		
		int[][] score_table= {
				{100, 30, 53},
				{100, 34, 45},
				{65, 30, 80},
				{70, 21, 53},
				{23, 36, 43} };
		
		// initialize the sum of each subject
		int kor=0;
		int math=0;
		int science=0;
		
		
		System.out.println("order"+" "+"kor"+" "+"math"+" "+"sceince"+" "+"total"+" "+"average");
		System.out.println("==================================================");
	
		for (int i = 0; i < score_table.length; i++) {
			System.out.print(i+" ");
			
			int sum=0;
			double average=0;
			for (int j = 0; j < score_table[i].length; j++) {
				// print each subject's score
				System.out.print(score_table[i][j]+" ");
				
				// re initialize the sum of each subject
				kor = kor + score_table[i][0];
				math = math + score_table[i][1];
				science = science + score_table[i][2];
				
			}
			// sum of each elements of score_table[i]
			sum = kor + math + science;
			average=(double)(sum)/3;
			System.out.println(sum+" "+average);
			// print sum and average
			System.out.println((i+1)+"번째 학생 끝났습니다.");
		}
		
		
		
		//what I learned is that you should figure out first, which one iterates. And then draw a picture step by step
	}
}
