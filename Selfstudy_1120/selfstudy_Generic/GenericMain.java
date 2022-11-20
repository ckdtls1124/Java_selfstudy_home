package selfstudy_Generic;

public class GenericMain {
	
	public static void main(String[] args) {
		
		GenericExample<String> str1=new GenericExample<String>();
		
		str1.set("HI");
		System.out.println(str1.get());
		
		GenericExample<Integer> int1=new GenericExample<Integer>();
		int1.set(43949);
		System.out.println(int1.get());
		
		
	}
}
