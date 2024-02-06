package cons.com;

import java.util.Scanner;

public class part2 {
	String name;
	int Salary;
	int id;
	public part2(String name,int Salary,int id) {
		this.name=name;
		this.Salary=Salary;
		this.id=id;
	
	System.out.println("Employe id is  :"+this.id+" Employe Name is: "+this.name+" Employe Salary is :"+this.Salary);
	}
void Display() {
	//System.out.println("Employe id is  :"+this.id+" Employe Name is: "+this.name+" Employe Salary is :"+this.Salary);
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String name =scan.nextLine();
	int id=scan.nextInt();
	int Salary =scan.nextInt();

	part2 P1=new part2(name,Salary,id);
	part2 P2=new part2(name,Salary,id);
	P1.Display();
	P2.Display();
	scan.close();
}


}
