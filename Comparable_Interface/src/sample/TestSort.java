package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.rollNo+""+st.name+""+st.age);  
		  }

	}

}
