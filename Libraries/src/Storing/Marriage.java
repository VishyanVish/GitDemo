package Storing;

public class Marriage {
int age=25;
private static Marriage M;
private Marriage() {
	System.out.println("got Married");
}
public static Marriage CreatObject(){
	if(M==null) {
	M=new Marriage();
	
}
	
	else {
		System.out.println("not created");
	}
	return M;
}
}