package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al = new ArrayList<Student>();
al.add(new Student("Ravi",20,"Cricket")); 
al.add(new Student("Roger",24,"Tennis"));
al.add(new Student("Messi",19,"Football"));
System.out.println("Sorting based on age");
Collections.sort(al,new AgeComparator());
Iterator<Student> it = al.iterator();
while(it.hasNext()){
	Student st  = it.next();
	System.out.println(st.age+" "+st.name+" "+st.designation);
}
System.out.println("\nSorting based on name");
Collections.sort(al,new NameComparator());
Iterator<Student> it2 = al.iterator();
while(it2.hasNext()){
	Student st1 = it2.next();
	System.out.println(st1.name+" "+st1.age+" "+st1.designation);
}


	}

}
