package Storing;

public class Student {
int age;
String name;
public Student(int age,String name) {
	this.age=age;
	this.name=name;
}
public String toString() {
	return age +name;
}
public static void main(String[] args) {
	Student s1=new Student(23, "tom");
	Student s2=new Student(23, "Jerry");
	Student [] s=new Student[2];  // array of type student
	s[0]=s1;
	s[1]=s2;
	for(int i=0;i<=s.length;i++) {
		System.out.println(s[i]);
	}
}
}
