package selfstudy_UIinterface;

public class Window {
	Button button1=new Button();
	Button button2=new Button();
	
	Button.OnClickListener listener=new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	public Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
