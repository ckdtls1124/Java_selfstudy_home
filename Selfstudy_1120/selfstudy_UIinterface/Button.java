package selfstudy_UIinterface;

public class Button {
	public OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
}
