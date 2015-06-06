package testexample;

public class Student {
	String name;
	int age;
	int rollNo;
	Student(String n,int a,int r){
		name = n;
	    this.age =a;
	    this.rollNo = r;
	}
	public String toString()
	{
		return name;
	}
}
