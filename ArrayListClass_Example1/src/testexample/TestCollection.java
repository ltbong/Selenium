package testexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student("Ravi", 20, 4744);
Student s2 = new Student("Nageshwar",25,1944);
Student s3 = new Student("Srinu",28,6244);
Student s4 = new Student("Ravi", 20, 4744);
ArrayList<Student> st = new ArrayList<Student>();
//LinkedList<Student> str = new LinkedList<Student>();
st.add(s1);
st.add(s2);
st.add(s3);
st.add(s4);
for(Student sf:st){
	System.out.println(sf.name+"  "+sf.age+"  "+sf.rollNo);
}
Iterator<Student> it = st.iterator();
while(it.hasNext()){
	Student sd =  it.next();
	System.out.println(sd.name+sd.age+sd.rollNo);
}
	}

}
