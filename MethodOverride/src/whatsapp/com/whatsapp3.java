package whatsapp.com;

public class whatsapp3 extends whatsapp2 {
@Override
	void Display(){
		
		super.Display();
		System.out.println("Display of blue tick");
		
	}
	public static void main(String[] args) {
		whatsapp3 w=  new whatsapp3();
		w.Display();
	w.call();
	}
}