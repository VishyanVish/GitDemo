
public class Department extends College {
String DepartName="Industrial Engineering";
void ConduLAB() {
	System.out.println("Department conducting lab");
}
public static void main(String[] args) {
	Department s= new Department();
	s.ConductExams();
	System.out.println("University name  "+s.UniversityName);
	System.out.println("----------------------------------------");
	s.ProvidePlace();
	System.out.println("College name "+s.CollegeName);
	System.out.println("----------------------------------------");
	s.ConduLAB();
	System.out.println("Department names "+s.DepartName);
}
}
