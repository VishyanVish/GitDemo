package vishwa.java;

public class demo {
public static void main(String[] args) {
	int v=18;
	do {
		v>>=3;
		System.out.println(v);
		
		if(v<=0)
			break;
	}while(true);
}
}
