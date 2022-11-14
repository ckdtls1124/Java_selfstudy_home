package headMoving;

public class Head {
	
	public final String introdueMyHead="Hello, I will introduce my head.";
	protected String eyes;
	protected String hair;
	protected String nose;
	protected String mouth;
	protected String ear;
	protected String neck;
	
//	constructor
	public Head() {
		
	}
	
	public Head(String eyesWay) {
		this.eyes=eyesWay;
	}
	
	
//	methods
	
	public void neckMoving() {
		System.out.println("My neck is moving.");
	}
	public void eyesMoving(String eyes) {
		if(eyes!="") {
			System.out.println("My eyes are lookin "+eyes+".");
		}
		else {
			System.out.println("My eyes are blinking.");			
		}
	}
	public void noseMoving() {
		System.out.println("My nose is moving.");
	}
	public void mouthMoving() {
		System.out.println("My mouth is mumbling.");
	}
	public void earsMoving() {
		System.out.println("My ears are little moving.");
	} 
	
}

