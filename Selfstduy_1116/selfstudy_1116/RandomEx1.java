package selfstudy_1116;

public class RandomEx1 {
	
	
	public int[] lotteryNum() {
		int[] lottoArr=new int[45];
		
		for (int i = 0; i < 45; i++) {
			lottoArr[i]=i+1;
		}
		
		int cage;
		for (int i = 0; i < 1000000; i++) {
			int ranNum=(int)((Math.random())*45);
			cage=lottoArr[ranNum];
			lottoArr[ranNum]=lottoArr[0];
			lottoArr[0]=cage;
		}
		
		int result[]=new int[6];
		for (int i = 0; i < 6; i++) {
			result[i]=lottoArr[i];
		}
		
		return 	result;
	}
	
	
	
	
}
