package comparingobj;

public class Student {
int age;
public Student(int age) {
	this.age=age;
	
}
public boolean equals(Object obj) {
	Student s=(Student)obj;
	return this.age==s.age;
}
public static void main(String[] args) {
	Student s1=new Student(22);
	Student s2=new Student(22);
	 System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}
