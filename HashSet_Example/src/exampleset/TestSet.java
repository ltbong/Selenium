package exampleset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> si = new HashSet<String>();
//LinkedHashSet<String> si=new LinkedHashSet<String>();  
TreeSet<String> si = new TreeSet<String>();
si.add("Ravi");
si.add("Vijay");
si.add("Ravi");
si.add("Ajay");
	Iterator<String> it = si.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
