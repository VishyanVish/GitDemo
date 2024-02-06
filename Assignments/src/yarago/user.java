package yarago;

import java.util.Scanner;

public class user {
	String FirstName;
	String LastName;
	String MobileNumber;
	String Adress;
	String Gender; 
	String Username;
	String Password;
	


	 public  user(String FirstName,String LastName,String MobileNumber,String Adress,String Gender,String Username,String Password) {
		 this.FirstName=FirstName;
		 this.LastName=LastName;
		 this.MobileNumber=MobileNumber;
		 this.Adress=Adress;
		 this.Gender=Gender;
		 this.Username=Username;
		 this.Password=Password;
		 
	 }
	 
	 @Override
	public String toString() {
		return "FirstName:  "+FirstName+"  LastName:"+LastName+"  MobileNumber:"+MobileNumber
				+" Adress:"+Adress+" Gender:"+Gender;
	}
	 
	 
	 
}