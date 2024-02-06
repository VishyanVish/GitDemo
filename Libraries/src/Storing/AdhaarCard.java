package Storing;

public class AdhaarCard {
	private static AdhaarCard ac;
private AdhaarCard() {
	System.out.println("Adharcard Created");
}
public static void CreatAdhaarcard(){
	if(ac==null) {
		System.out.println(ac);
	ac=new AdhaarCard();
	System.out.println(ac);
}
}
}