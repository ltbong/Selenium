package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student = new ArrayList<String>();
		student.add("Ravi");
		student.add("Vijay");
		student.add("Karthik");
		System.out.println(student.size());
		System.out.println(student.containsAll(student));
		System.out.println(student.equals(student));
		System.out.println(student.hashCode());
		System.out.println("\n");
		System.out.println("Element at 2nd position"+student.get(1));
		ListIterator<String> it = student.listIterator();
	    //Iterator<String> ir = student.iterator();
		System.out.println("traversing elements in forward direction...");  
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
	
		ListIterator<String> kt = student.listIterator();
		System.out.println("traversing elements in backward direction...");  
		while(kt.hasPrevious()){
			System.out.println(kt.previous());
		}

	}

}
