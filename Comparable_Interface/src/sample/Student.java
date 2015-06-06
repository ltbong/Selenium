package sample;

public  class Student implements Comparable{
	int rollNo;
	String name;
	int age;
	Student(int r,String n,int a){
		this.rollNo=r;
		this.name=n;
		this.age=a;
	}
	
	public int compareTo(Object obj){
		Student st =(Student) obj;
		
		if(age==st.age)
			return 0;
		else if (age>st.age)
			return 1;
		else
			return -1;
	}
	//@Override
	/*public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
*/


	
}
